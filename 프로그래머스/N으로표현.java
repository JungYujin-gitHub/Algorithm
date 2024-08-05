import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> list = new ArrayList<>();
        for(int i=0;i<=8;i++) {
            list.add(new HashSet<>());
        }
        list.get(1).add(N);
        for(int i=2;i<=8;i++){
            for(int j=1;j<i;j++){
                Set<Integer> s1 = list.get(j);
                Set<Integer> s2 = list.get(i-j);
                
                Set<Integer> currentSet = list.get(i);
                for(Integer num1 : s1){
                    for(Integer num2 : s2){
                        currentSet.add(num1+num2);
                        currentSet.add(num1-num2);
                        currentSet.add(num1*num2);
                        if(num1!=0 && num2!=0) currentSet.add(num1/num2);
                    }
                }
            }
            String s = (String.valueOf(N)).repeat(i);
            list.get(i).add(Integer.parseInt(s));
        }
        for(Set<Integer> set : list){
            if(set.contains(number)) return list.indexOf(set);
        }
        return -1;
        
    }
}
