import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		int last = 0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				q.offer(num);
				last = num;
				break;
			case "pop":
				if(!q.isEmpty())
					System.out.println(q.poll());
				else 
					System.out.println(-1);
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(!q.isEmpty())
					System.out.println(q.peek());
				else 
					System.out.println(-1);
				break;
			case "back":
				if(!q.isEmpty())
					System.out.println(last);
				else
					System.out.println(-1);
				break;
			}
		}
	}
}
