package com.gurnish.springwebapp.repositories;

import com.gurnish.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
////this is our repo to fill books
public interface BookRepositories extends CrudRepository<Book,Long> {
}
