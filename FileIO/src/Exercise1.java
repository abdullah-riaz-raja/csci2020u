import java.io.File;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws Exception{
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String filename = consoleInput.nextLine();

        Scanner input = new Scanner(new File(filename));

        int sum = 0;
        int counter = 0;

        while(input.hasNext()){
            sum += input.nextInt();
            counter++;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/counter);
    }
}
