package br.com.labs.books.repository;

import br.com.labs.books.domain.entity.Books;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface BooksRepository extends CrudRepository<Books, String> {
}
