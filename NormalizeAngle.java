public class NormalizeAngle 
{
 

    public Integer normalizeValueUsingModulo(Integer angle)
    {
        return (angle %= 360) >= 0 ? angle : (angle + 360);
    }

    public Integer normalizeValueUsingFloorMod(Integer integer)
    {
        int num = Math.floorMod(integer,360);
        
        
        return num;
    }

    public static void main(String[] args)
    {

    }
}
