
import java.util.Scanner;
public class Project5
{
    /**
     * Main method that gets a key and text to encrypt via the use of user input.  Proceeds to create a ShiftCipher object and
     * calls the encrypt method, printing the result.  Catches an exception if the code does not work.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            int key;
            String text = "";
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter plaintext to encrypt: ");
            text = input.nextLine();
            System.out.println("Please enter a key (the number of times to shift by): ");
            key = input.nextInt();
            ShiftCipher cipher = new ShiftCipher(text, key);
            System.out.println(cipher.encrypt());
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
        
    }
}
