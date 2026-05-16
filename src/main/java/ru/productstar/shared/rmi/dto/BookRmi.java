package ru.productstar.shared.rmi.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookRmi implements Serializable {
    private Long id;
    private String inventoryNumber;
    private String title;
    private String author;
    private String publisher;
    private String publicationYear;
}
