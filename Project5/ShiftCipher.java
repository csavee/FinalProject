import java.util.ArrayList;

public class ShiftCipher
{
    private int key; 
    ArrayList<Character> encrypted = new ArrayList<Character>();
    ArrayList<Character> alphabet = new ArrayList<Character>();
    /**
     * The default constructor.
     */
    public ShiftCipher()
    {
        
    }

    /**
     * This constructor initializes the key and adds all characters of the input string to an arraylist.  All of input is converted
     * to uppercase.  The entire alphabet is added to the alphabet arraylist.
     * 
     * 
     * @param input Plaintext to be encrypted.
     * @param key The amount of times to shift.
     * @return The encrypted text in the form of a string.
     */
    public ShiftCipher(String input, int key)
    {
        input = input.toUpperCase();
        this.key = key;
        int i = 0;
        while(i < input.length())
        {
            encrypted.add(i, input.charAt(i));
            i++;
        }
        
        alphabet.add('A');
        alphabet.add('B');
        alphabet.add('C');
        alphabet.add('D');
        alphabet.add('E');
        alphabet.add('F');
        alphabet.add('G');
        alphabet.add('H');
        alphabet.add('I');
        alphabet.add('J');
        alphabet.add('K');
        alphabet.add('L');
        alphabet.add('M');
        alphabet.add('N');
        alphabet.add('O');
        alphabet.add('P');
        alphabet.add('Q');
        alphabet.add('R');
        alphabet.add('S');
        alphabet.add('T');
        alphabet.add('U');
        alphabet.add('V');
        alphabet.add('W');
        alphabet.add('X');
        alphabet.add('Y');
        alphabet.add('Z');
    }
    
    /**
     * This method encrypts each character of an arraylist via the use of a shift cipher.  Each character is gone through and 
     * shifted by the appropiate key.  If, while shifting, the current letter is 'Z', the index is changed back to 0 in order 
     * to prevent going out of bounds.  As the loops run, the newly encrypted characters replace the ones in the arraylist.  
     * Afterwards, all of these characters are combined into a singular String.
     * 
     * @return encryptFull A string that combines all characters of the encrypted arraylist.  
     */
    public String encrypt()
    {
        char encryptedLetter = 'a';
        int i = 0;
        while(i < encrypted.size())
        {
            int j = alphabet.indexOf(encrypted.get(i))+1;
            int tempKey = key;
            while(tempKey >= 0)
            {
                if(alphabet.get(j) == 'Z')
                {
                    j = 0;
                }
                if(tempKey == 0)
                {
                    encrypted.set(i, encryptedLetter);
                    break;
                }
                encryptedLetter = alphabet.get(j);
                j++;
                tempKey--; 
            }
            i++;
        }
        
        String encryptFull = "";
        i = 0;
        while(i < encrypted.size())
        {
            encryptFull += encrypted.get(i);    
            i++;
        }
        return encryptFull;
        
        
    }
    
    /**
     * Encrypts the capitalized alphabet with a key of 15 via the use of a caesar cipher.  Used as a default example.
     * 
     * @return encryptFull A string that combines all characters of the encrypted arraylist.
     */
    public String encryptDefault()
    {
        String defaultInput = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.key = 15;
        int i = 0;
        while(i < defaultInput.length())
        {
            encrypted.add(i, defaultInput.charAt(i));
            i++;
        }
        char encryptedLetter = 'a';
        i = 0;
        while(i < encrypted.size())
        {
            int j = alphabet.indexOf(encrypted.get(i))+1;
            int tempKey = key;
            while(tempKey >= 0)
            {
                if(alphabet.get(j) == 'Z')
                {
                    j = 0;
                }
                if(tempKey == 0)
                {
                    encrypted.set(i, encryptedLetter);
                    break;
                }
                encryptedLetter = alphabet.get(j);
                j++;
                tempKey--; 
            }
            i++;
        }
        
        String encryptFull = "";
        i = 0;
        while(i < encrypted.size())
        {
            encryptFull += encrypted.get(i);    
            i++;
        }
        return encryptFull;    
    }
}
