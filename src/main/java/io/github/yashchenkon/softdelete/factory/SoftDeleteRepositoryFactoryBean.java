package io.github.yashchenkon.softdelete.factory;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import io.github.yashchenkon.softdelete.repository.SoftDeleteRepository;

/**
 * @author Mykola Yashchenko
 */
public class SoftDeleteRepositoryFactoryBean<T extends SoftDeleteRepository<S, ID>, S, ID> extends JpaRepositoryFactoryBean<T, S, ID> {

    public SoftDeleteRepositoryFactoryBean(final Class<? extends T> repositoryInterface) {
        super(repositoryInterface);
    }
}
