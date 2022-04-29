package com.kesavan.spring.bootstrap;

import com.kesavan.spring.entities.Author;
import com.kesavan.spring.entities.Book;
import com.kesavan.spring.entities.Publisher;
import com.kesavan.spring.entities.repositories.AuthorRepository;
import com.kesavan.spring.entities.repositories.BookRepository;
import com.kesavan.spring.entities.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapper implements CommandLineRunner {

    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;

    private final PublisherRepository publisherRepo;

    public BootStrapper(BookRepository bookRepo, AuthorRepository authorRepo, PublisherRepository publisherRepo){
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("Kesavan", "Murali");
        Author author2 = new Author("Saravanan", "P");

        Book book1 = new Book("BlockChain Essentials");
        Book book2 = new Book("BlockChain Needed");

        Publisher publisher1 = new Publisher("Pub1", "Chennai");
        Publisher publisher2 = new Publisher("Pub2", "Bangalore");

        authorRepo.save(author1);
        authorRepo.save(author2);

        bookRepo.save(book1);
        bookRepo.save(book2);

        publisherRepo.save(publisher1);
        publisherRepo.save(publisher2);
    }
}
