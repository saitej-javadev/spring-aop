package com.saitej.springaop.bootstrap;

import com.saitej.springaop.model.Book;
import com.saitej.springaop.service.BookService;
import com.saitej.springaop.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        loadBook();

        bookService.getBooks();
        bookService.saveBook("Think and Grow Rich");
        bookService.deleteBook(4L);

    }

    private void loadBook() {
        Book book = new Book();
        book.builder().id(1L).name("Think and Grow Rich").author("Napolean Hill").build();

        Book book1 = new Book();
        book1.builder().id(2L).name("Think Like a Monk").author("Jay Shetty").build();

        System.out.println("Book data Loaded");


    }
}
