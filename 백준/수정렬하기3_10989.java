import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		Arrays.fill(arr, 0);
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		for(int i=1;i<=10000;i++) {
			for(int j=0;j<arr[i];j++) {
				sb.append(i).append('\n');
			}
		}
        System.out.println(sb);
	}
}
