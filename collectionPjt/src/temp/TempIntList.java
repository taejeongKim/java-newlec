package temp;

public class TempIntList {

	private int[] nums;
	private int current;
	
	public TempIntList() {
		nums = new int[3];
		current = 0;
	}
	
	public void add(int num) {
		int amount = 5;
		int capa = nums.length;
		if (current >= capa) {
			int[] temp = new int[current + amount];
			for (int i=0; i<current; i++)
				temp[i] = nums[i];
			nums = temp;
		}
		
		nums[current] = num;
		current++;
	}

	public int size() {
		
		return current;
	}

	public void clear() {
		nums = new int[3];
		current = 0;
		
	}

	public int get(int i) {
		if (current <= i)
			throw new IndexOutOfBoundsException();
		return nums[i];
	}
	
}
