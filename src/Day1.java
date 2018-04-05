import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;

		System.out.println("init");

		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		int inputi = scan.nextInt();

		double inputd = scan.nextDouble();
		//scan.useDelimiter("\\n");
		// Reading data using readLine
		String inputS = scan.next();
		inputS += scan.nextLine();


		System.out.println(i + inputi);
		System.out.println(d + inputd);
		System.out.println(s + inputS);

	}

}
