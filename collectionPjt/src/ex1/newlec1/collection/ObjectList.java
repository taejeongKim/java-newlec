package ex1.newlec1.collection;

public class ObjectList {

	private Object[] nums;
	private int current; 
	
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
		nums = new Object[3];
		current = 0;
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
