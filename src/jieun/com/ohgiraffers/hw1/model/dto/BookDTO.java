package jieun.com.ohgiraffers.hw1.model.dto;

public class BookDTO {

	private int bNo;
	private int category;
	private String title;
	private String author;
	public BookDTO() {}
	public BookDTO(int category, String title, String author) {
	
		this.category = category;
		this.title = title;
		this.author = author;
	}
	protected int getbNo() {
		return bNo;
	}
	protected void setbNo(int bNo) {
		this.bNo = bNo;
	}
	protected int getCategory() {
		return category;
	}
	protected void setCategory(int category) {
		this.category = category;
	}
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected String getAuthor() {
		return author;
	}
	protected void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookDTO [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
	
	
	
	
	
	
	
}
