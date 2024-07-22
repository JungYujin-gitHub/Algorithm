import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		char[][] arr = new char[n][n];
		for(int i=0;i<n;i++) {
			arr[i] = br.readLine().toCharArray();
		}
		int wide = 0;
		for(int i=0;i<n;i++) {
			int cnt = 0;
			for(int j=0;j<n;j++) {
				if(arr[i][j]!='X') cnt++;
				else {
					if(cnt>=2) wide++;
					cnt = 0;
				}
			}
			if(cnt>=2) wide++;
		}
		
		int height = 0;
		for(int j=0;j<n;j++) {
			int cnt = 0;
			for(int i=0;i<n;i++) {
				if(arr[i][j]!='X') cnt++;
				else {
					if(cnt>=2) height++;
					cnt = 0;
				}
			}
			if(cnt>=2) height++;
		}
		System.out.println(wide +" "+ height);
	}
}
