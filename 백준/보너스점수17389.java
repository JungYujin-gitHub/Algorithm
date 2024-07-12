import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int score = 0;
		int bonus = 0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='O') {
				score += i+1;
				score += bonus++;
			}
			else bonus = 0;
		}
		System.out.println(score);
	}
}
