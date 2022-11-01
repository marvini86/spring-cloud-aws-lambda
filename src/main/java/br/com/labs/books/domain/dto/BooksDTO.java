package br.com.labs.books.domain.dto;

import lombok.Data;

import java.util.HashSet;

@Data
public class BooksDTO {
    private String id;
    private String title;
    private String ISBN;
    private HashSet<String> authors;
}

