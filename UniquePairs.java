import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class UniquePairs{
    private void _printUniquePairs(String[] pair_left, String[] pair_right, int t){
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i]+" "+pair_right[i];
            if(!set.contains(pair)){
                set.add(pair);
            }
            System.out.println(set.size());
        }
       
    }
    
    public void run() throws FileNotFoundException {
        File file = new File("hashset.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        Scanner s = new Scanner(br);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();
        this._printUniquePairs(pair_left,pair_right,t);
    }
}