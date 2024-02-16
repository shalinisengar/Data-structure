package Queue;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
		
		Queue qq = new Queue();
		qq.Enqueue(10);
		qq.Enqueue(20);
		qq.Enqueue(30);
		qq.Enqueue(40);
		qq.Display();
		System.out.println(qq.Dequeue());
		System.out.println(qq.Dequeue());
		qq.Display();
		qq.Enqueue(50);
		qq.Enqueue(60);
		qq.Enqueue(70);
		qq.Display();

	}
}
