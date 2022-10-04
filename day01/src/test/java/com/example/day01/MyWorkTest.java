package com.example.day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyWorkTest {

    @DisplayName("Start with Include")
    @Test
    public void case01() {
        MyWork myWork = new MyWork("[1,5]");
        boolean result = myWork.isStartWithInclude();
        assertTrue(result);
    }

}