 import java.util.Scanner; 

public class NormalizeAngle 
{
    Scanner scan;
    int num;
    int angle;

    public Integer normalizeValueUsingModulo(Integer angle)
    {
        System.out.println("Enter a number...");
        num = Integer.parseInt(scan.nextLine());
        angle = num%360;
        
        System.out.println("Your normalized angle is : " + angle);
        return angle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer)
    {
        System.out.println("Enter a number...");
        num = Integer.parseInt(scan.nextLine());
        angle = Math.floorMod(num,360);
        
        System.out.println("Your normalized angle is : " + angle);
        return angle;
    }

    public static void main(String[] args)
    {

    }
}
