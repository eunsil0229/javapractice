package com.kita.first.level3;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		for(int i=0; i<list.arr.length; i++) {
			System.out.println(list.arr[i]);
		}
		System.out.println("-----------------");
		list.add(15);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int i=0; i<list.arr.length; i++) {
			System.out.println(list.arr[i]);
		}
		
		int len = list.size();
		
		System.out.println(len);
		
		System.out.println("-----------------");
		
		int val = list.get(1);
		System.out.println(val);
		val = list.get(0);
		System.out.println(val);
		
		System.out.println("-----------------");
		
		list.remove(1);
		for(int i=0; i<list.arr.length; i++) {
			System.out.println(list.arr[i]);
		}
		
		System.out.println("-----------------");
		list.add(2, 100);
		for(int i=0; i<list.arr.length; i++) {
			System.out.println(list.arr[i]);
		}
		
		System.out.println("-----------------");
		int delval = list.remove();
		
		System.out.println(delval);
		
	}	
}




class MyList {
		
	int[] arr  ; // = new int[0];
	
	
	MyList() {
		// arr = new int[0]; 이거 대신에
		init();
	}
	
	// 이렇게 자주 씀
	private void init() {
		arr = new int[0];
	}
	
	void add(int num) {
		int[] arr2 = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr.length] = num;
		arr = arr2;
	}
	
	int size() {
		return arr.length;
	}
	
	int get(int num) {
		return arr[num];
	}
	
	/*
	void remove() {
		int[] arr2 = new int[arr.length-1];
		for(int i=0; i<arr2 .length; i++) {
			arr2[i] = arr[i];
		}
		arr = arr2;	
	}
	*/
	
	int remove() {
		int[] arr2 = new int[arr.length-1];
		int num = arr[arr.length-1]; 
		for(int i=0; i<arr2 .length; i++) {
			arr2[i] = arr[i];
		}
		arr = arr2;
		return num;	
		// return remove(arr.length -1);
	}
	
	
	// 매개변수로 idx를 입력하면 idx번 인덱스가 삭제되는 메소드
	int remove(int idx) {
		int[] arr2 = new int[size()-1];
		int num = arr[idx];
		for(int i=0; i<arr2.length; i++) {
			/*
			if(i < num) {
				arr2[i] = arr[i];
			} else {
				arr2[i] = arr[i+1];
			}
			*/
			arr2[i] = (i < idx) ? arr[i] : arr[i+1];
			
			// for문의 범위가 arr.length일 경우
			// arr2[i-1] = arr[i];
			// arr2[(i<idx) ? i : i-1] = arr[i];
		}
		arr = arr2;
		return num;
	}
	
	
	// 매개변수로 idx와 num을 입력하면 idx번 인덱스에 num이 추가되는 메소드
	void add(int idx, int num) {
		int[] arr2 = new int[size()+1];
		for(int i=0; i<arr2.length; i++) {
			if(i < idx) {
				arr2[i] = arr[i];
			} else {
				arr2[i] = arr[i-1];
			}
			// arr2[i] = (i < idx) ? arr[i] : arr[i-1];
			// i<arr.length일 경우
			// arr2[i+1] = arr[i];
			// arr2[i < idx ? i : i + 1] = arr[i];
			
		}
		arr2[idx] = num;
		arr = arr2;
	}
	
	
	
	
	
	
}