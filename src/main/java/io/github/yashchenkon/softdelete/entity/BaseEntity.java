package io.github.yashchenkon.softdelete.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Mykola Yashchenko
 */
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(name = "active", nullable = false)
    private boolean active;

}
