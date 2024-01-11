package com.example.demo;
import com.example.demo.service.PrimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@SpringBootTest
@AutoConfigureMockMvc
public class PrimeControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PrimeService primeService;

    @Test
    void getPrimes() throws Exception {
        int initial = 10;
        mockMvc.perform(MockMvcRequestBuilders.get("/primes").param("initial", String.valueOf(initial)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.Initial").value(initial))
                .andExpect(MockMvcResultMatchers.jsonPath("$.Primes").value(primeService.calculatePrimes(initial)));
    }

}
