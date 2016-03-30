import java.lang.reflect.Array;

class StackOfGPoint1{
	private final int defaultStackSize = 10;
	private int size;
	private int topStack;
	private GPoint<Integer>[] data;
	private static int nStack = 0;

	public StackOfGPoint1(){
		size = defaultStackSize;
		data = (GPoint[]) Array.newInstance(int.class, size);
		topStack = 0;
		nStack++;
	}
	public StackOfGPoint1 (int size){
		this.size = size;
		data = (GPoint[]) Array.newInstance(int.class, size);
		topStack = 0;
		nStack++;
	}
	public void Push(GPoint<Integer> p){
		topStack++;
		data[topStack] = p;
	}
	public GPoint<Integer>Pop(){
		topStack--;
		return data[topStack+1];
	}
	public int IsEmpty(){
		if (topStack==0) return 1;
		else return 0;
	}
	public int IsFull(){
		if (topStack==size) return 1;
		else return 0;
	}
	public static int NumStackObj(){
		return nStack;
	}
}