package org.acme.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;
import org.acme.entity.Todo;

@ResourceProperties(hal = true, path = "/todo")
public interface TodoResource extends PanacheEntityResource<Todo, Long> {
}
