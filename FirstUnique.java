import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import javax.print.attribute.HashDocAttributeSet;

public class FirstUnique {
    private int unique(String s){
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                map.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }
        if(map.size()<1){
            return -1;
        }
        int index = Integer.MAX_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)<index){
                index=map.get(key);
            }
        }
        return index+1;
    }

    public void run(Scanner sc){
        while(sc.hasNext()){
            System.out.print(unique(sc.next()));
        }
    }
}
