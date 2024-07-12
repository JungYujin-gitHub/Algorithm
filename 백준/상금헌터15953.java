import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int[][] test1 = {{1,3,6,10,15,21},{5000000,3000000,2000000,500000,300000,100000}};
		int[][] test2 = {{1,3,7,15,31},{5120000,2560000,1280000,640000,320000}}; 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] answer = new int[n][2];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			answer[i][0] = Integer.parseInt(st.nextToken());
			answer[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n;i++) {
			int money = 0;
            if(answer[i][0]!=0){
                for(int j=0;j<6;j++) {
				if(answer[i][0]<=test1[0][j]) {
					money+=test1[1][j];
					break;
				   }
			    }
            }
			if(answer[i][1]!=0){
                for(int j=0;j<5;j++) {
				if(answer[i][1]<=test2[0][j]) {
					money+=test2[1][j];
					break;
				}
			}
            }
			
			System.out.println(money);
		}
	}
}
