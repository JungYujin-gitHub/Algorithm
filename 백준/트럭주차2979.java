import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[][] time = new int[3][2];
		
		for(int i=0;i<3;i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		
		int max_time = 0;
		for(int i=0;i<3;i++) {
			if(time[i][1]>max_time) max_time = time[i][1];
		}
		
		int[][] parking = new int[3][max_time+1];
		for(int i=0;i<3;i++) {
			for(int j=time[i][0];j<time[i][1];j++) {
				parking[i][j] = 1;
			}
		}
				
		int money = 0;
		for(int i=1;i<=max_time;i++) {
			int num = parking[0][i] + parking[1][i] + parking[2][i];
			if(num==1) money += a;
			else if(num==2) money += b*2;
			else if(num==3) money += c*3;
			
		}
		
		System.out.println(money);
		
	}
}
