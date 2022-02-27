import java.util.HashMap;
import java.util.Scanner;

public class longestWork {
    
    private char longestWorkSlot(int[][] arr){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Integer , Integer> map = new HashMap<>();
        int old =0;
        for(int i=0; i< arr.length;i++){
            
            if(map.containsKey(arr[i][0])){
                map.put(arr[i][0], map.get(arr[i][0])+arr[i][1]-old);
            }
            else{
                map.put(arr[i][0],arr[i][1]-old);
            }
            old = arr[i][1];
        }
        int result=-1;
        for(int key : map.keySet()){
            if(result==-1||map.get(key)>old){
                result=key;
                old = map.get(key);
            }
        }
        return alphabet[result];
    }

    public void run(Scanner sc){
        // while(sc.hasNext()){
        //     String line = sc.next().trim();
        //     int[][] arr;
        //     for(int i =0 ; i<line.length()/2; i+=2){
        //         arr
        //     }
        //     System.out.println(longestWorkSlot(arr));
        // }
        int[][] arr = {{0,3},{2,5},{0,9},{1,15}};
        System.out.println(longestWorkSlot(arr));
    }

}
