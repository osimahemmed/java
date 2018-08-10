package com.oracle.xml;

public class PrimeDemo1 {
    
    // check whether a number is prime

    static boolean isPrime(int n) {

        // 2 is the smallest prime

        if (n <= 2) {
            return n == 2;
        }

        // even numbers other than 2 are not prime

        if (n % 2 == 0) {
            return false;
        }

        // check odd divisors from 3
        // to the square root of n

        for (int i = 3, end = (int)Math.sqrt(n);
        i <= end; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // find the smallest prime >= n

    static int getPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static void main(String args[]) {
        System.out.println(getPrime(52));
    }
}
