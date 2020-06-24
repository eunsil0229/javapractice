package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(int i = 0; i<list.size(); i++) {
			int val = (int) list.get(i);
			System.out.print(val + ", ");
		}
		
		Object obj = 1;
		obj = "aaa";
		obj = 1.1;
		
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		for(int i = 0; i<list.size(); i++) {
			int val = (int) list1.get(i); // 여기서 (int) 생략 가능해짐
			System.out.print(val + ", ");
		}
		
		for(Object val : list) {
			System.out.print((int)val + ", ");
		}
		
		
		System.out.println("\n----------------------");
		
		int i=0;
		for(int val : list1) {
			System.out.printf("i : %d, %d\n", i++, val);
		}
		System.out.println("----------------------");
		
		list1.remove(list1);
		
		System.out.println();
		for(int val : list1) {
			System.out.println(val + ", ");
		}
		
		
	}

}
