import java.io.FileInputStream;
import java.util.Scanner;

public class BedTimeStories {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Which story would you like to read?: ");
        String story = sc.nextLine();

        try{
            FileInputStream fis = new FileInputStream("goldilocks.txt","mary_had_a_little_lamb.txt");
            Scanner scanner = new Scanner(fis);
            String input;
            while(scanner.hasNextLine()){

            }
        }

    }
}
