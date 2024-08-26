import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int[] dp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		dp[0] = 1;
		for(int i=0;i<n;i++) {
			int max = 0;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					max = Math.max(max, dp[j]);
				}
			}
			dp[i] = max+1;
		}
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}
}
