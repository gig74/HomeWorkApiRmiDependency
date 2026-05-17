package ru.productstar.shared.rmi.service;

import ru.productstar.shared.rmi.dto.BookRmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BookServiceRmi extends Remote {
    BookRmi createBook(BookRmi book) throws RemoteException;
    List<BookRmi> getAllBooks() throws RemoteException;
    BookRmi getBookById(Long id) throws RemoteException;
    List<BookRmi> searchBooks(String inventoryNumberPattern, String titlePattern, String authorPattern) throws RemoteException;
    BookRmi updateBook(Long id, BookRmi bookDetails) throws RemoteException;
    void deleteBook(Long id) throws RemoteException;
    long getBookCount() throws RemoteException;
}
