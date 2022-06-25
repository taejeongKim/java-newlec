package temp;

public class GList <T> {

	private Object[] nums;
	private int current;
	
	public GList() {
		nums = new Object[3];
		current = 0;
	}

	public void add(T num) {
		
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

	public T get(int i) {
		if (current <= i)
			throw new IndexOutOfBoundsException();
		return (T) nums[i];
	}
	
}
