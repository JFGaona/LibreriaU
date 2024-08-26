package com.libreria.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;

    @Column(name = "ISBN", nullable = false, unique = true)
    private String isbn;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Price", nullable = false)
    private BigDecimal price;

    @Column(name = "ImageURL", nullable = false)
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "GenreID", nullable = false)
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "AuthorID", nullable = false)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "PublisherID", nullable = false)
    private Publisher publisher;

    @Column(name = "PublicationDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @Column(name = "Stock", nullable = false)
    private int stock;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
