package com.newlec.app.util;
/*
 * collection (콜렉션)을 직접 만들어 보자.
 * */
public class Program {

	public static void main(String[] args) {
		IntList list = new IntList();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.add(7);
		int num = list.get(0);
		System.out.printf("num : %d\n", num);
		
		// 아래는 예외발생
		num = list.get(1);
		System.out.printf("num : %d\n", num);
	}

}
