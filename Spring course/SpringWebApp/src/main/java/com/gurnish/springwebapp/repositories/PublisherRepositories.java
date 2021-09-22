package com.gurnish.springwebapp.repositories;

import com.gurnish.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher,Long> {
}
