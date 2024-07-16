import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[8];
		for(int i=0;i<8;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		switch(arr[0]) {
		case 1:
			int n = 2;
			for(int i=1;i<8;i++) {
				if(arr[i]!=n++) {
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("ascending");
			break;
		case 8:
			int n2 = 7;
			for(int i=1;i<8;i++) {
				if(arr[i]!=n2--) {
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("descending");
			break;
			default:
				System.out.println("mixed");
		}
	}
}
