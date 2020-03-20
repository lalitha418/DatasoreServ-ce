import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
	public static void main(String[] args) {
		Queue<int[]> que = new ArrayBlockingQueue<>(3);

//		que.add("java");
//		que.add("c");
//		que.add("javas");
//		que.offer("python");
		System.out.println(que);
	}
}
