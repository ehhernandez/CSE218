package queues;

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nElems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nElems = 0;
	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nElems == 0);
	}

	public boolean isFull() {
		return (nElems == maxSize);
	}

	public void insert(long value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = value;
		nElems++;
	}

	public long remove() {
		long temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nElems--;
		return temp;
	}
	
	public int size() {
		return nElems;
	}

}
