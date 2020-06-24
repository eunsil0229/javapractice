package com.kita.first.level3;

public class BoardTest {
	public static void main(String[] args) {
		
		BoardVO bv1 = new BoardVO("제목1", "내용1", 1);
		BoardVO bv2 = new BoardVO();
		
		System.out.println(bv1.getTitle());
		bv1.setTitle("제목2");
		bv1.setContent("하하");
		bv1.setWriteID(35);
		
		System.out.println(bv1.getTitle());
		System.out.println(bv1.getContent());
		System.out.println(bv1.getWriteID());
		
	}

}
