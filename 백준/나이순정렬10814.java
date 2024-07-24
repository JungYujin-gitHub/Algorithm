import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class  Main{
	public static void main(String[] args) throws IOException {
		TreeMap<Integer,List<String>> tm = new TreeMap<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			addValue(tm,Integer.parseInt(st.nextToken()),st.nextToken());
			
		}
		
		
		for(Integer i : tm.keySet()) {
			for(String name : tm.get(i)) {
				System.out.print(i);
				System.out.println(" " + name);
			}
		}
	}
	static void addValue(TreeMap<Integer, List<String>> map, Integer key, String value) {
        // key에 해당하는 리스트를 찾거나, 없으면 새로운 리스트를 생성하고 value를 추가함
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
}
