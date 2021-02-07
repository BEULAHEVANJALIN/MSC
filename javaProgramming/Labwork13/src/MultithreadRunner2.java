class Task_1 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask_1 Started");
		for(int i = 1; i <= 20; i++)
			System.out.print(i + "  ");
		System.out.println("\nTask_1 completed");
	}
}
public class MultithreadRunner2 {

	public static void main(String[] args) {
		//TASK_1
		Task_1 task_1 = new Task_1();
		Thread task_1Thread = new Thread(task_1);
		task_1Thread.start();
		
		//TASK_2
		System.out.println("\nTask_2 Started");
		for(int i = 21; i <= 40; i++)
			System.out.print(i + ",");
		System.out.println("\nTask_2 completed");
	}

}