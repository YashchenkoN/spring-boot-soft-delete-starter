package io.github.yashchenkon.softdelete.factory;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

/**
 * @author Mykola Yashchenko
 */
public class SoftDeleteRepositoryFactory extends JpaRepositoryFactory {

    public SoftDeleteRepositoryFactory(final EntityManager entityManager) {
        super(entityManager);
    }
}
