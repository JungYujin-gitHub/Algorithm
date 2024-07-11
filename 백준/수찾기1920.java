package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 수찾기1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arrn = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arrn[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int[] arrm = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			arrm[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.parallelSort(arrn);
		for(int i=0;i<m;i++) {
			if(Arrays.binarySearch(arrn, arrm[i])>=0) System.out.println(1);
			else System.out.println(0);
		}
		
	}
}
