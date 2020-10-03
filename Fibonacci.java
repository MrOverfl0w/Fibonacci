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
        if(n.intValue() <= 2){
            return new BigInteger("1");
        }else{
            return fib(n.subtract(new BigInteger("1"))).add(fib(n.subtract(new BigInteger("2"))));
        }
    }
    
}
