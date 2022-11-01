package br.com.labs.books.service;

import br.com.labs.books.domain.dto.BooksDTO;

import java.util.List;

public interface BooksService {
    List<BooksDTO> findAll();
    BooksDTO save(BooksDTO post);
}
