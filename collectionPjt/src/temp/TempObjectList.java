package temp;

public class TempObjectList {

	private Object[] nums;
	private int current;
	
	public TempObjectList() {
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

	public int size() {
		
		return current;
	}

	public void clear() {
		nums = new Object[3];
		current = 0;
		
	}

	public Object get(int i) {
		if (current <= i)
			throw new IndexOutOfBoundsException();
		return nums[i];
	}
	
}
