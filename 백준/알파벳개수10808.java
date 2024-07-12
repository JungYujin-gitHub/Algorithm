import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=97;i<=122;i++) {
			String temp = s.replaceAll(Character.toString((char)i), "");
			System.out.print(s.length()-temp.length()+" ");
		}
	}
}
