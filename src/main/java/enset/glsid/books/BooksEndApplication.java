package enset.glsid.books;

import enset.glsid.books.dao.BookRepository;
import enset.glsid.books.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.time.LocalDate;

@SpringBootApplication
public class BooksEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BooksEndApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;


	private void initBooks(){
		for(int i = 1; i<=10; i++){
			Book book = new Book();
			book.setTitle("book"+i);
			book.setDescription("description"+i);
			book.setYear(LocalDate.now().plusYears(i));
			bookRepository.save(book);
		}
	}

	@Override
	public void run(String... args) throws Exception {

	    repositoryRestConfiguration.exposeIdsFor(Book.class);

		initBooks();

	}
}
