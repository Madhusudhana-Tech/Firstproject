package com.Entity.Entitytask.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="UserName")
public class Entitytask3 {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
private String bookName;
private String author;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

}
