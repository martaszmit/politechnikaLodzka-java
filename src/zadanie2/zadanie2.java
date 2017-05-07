package zadanie2;
/*
 Napisz program, kt�ry pobiera dwie liczby oraz �a�cuch znak�w z wiersza polece� (czyli jako parametry przy wywo�aniu programu w 
 konsoli) oraz wy�wietla fragment podanego �a�cucha, okre�lony wprowadzonymi liczbami. Na przyk�ad:
java Substring Witaj 2 4
powinien wy�wietli�:
taj
Obs�u� wszystkie mo�liwe wyj�tki, kt�re mog� wyst�pi� w przypadku z�ego zestawu argument�w.
 */

public class zadanie2 {
	public static void main(String[] args) throws NumberFormatException {
		// System.out.println("Podaj wyraz: ");
		// Scanner scan = new Scanner(System.in);
		// String string = scan.next();
		// System.out.println("Podaj pierwsz� liczb�: ");
		// int start = scan.nextInt();
		// System.out.println("Podaj drug� liczb�: ");
		// int stop = scan.nextInt() + 1;
		// scan.close();

		System.out.println(args[0]);
		String s = args[0];
		int start = Integer.parseInt(args[1]);
		int stop = Integer.parseInt(args[2]);
		try {
			System.out.println(s.substring(start, stop + 1));
		} catch (NumberFormatException e) {
			System.out.println("Nieprawid�owy format liczby");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Nieprawid�owy zakres");
		}
		return;

	}

}