package loopDemo1;

public class bb {

	public static void main(String[] args) {
		// for
				for (int i = 5; i <= 50; i += 5) {
					System.out.println(i);
				}
				System.out.println("döngü bitti");

				// while
				int i = 1;
				while (i < 10) {
					System.out.println(i);
					i += 2;
				}
				System.out.println("while döngüsü bitti");

				// Do-While
				int j = 100;
				do {
					System.out.println("loglandı");
					System.out.println(j);
					j += 2;
				} while (j < 10);
				System.out.println("do-while döngüsü bitti");


	}

}
