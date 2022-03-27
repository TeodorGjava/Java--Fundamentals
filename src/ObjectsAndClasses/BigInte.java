package ObjectsAndClasses;

import java.math.BigInteger;

public class BigInte {
    public static void main(String[] args) {
        int n = 5;
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <=n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }


}
