/*
 * 3���� 7���� ���ڸ� ���Ϸ��� ...
 * sn = n(a+l)/2
 *    = �׼�(���� + ����)/2
 * */

package ex10.control.for_example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int total = 0;
		for (int i=0; i<5; i++) {
			total += 3+i;
		}
		
		total = 5*(3+7)/2;
				
		System.out.printf("total: %d", total);
		
	}
}