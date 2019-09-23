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

    public Book getBookById(int id){
        for(Book book : books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }

    public boolean updateBook(int id, Book updatedbook){
        for(Book book : books){
            if(book.getId()==id){
                book.setName(updatedbook.getName());
                book.setAuthor(updatedbook.getAuthor());
                return true;
            }
        }
        return false;
    }

    public boolean deleteBook(int id){
        for(Book book : books){
            if(book.getId()==id){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
