package com.base.project.demo.usecases;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;


public class testDemo {

    @BeforeAll
    static void setup() {

    }

    @BeforeEach
    void init() {

    }

    @DisplayName("Single test successful")
    @Test
    void testUseCase1(){
        assertTrue(Stream.of(1, 2, 3)
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be greater than 5");
    }

}
