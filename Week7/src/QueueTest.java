
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueOfIntegers que = new QueueOfIntegers();
		for(int i = 0; i<20; ++i) {
			que.enqueue(i);
		}
		while(!(que.empty())) {
			System.out.printf("%d ",  que.dequeue());
		}
	}

}
