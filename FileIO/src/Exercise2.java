import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) throws Exception{
        File file = new File ("Exercise_2.txt");
        if (!file.exists()){
            PrintWriter output = new PrintWriter(file);

            for (int i=0; i<100; i++){
                output.print((int) (Math.random() * 100) + " ");
            }

            output.close();
        }

        Scanner input = new Scanner(file);

        int [] numbers = new int [100];

        for (int i=0; i<100; i++){
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        for (int i: numbers){
            System.out.println(i + " ");
        }
    }
}
