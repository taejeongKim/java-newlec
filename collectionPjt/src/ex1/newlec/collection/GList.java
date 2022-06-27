package ex1.newlec.collection;
// 제네릭 콜렉션
// T = Type. 아무거나 써도 된다. 두개이상 쓸수 있다.
public class GList<T> {

	private Object[] nums;
	private int current; // 현재 저장 위치
	private int capacity; // 저장 가능량
	private int amount; // 늘어나는 단위
	
	public GList() {
		//생성은 Object 클래스 사용
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity];
	}
	// 입/출력 시 T로 변환
	public void add(T num) {
		
		/* 가변형으로 수정 */
		if (capacity <= current) {
			Object[] temp = new Object[capacity + amount];
			for (int i=0; i<capacity; i++)
				temp[i] = nums[i];
			nums = temp;
			capacity += amount;
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
		current = 0;
		
	
	}

	public int size() {
		return current;
	}

	public T get(int index) {
		if (current <= index)
			throw new IndexOutOfBoundsException();
		return (T) nums[index];
	}

}
