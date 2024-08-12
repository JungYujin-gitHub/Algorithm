import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n+1][10];
		for(int i=0;i<10;i++) arr[1][i] = 1;
		for(int i=2;i<=n;i++) {
			for(int j=0;j<10;j++) {
				int sum = 0;
				for(int k=j;k<10;k++) {
					sum += arr[i-1][k];
				}
				arr[i][j] = sum%10007;
			}
		}
		int result = 0;
		for(int i=0;i<10;i++) result += arr[n][i];
		System.out.println(result%10007);
	}
}
