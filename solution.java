import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class solution {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        Scanner s = new Scanner(br);
        int a = 98;
        System.out.println((char)a);

    }
}
