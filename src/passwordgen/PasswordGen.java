package passwordgen;
import java.util.Scanner;
import java.util.Random;
public class PasswordGen 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = keyboard.nextInt();
        generatePassword(length);
    }
    public static void generatePassword(int length)
    {
        Random rand = new Random();
        int digit = 0;
        String[] symbolList = {"*", "!", "_", "?" ,"/", "-", "$" , "^" ,"&" , "%", "£"}; //11
        String[] letterList = {"a", "b", "c", "d" ,"e", "f", "g" , "h" ,"i" , "j", "k", "l", "m", "n", "o" ,"p", "q", "r" , "s" ,"t" , "u", "v", "w" ,"x" , "y", "z",
        "A", "B", "C", "D" ,"E", "F", "G" , "H" ,"I" , "J", "K", "L", "M", "N", "O" ,"P", "Q", "R" , "S" ,"T" , "U", "V", "W" ,"X" , "Y", "Z"}; 
        String symbol = "";
        String letter = "";
        int symbolLimit = 0;
        int random = 0;
        for(int i = 0; i != length; i++)
        {
            random = rand.nextInt(3);
            if(random == 0)
            {
                digit = rand.nextInt(10);
                System.out.print(digit);
            }
            else if (random == 1 && symbolLimit <= 3)
            {
                digit = rand.nextInt(11);
                symbol = symbolList[digit];
                System.out.print(symbol);
                symbolLimit = symbolLimit++;
            }
            else if (random == 2)
            {
                digit = rand.nextInt(48);
                letter = letterList[digit];
                System.out.print(letter);
            }
        }
    }
}
