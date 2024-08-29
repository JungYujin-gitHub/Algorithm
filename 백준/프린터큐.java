import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        for(int i=0;i<tc;i++){
            int cnt = 1;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int print_index = Integer.parseInt(st.nextToken());
            Queue<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }
            while(!q.isEmpty()){
                int[] arr = q.poll();
                int current_index = arr[0];
                int current_num = arr[1];
                int flag = 0;
                Iterator<int[]> iterator = q.iterator();
                while(iterator.hasNext()){
                    int check_num = iterator.next()[1];
                    if(current_num < check_num) {
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    if(current_index==print_index) {
                        System.out.println(cnt);
                        break;
                    }else{
                        cnt++;
                    }
                }else{
                    q.offer(arr);

                }

            }
        }
    }
}
