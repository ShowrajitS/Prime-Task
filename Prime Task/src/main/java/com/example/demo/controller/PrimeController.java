package com.example.demo.controller;
import com.example.demo.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/primes")
public class PrimeController {
    @Autowired
    private PrimeService primeService;

    @GetMapping
    public Map<String, Object> getPrimes(@RequestParam int initial) {
        List<Integer> primes = primeService.calculatePrimes(initial);
        Map<String, Object> response = new HashMap<>();
        response.put("Initial", initial);
        response.put("Primes", primes);
        return response;
    }
}
