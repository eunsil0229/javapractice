package com.kita.first.level3;

public class BoardVO {
	
	private String title;
	private String content;
	private int writeID;	// 내 번호
	
	public BoardVO() {
		// super();
	}
	
	public BoardVO(String title, String content, int writeID) { 
		this.title = title;
		this.content = content;
		this.writeID = writeID;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setWriteID(int writeID) {
		this.writeID = writeID;
	}
	
	
	
	
	public String getTitle() {
		return this.title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public int getWriteID() {
		return this.writeID;
	}
	
	
}
