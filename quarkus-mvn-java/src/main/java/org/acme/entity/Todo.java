package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Todo extends PanacheEntity {

    @NotBlank
    @NotEmpty
    public String title;

    public String description;

    @Min(0) @Max(5)
    public Integer priority;
}
