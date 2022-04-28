package com.saitej.springaop.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
//@Slf4j
@Service
public class BookServiceImpl implements BookService {


    @Override
    public void saveBook(String book) {
        System.out.println("BookServiceImpl.saveBook");
    //    log.info("saveBook method executed");
    }

    @Override
    public void getBooks() {
        System.out.println("BookServiceImpl.getBooks");
     //   log.info("getBooks method executed");

    }

    @Override
    public void deleteBook(Long id) {
        if(id>5L) {
            throw new IllegalArgumentException(id+"is not an valid id");
        }
    }
}
