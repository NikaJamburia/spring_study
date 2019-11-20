package com.mickitotutorial.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // JUnit 5. For JUnit 4 - @RunWith(MockitoJUnitRunner.class)
class SomeBusinessTest {



    @InjectMocks
    SomeBusiness business;

    @Mock
    DataService dsMock;

    @Test
    void findBiggest_for3() {
        when(dsMock.retrieveAllData()).thenReturn(new int[] {24, 15 ,6});
        int result = business.findBiggest();
        assertEquals(24, result);
    }

    @Test
    void findBiggest_for1() {
        when(dsMock.retrieveAllData()).thenReturn(new int[] {10});
        int result = business.findBiggest();
        assertEquals(10, result);
    }
}
