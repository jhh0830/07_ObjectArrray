package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	
	// 필드부 - 도서명, 저자명, 가격, 출판사명
	private String title;
	private String publisher;
	private String author;
	private int price;

	// 생성자부
	// 기본생성자
	public  Book() {}
	// 모든 필드에 대해 매개변수로 가지는 생성자
	public Book( String title,
				 String author,
				 int price,
				 String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
		
	}
	
	//메소드부
	// setter 메소드들
	public void setTitle(String title) {
		this.title = title;
		
	}
	
	public void setAuthor(String author) {
		this.author = author;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//getter 메소드들
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	// information 메소드
	public String information() {
		return title + ", " + author + ", " + price + " ," + publisher;
		
	}
		
}
