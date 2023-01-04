package lambdas;

public class Threads {

	public static void main(String[] args) {
		// thread é um processo que pode ser executado paralelamente
		
		Runnable trabalho1 = new TrabalhoRunnable();
		
		//seria uma classe anonima.
		Runnable trabalho2 = new Runnable() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		};
		
		Runnable trabalho3 = () ->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Tarefa #03");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
			}
		};
		/*
		 * Você consegue usar todos os beneficios de ter lambdas expression
		 * ou memsmo usar uma referencia por método
		 */
		
		Runnable trabalho4 = Threads::trabalho3;
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		Thread t4 = new Thread(trabalho4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #04");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
