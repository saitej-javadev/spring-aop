package com.saitej.springaop.service;

public interface BookService {
     void saveBook(String book);
     void getBooks();
     void deleteBook(Long id);
}
