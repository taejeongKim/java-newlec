package ex17.practice;

public class P02_IfinFor {

	public static void main(String[] args) {
		// for�� ���� if��
		// �ݺ� �߿� ���� ó��
		
		
		// A,B,C,D,E, ���
		
		for (int i = 0; i < 5; i++)
			System.out.printf("%c, ", 'A'+i);
		
		System.out.println();
		System.out.println("---------------");
		
		// A,B,C,D,E, ���� ������ �޸�(,)����
		
		for (int i = 0; i < 5; i++)
			// if .. else���� �� �����̹Ƿ� �߰�ȣ{}�� �� �ᵵ �ȴ�.
			if (i==4) 	// if, else if ���� Ư���� ����.
				System.out.printf("%c", 'A'+i);
			else  		// if������ else �� Ư������ ���� ��κ��� ��츦 ���ϰ�...
				System.out.printf("%c, ", 'A'+i);
		
		System.out.println();
		System.out.println("---------------");
		
		// A,B,C,D,E, ���� ������ �޸�(,)����
		// Ȧ����° ���� ��ĭ ó��
		
		for (int i = 0; i < 5; i++)
			// if�� �� ������ �ִ� ���� ���� Ư���� ���, �幮 �����
			if (i==4) 	
				System.out.printf("%c", 'A'+i);
			else if (i%2==0)
				System.out.printf("%c, ", ' ');
			else  		
				System.out.printf("%c, ", 'A'+i);
	}

}
