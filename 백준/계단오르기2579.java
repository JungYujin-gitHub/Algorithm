import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[][] dp = new int[n][3];
		dp[0][0] = 0;
		dp[0][1] = arr[0];
		dp[0][2] = 0;
		for(int i=1;i<n;i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = dp[i-1][0] + arr[i];
			dp[i][2] = dp[i-1][1] + arr[i];
		}
		System.out.println(Math.max(dp[n-1][1], dp[n-1][2]));
	}
}
