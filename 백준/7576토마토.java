package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토7576 {
	static class Node{
		int y;
		int x;
		Node(int y, int x) {this.y = y; this.x = x;}
	}
	static int n,m;
	static int[][] arr;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static Queue<Node> q = new ArrayDeque<Node>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==1) q.offer(new Node(i,j));
			}
		}
		
		bfs();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					System.out.println(-1);
					return;
				}
			}
		}

		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]>max) max = arr[i][j];
			}
		}
		System.out.println(max-1);
	}
	static void bfs() {
		while(!q.isEmpty()) {
			Node node = q.poll();
			for(int i=0;i<4;i++) {
				int ny = node.y + dy[i];
				int nx = node.x + dx[i];
				if(nx>=0 && ny>=0 && nx<m && ny<n) {
					if(arr[ny][nx]==0) {
						arr[ny][nx] = arr[node.y][node.x]+1;
						q.offer(new Node(ny,nx));
					}
				}
				
				
			}
		}
	}
}
