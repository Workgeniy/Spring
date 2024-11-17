package org.example.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SpendTest {

    @Test
    void testBuy() {
        ApplicationContext javaConfigContext =
                new AnnotationConfigApplicationContext(
                        AppConfig.class);
        Spend buy_once =
                javaConfigContext.getBean(Spend.class);
        assertTrue(buy_once.buy_icecream());
    }

}