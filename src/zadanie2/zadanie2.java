package zadanie2;
/*
 Napisz program, który pobiera dwie liczby oraz ³añcuch znaków z wiersza poleceñ (czyli jako parametry przy wywo³aniu programu w 
 konsoli) oraz wyœwietla fragment podanego ³añcucha, okreœlony wprowadzonymi liczbami. Na przyk³ad:
java Substring Witaj 2 4
powinien wyœwietliæ:
taj
Obs³u¿ wszystkie mo¿liwe wyj¹tki, które mog¹ wyst¹piæ w przypadku z³ego zestawu argumentów.
 */

public class zadanie2 {
	public static void main(String[] args) throws NumberFormatException {
		// System.out.println("Podaj wyraz: ");
		// Scanner scan = new Scanner(System.in);
		// String string = scan.next();
		// System.out.println("Podaj pierwsz¹ liczbê: ");
		// int start = scan.nextInt();
		// System.out.println("Podaj drug¹ liczbê: ");
		// int stop = scan.nextInt() + 1;
		// scan.close();

		System.out.println(args[0]);
		String s = args[0];
		int start = Integer.parseInt(args[1]);
		int stop = Integer.parseInt(args[2]);
		try {
			System.out.println(s.substring(start, stop + 1));
		} catch (NumberFormatException e) {
			System.out.println("Nieprawid³owy format liczby");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Nieprawid³owy zakres");
		}
		return;

	}

}