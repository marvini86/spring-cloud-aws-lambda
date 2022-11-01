package br.com.labs.books.service.impl;

import br.com.labs.books.domain.dto.BooksDTO;
import br.com.labs.books.domain.entity.Books;
import br.com.labs.books.repository.BooksRepository;
import br.com.labs.books.service.BooksService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<BooksDTO> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).map(x -> modelMapper.map( x, BooksDTO.class)).collect(Collectors.toList());
    }

    @Override
    public BooksDTO save(BooksDTO book) {
        Books entity = modelMapper.map( book , Books.class);
        return modelMapper.map( repository.save(entity) , BooksDTO.class);
    }


}
