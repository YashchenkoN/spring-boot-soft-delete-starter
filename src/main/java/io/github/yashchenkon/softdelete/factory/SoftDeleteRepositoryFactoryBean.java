package io.github.yashchenkon.softdelete.factory;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import io.github.yashchenkon.softdelete.repository.SoftDeleteRepository;

/**
 * @author Mykola Yashchenko
 */
public class SoftDeleteRepositoryFactoryBean<T extends SoftDeleteRepository<S, ID>, S, ID> extends JpaRepositoryFactoryBean<T, S, ID> {

    public SoftDeleteRepositoryFactoryBean(final Class<? extends T> repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(final EntityManager entityManager) {
        return new SoftDeleteRepositoryFactory(entityManager);
    }
}
