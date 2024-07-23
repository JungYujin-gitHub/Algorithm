import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add((int)s.charAt(i)-'0');
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
}
