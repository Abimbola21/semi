package edu.edgetech.semi.startup;

import edu.edgetech.semi.entities.Book;
import edu.edgetech.semi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class Startup implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private BookService bookService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
       createBook("The Complete Reference", "Herbert Schildt",800);
       createBook("Java Programming", "WikiBooks",750);
       createBook("Pure JSP", "James GoodWill",1170);
       createBook("Mastering Java", "Edward Lavieri",1050);
       createBook("Android Programming", "Packt",880);
    }

    private void createBook(String title, String author, int pages) {
        Book book = new Book(title, author,pages);
        bookService.save(book);

    }

}
