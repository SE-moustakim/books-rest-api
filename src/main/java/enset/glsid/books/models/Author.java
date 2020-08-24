package enset.glsid.books.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthday;
    @OneToMany(mappedBy = "author")
    private Collection<Book> books;

}
