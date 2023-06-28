package org.example;
//演習問題9　未完成
import static org.junit.jupiter.api.Assertions.*;
class PrimeNumberTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void generate() {
    }

    @org.junit.jupiter.api.Test
    void getPrime() {
        assertEquals(expected:2, PrimeNumber.getPrime(nth:1));
    }

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertEquals(expected:true, PrimeNumber.isPrime(number:3));
        assertEquals(expected:true, PrimeNumber.isPrime(number:5));
        assertEquals(expected:true, PrimeNumber.isPrime(number:7));

    }
    @org.junit.jupiter.api.Test
    public static boolean isPrime (int number){
        if(number <=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
