import java.util.Scanner;


public class ShortCalculator 
{
    public void main()
        {
        public void collect()
        {
            short num1;
            short num2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pick a number");
            num1 = scanner.nextShort();
            System.opt.println("Pick a second number");
            num2 = scanner.nextShort();
        }
         public void   absoluteConversion()
         {
             if (num1 < 0)
             {
                 num1 = num1 * -1;
             }
             if (num2 < 0)
             {
                 num2 = num2 * -1;
             }
         }
         public void calculations()
         {
             short sum = num1 + num2;
             short difference = num1 - num2;
             short product = num1 * num2;
             short quotient = num1 / num2;
             short remainder = num1 % num2;
    
    
        }

}
