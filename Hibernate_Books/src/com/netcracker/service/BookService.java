package com.netcracker.service;

import com.netcracker.model.Book;
import com.netcracker.model.Contact;

import java.util.List;

public interface BookService {

    void saveBook(Book book);

    List<Book> findAllBooks();

    Book findBookById(int id);

    void deleteBookById(int id);

}
