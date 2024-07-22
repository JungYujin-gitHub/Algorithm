import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] h = new int[9];
		int sum = 0;
		for(int i=0;i<9;i++) {
			h[i] = sc.nextInt();
			sum += h[i];
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				int t = h[i];
				if(i!=j) {
					t += h[j];
					if(sum-t == 100) {
						for(int k=0;k<9;k++) {
							if(k!=i && k!=j) list.add(h[k]);
						}
						Collections.sort(list);
						for(int l=0;l<list.size();l++) System.out.println(list.get(l));
						return;
					}
				}
			}
		}
	}
}
