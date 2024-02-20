package com.cis.batch33.library.controller;

import com.cis.batch33.library.model.Book;
import com.cis.batch33.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // GET all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // GET a book by ID
    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable Long bookId) {
        return bookService.getBookById(bookId);
    }

    // POST a new book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // PUT/update a book by ID
    @PutMapping("/{bookId}")
    public Book updateBook(@PathVariable Long bookId, @RequestBody Book book) {
        return bookService.updateBook(bookId, book);
    }

    // DELETE a book by ID
    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
    }
}
