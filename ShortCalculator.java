import java.util.Scanner;


public class ShortCalculator 
{
    public void main()
        {
        }
        public void collect()
        {
            short num1;
            short num2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pick a number");
            num1 = scanner.nextShort();
            System.out.println("Pick a second number");
            num2 = scanner.nextShort();

             if (num1 < 0)
             {
                 num1 = (short)(num1 * (-1));
             }
             if (num2 < 0)
             {
                 num2 = (short)(num2 * (-1));
             }

             short sum = (short)(num1 + num2);
             short difference = (short)(num1 - num2);
             short product = (short)(num1 * num2);
             short quotient = (short)(num1 / num2);
             short remainder = (short)(num1 % num2);
    
    
        }


}
