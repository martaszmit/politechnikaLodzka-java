package zadanie1;

import java.util.Random;
import java.util.Scanner;

/*
 Napisz program losuj�cy liczb� z zakresu 0-100. Nast�pnie program pyta si� u�ytkownika, co to za liczba. 
 Je�eli u�ytkownik nie zgad�, dowiaduje si� czy wylosowana liczba jest wi�ksza, czy mniejsza od podanej. 
 Je�eli zgad�, dowiaduje si� ile wykona� pr�b i jest pytany o ochot� do dalszej gry.
 */
public class zadanie1 {

	public static void zagraj() {
		Random r = new Random();
		int randomNumber = r.nextInt(100) + 1;
		System.out.println("Podaj liczbę całkowitą z przedziału 0-100: ");
		Scanner scan = new Scanner(System.in);
		int n;

		int licznik = 0;
		while ((n = scan.nextInt()) != randomNumber) {
			if (n > randomNumber) {
				System.out.println(
						"Pudło! Podana liczba jest większa od wylosowanej, próbuj dalej!");
			} else {
				System.out.println(
						"Pudło! Podana liczba jest mniejsza od wylosowanej, próbuj dalej!");
			}
			licznik++;
		}
		System.out.println("Gratulacje. Zgadłeś za " + licznik + " razem!");

		System.out.println(
				"Chcesz zagrać kolejny raz? [Wciśnij 1 jeśli tak/0 jeśi nie]");
		int a = scan.nextInt();

		if (a == 1) {
			zagraj();
		} else {
			System.out.println("Jeszcze tu wrócisz :)");
		}
		scan.close();
	}

	public static void main(String[] args) {
		zagraj();
	}
}
