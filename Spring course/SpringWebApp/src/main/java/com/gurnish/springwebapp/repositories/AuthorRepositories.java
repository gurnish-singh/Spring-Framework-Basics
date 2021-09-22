package com.gurnish.springwebapp.repositories;

import com.gurnish.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
/////this is our repo to fill authors
public interface AuthorRepositories extends CrudRepository<Author,Long> {
}
