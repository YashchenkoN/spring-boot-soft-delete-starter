package io.github.yashchenkon.softdelete.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * @author Mykola Yashchenko
 */
public class SoftDeleteRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> {

    private final EntityManager entityManager;

    public SoftDeleteRepositoryImpl(final JpaEntityInformation<T, ?> entityInformation, final EntityManager entityManager) {
        super(entityInformation, entityManager);

        this.entityManager = entityManager;
    }

    public SoftDeleteRepositoryImpl(final Class<T> domainClass, final EntityManager em) {
        this(JpaEntityInformationSupport.getEntityInformation(domainClass, em), em);
    }
}
