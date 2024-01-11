package com.example.demo;
import com.example.demo.service.PrimeService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeServiceTest {
    @Test
    void calculatePrimes() {
        PrimeService primeService = new PrimeService();
        List<Integer> primes = primeService.calculatePrimes(10);
        assertEquals(List.of(2, 3, 5, 7), primes);
    }

    @Test
    void isPrime() {
        PrimeService primeService = new PrimeService();
        assertTrue(primeService.isPrime(2));
        assertTrue(primeService.isPrime(3));
        assertTrue(primeService.isPrime(7));

        assertFalse(primeService.isPrime(1));
        assertFalse(primeService.isPrime(4));
        assertFalse(primeService.isPrime(9));
    }

}
