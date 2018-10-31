package io.github.yashchenkon.softdelete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.yashchenkon.softdelete.entity.BaseEntity;

/**
 * @author Mykola Yashchenko
 */
public interface SoftDeleteRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID> {
}
