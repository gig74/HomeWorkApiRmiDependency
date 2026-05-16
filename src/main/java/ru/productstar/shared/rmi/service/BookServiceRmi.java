package ru.productstar.shared.rmi.service;

import ru.productstar.shared.rmi.dto.BookRmi;

import java.rmi.Remote;
import java.util.List;

public interface BookServiceRmi extends Remote {
    BookRmi createBook(BookRmi book);
    List<BookRmi> getAllBooks();
    BookRmi getBookById(Long id);
    List<BookRmi> searchBooks(String inventoryNumberPattern, String titlePattern, String authorPattern);
    BookRmi updateBook(Long id, BookRmi bookDetails);
    void deleteBook(Long id);
    long getBookCount();
}
