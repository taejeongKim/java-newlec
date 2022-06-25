package com.newlec.app.util;

public class ObjectList {

	private Object[] nums;
	private int current; // 현재 저장 위치
	
	public ObjectList() {
		nums = new Object[3];
		current = 0;
	}
	
	public void add(Object num) {
		
		int amount = 5;
		int capa = nums.length;
		if (current >= capa) {
			Object[] temp = new Object[current + amount];
			for (int i=0; i<current; i++)
				temp[i] = nums[i];
			nums = temp;
		}
		
		nums[current] = num;
		current++;
		
	}

	public void clear() {
		/* 배열 비우기 */
		// 아래 두 코드 모두 배열을 비우게 된다.
		// 그러나, current만 0으로 해 줘도 동일한 효과가 난다.
//		for(int i=0; i<current; i++)
//			nums[i] = 0;
//		nums = new int[3];
//		current = 0;
		
	
	}

	public int size() {
		return current;
	}

	public Object get(int index) {
		if (current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}

}
