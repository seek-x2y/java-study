public class FactorialThreadTester()
{

	public static void main(String[] args) {
		System.out.println("main thread starts ");
		FactorialThread thread = new FactorialThread(10);
		thread.start();
		System.out.println("main thread ends");

	}
}