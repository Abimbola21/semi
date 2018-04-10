package edu.edgetech.semi.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;
    private String title;
    private String author;
    private int pages;
    private Date returnDate;


    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public void setVersion(Integer version) { this.version = version; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public int getPages() { return pages; }

    public void setPages(int pages) { this.pages = pages; }

    public Date getReturnDate() { return returnDate; }

    public void setReturnDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,14);
        this.returnDate = cal.getTime();
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book() {
    }
}
