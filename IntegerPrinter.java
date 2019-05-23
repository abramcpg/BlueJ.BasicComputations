 import java.util.Scanner;

public class IntegerPrinter 
{
    Scanner scan;
    int value;
    void getVal()
    {
        System.out.println("Decimal to HexaDecimal, Octal, and Binary");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        value = Integer.parseInt(scan.nextLine());
    }
    
    public String printIntegerAsBinary(int value)
    {
        String binary = Integer.toBinaryString(value);
        System.out.println("Binary Value is : " + binary);
        return binary;
    }
    
    public String printIntegerAsOctal(int value)
    {
        String octal = Integer.toOctalString(value);
        System.out.println("Octal Value is : " + octal);
        return octal;
    }

    public String printIntegerAsHexadecimal(int value)
    {
        String hexa = Integer.toHexString(value);
        System.out.println("HexaDecimal Value is : " + hexa);
        return hexa;
    }

    public static void main(String[] args)
    {

    }
}
