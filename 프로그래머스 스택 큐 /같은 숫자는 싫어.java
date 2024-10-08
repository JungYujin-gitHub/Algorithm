import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int i : arr){
            if(i!=temp) {
                list.add(i);
                temp = i;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
