package com.kienjd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest
@Profile("test")
public class SpringbootSampleApplicationTest {
    @Test
    void contextLoads() {
    }
}
