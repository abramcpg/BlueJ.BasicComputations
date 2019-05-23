import java.math.BigInteger;

public class Factorial 
{

    public BigInteger factorialOf(Integer value)
    {
        BigInteger factorial = BigInteger.ONE;
        
        for (int i = value; i > 0; i--) 
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        return factorial;
    }

}
