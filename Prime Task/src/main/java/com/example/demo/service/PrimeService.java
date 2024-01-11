package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PrimeService {
    public List<Integer> calculatePrimes(int initial) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= initial; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
