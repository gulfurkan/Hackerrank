import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSolution {
    private void print(File file) throws FileNotFoundException{
        BufferedReader br = new BufferedReader(new FileReader(file));

        Scanner s = new Scanner(br);
        BigInteger a = new BigInteger(s.nextLine());
        BigInteger b = new BigInteger(s.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
    
    
    public void run() throws FileNotFoundException{
        File file = new File("BigIntegerSolution.txt");
        this.print(file);
        
    }
}
