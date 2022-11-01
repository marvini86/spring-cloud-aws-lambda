package br.com.labs.books.function;

import br.com.labs.books.domain.dto.BooksDTO;
import br.com.labs.books.service.BooksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Slf4j
@Component("bookcreation")
public class BookCreation implements Function<BooksDTO, BooksDTO> {
    @Autowired
    private BooksService booksService;

    @Override
    public BooksDTO apply(BooksDTO booksDTO) {
        log.info("Event creation Book processing starts");
        return booksService.save(booksDTO);
    }
}
