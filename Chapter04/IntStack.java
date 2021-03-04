package Chapter04;

public class IntStack {
	private int max; // 최대 용량값
	private int[] stk; // 본체 배열
	private int ptr; // 스택 포인터

	// 실행시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends Exception {
		public EmptyIntStackException() {};
	}

	// 실행시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends Exception {
		public OverflowIntStackException() {}
	}

	public IntStack(int max) {
		ptr = 0;
		this.max = max;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) 
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) 
			throw new EmptyIntStackException();
		
		return stk[--ptr];
	}

	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	public int indexof(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x)
				return i;
		}
		return -1;
	}

	public void clear() {
		ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	// 바닥 꼭대기 순
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

}
