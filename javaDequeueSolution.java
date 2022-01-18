import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class javaDequeueSolution {

    void printUniqueCount(Scanner in){
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            if (i>=m) {
                max = Math.max(max, set.size());
                int removeValue = (int) deque.poll();
                if(!deque.contains(removeValue))
                    set.remove(removeValue);

            }
            deque.addLast(num);
            set.add(num);
        
        }
        System.out.println(max);
    }

    
    public void run(Scanner in){
       printUniqueCount(in);
    }
}
