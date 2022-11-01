package br.com.labs.books.function;

import br.com.labs.books.domain.dto.BooksDTO;
import br.com.labs.books.service.BooksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.function.Supplier;

@Slf4j
@Component("booklist")
public class BookList implements Supplier<List<BooksDTO>> {
    @Autowired
    private BooksService booksService;

    @Override
    public List<BooksDTO> get() {
        log.info("Event list Book processing starts");
        return booksService.findAll();
    }
}
