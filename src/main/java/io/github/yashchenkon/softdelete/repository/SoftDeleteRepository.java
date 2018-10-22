package io.github.yashchenkon.softdelete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mykola Yashchenko
 */
public interface SoftDeleteRepository<T, ID> extends JpaRepository<T, ID> {
}
