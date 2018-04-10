package edu.edgetech.semi.repositories;

import edu.edgetech.semi.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Integer> {

   List<Book> findByTitle(String type);
}
