package io.github.yashchenkon.softdelete.factory;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;

import io.github.yashchenkon.softdelete.entity.BaseEntity;
import io.github.yashchenkon.softdelete.repository.SoftDeleteRepository;
import io.github.yashchenkon.softdelete.repository.SoftDeleteRepositoryImpl;

/**
 * @author Mykola Yashchenko
 */
public class SoftDeleteRepositoryFactory<T extends BaseEntity> extends JpaRepositoryFactory {

    private final EntityManager entityManager;

    public SoftDeleteRepositoryFactory(final EntityManager entityManager) {
        super(entityManager);

        this.entityManager = entityManager;
    }

    @Override
    protected Object getTargetRepository(final RepositoryInformation information) {
        if (isSoftDeleteRepository(information.getRepositoryInterface())) {
            return new SoftDeleteRepositoryImpl<>((Class<T>)information.getDomainType(), entityManager);
        }

        return super.getTargetRepository(information);
    }

    @Override
    protected Class<?> getRepositoryBaseClass(final RepositoryMetadata metadata) {
        if (isSoftDeleteRepository(metadata.getRepositoryInterface())) {
            return SoftDeleteRepositoryImpl.class;
        }

        return super.getRepositoryBaseClass(metadata);
    }

    private boolean isSoftDeleteRepository(final Class<?> clazz) {
        return SoftDeleteRepository.class.isAssignableFrom(clazz);
    }
}
