import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		int result = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) continue;
			int cnt = 0;
			for(int j=2;j<=Math.sqrt(arr[i]);j++) {
				if(arr[i]%j==0) cnt++;
			}
			if(cnt==0) result++;
		}
		System.out.println(result);
	}
}
