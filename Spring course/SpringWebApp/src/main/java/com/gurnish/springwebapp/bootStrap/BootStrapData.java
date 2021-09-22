package com.gurnish.springwebapp.bootStrap;

import com.gurnish.springwebapp.domain.Author;
import com.gurnish.springwebapp.domain.Book;
import com.gurnish.springwebapp.domain.Publisher;
import com.gurnish.springwebapp.repositories.AuthorRepositories;
import com.gurnish.springwebapp.repositories.BookRepositories;
import com.gurnish.springwebapp.repositories.PublisherRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component/////Spring managed component
public class BootStrapData implements CommandLineRunner {
//    Command Line Runner is an interface. It is used to execute the code after the Spring Boot application started.
    private final AuthorRepositories authorRepositories;
    private final BookRepositories bookRepositories;
    private final PublisherRepositories publisherRepositories;

    public BootStrapData(AuthorRepositories authorRepositories, BookRepositories bookRepositories, PublisherRepositories publisherRepositories) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
        this.publisherRepositories = publisherRepositories;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("started in bootstrap");

        //adding publisher
        Publisher publisher=new Publisher("SFG publishing","malerkotla","Punjab");
        publisherRepositories.save(publisher);
        System.out.println("publishers"+ publisherRepositories.count());


        Author eric=new Author("Eric","Singh");
        Book ddd=new Book("Domain Driven Design","12345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepositories.save(eric);////to save it to the H2 database
        bookRepositories.save(ddd);
        publisherRepositories.save(publisher);

        ///one more example
        Author rod=new Author("Rod","Johnson");
        Book EJB=new Book("J2EE Development without EJB","123456");
        rod.getBooks().add(EJB);
        EJB.getAuthors().add(rod);
        EJB.setPublisher(publisher);
        publisher.getBooks().add(EJB);

        authorRepositories.save(rod);
        bookRepositories.save(EJB);
        publisherRepositories.save(publisher);



        ////checking if it works

        System.out.println("Number of books in repo: "+bookRepositories.count());
        System.out.println("Publisher has "+publisher.getBooks().size()+" number of books");

    }
}
