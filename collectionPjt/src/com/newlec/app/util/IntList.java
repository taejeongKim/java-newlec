package com.newlec.app.util;

public class IntList {

	private int[] nums;
	private int current; // 현재 저장 위치
	
	public IntList() {
		nums = new int[3];
		current = 0;
	}
	
	public void add(int num) {
		
		/* 가변형 배열 */
		int amount = 5;
		int capa = nums.length;
		if (current >= capa) {
			int[] temp = new int[current + amount];
			for (int i=0; i<current; i++)
				temp[i] = nums[i];
			nums = temp;
		}
		//-------------------
		
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
		current = 0;
		
	
	}

	public int size() {
		return current;
	}

	public int get(int index) {
		if (current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}

}
