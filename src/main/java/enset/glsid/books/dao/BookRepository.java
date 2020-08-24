package enset.glsid.books.dao;

import enset.glsid.books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RepositoryRestResource
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {
}
