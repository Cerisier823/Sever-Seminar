package com.ec.springagain.services;

import com.ec.springagain.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    private ArrayList<Book> books;

    public BookService(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public Book getBookById(String id){
        for(Book book : books){
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    public boolean updateBook(String id, Book updatedbook){
        for(Book book : books){
            if(book.getId().equals(id)){
                book.setName(updatedbook.getName());
                book.setAuthor(updatedbook.getAuthor());
                return true;
            }
        }
        return false;
    }

    public boolean deleteBook(String id){
        for(Book book : books){
            if(book.getId().equals(id)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
