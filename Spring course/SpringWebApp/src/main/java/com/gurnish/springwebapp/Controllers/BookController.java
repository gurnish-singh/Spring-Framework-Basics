package com.gurnish.springwebapp.Controllers;

import com.gurnish.springwebapp.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//// to tell that it's a Spring MVC
public class BookController {
    private final BookRepositories bookRepositories;////dependency injection

    public BookController(BookRepositories bookRepositories) {
        this.bookRepositories = bookRepositories;
    }

   ////whenever there is a request coming for books this will do
    ////remember whenever there is a HTTP request we need to return a model
    ////here we are making a model for returning Books according to books pojo
    ////we have stored our books in booksrepository
    /// spring makes it easy to return that model according to values in repo.
   @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepositories.findAll());//gives us list of books
        ////so now we have the data
        /////we will return our model to the view  which is list
        return "books/list";

        ////now this model will get to the view layer
    }
}
