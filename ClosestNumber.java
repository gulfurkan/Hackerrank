import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumber {
    
    private void print(List<Integer> numbers){
        int diff = Integer.MAX_VALUE;
        Collections.sort(numbers);
        for(int i=0; i<numbers.size()-1; i++){
            if(numbers.get(i+1)-numbers.get(i)<diff){
                diff=numbers.get(i+1)-numbers.get(i);
            }
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i + 1) - numbers.get(i) == diff) {
                System.out.print(numbers.get(i)+" "+numbers.get(i+1));
            }
        }
    }

    public void run(){
        List<Integer> liste = new ArrayList<>();
        liste.add(6);
        liste.add(2);
        liste.add(4);
        liste.add(10);
        print(liste);
    }
}
