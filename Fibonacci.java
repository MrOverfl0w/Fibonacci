import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author MrOverfl0w
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
       
        BigInteger n = sc.nextBigInteger();
        System.out.println(""+fib(n).toString());
        
    }
    
    private static BigInteger fib(BigInteger n){
        BigInteger f = BigInteger.ONE, f1 = BigInteger.ZERO, f2 = BigInteger.ONE, i = BigInteger.ONE;
        while (i.compareTo(n) != 1) {
            f = f1.add(f2);
            f2 = f1;
            f1 = f;
            i = i.add(BigInteger.ONE);
        }
        return f;
    }
    
}
