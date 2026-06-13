package com.kishdizon;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorMockTest {

    @Mock
    Logger logger;

    @InjectMocks
    Calculator calc = new Calculator("Test Mock Calculator", logger);

    @Test
    void testAddCallsLogger(){
        calc.add(9,10);
        verify(logger).log("Adding 9 + 10");
    }

    @Test
    void testAddReturnsCorrectAnswer() {
        assertEquals(19, calc.add(9, 10));
    }
}
