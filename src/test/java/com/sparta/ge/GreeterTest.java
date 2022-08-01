package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    //All tests are public
    @Test
    @DisplayName("This is my first Test")
    public void firstTest(){
        Assertions.assertEquals(1, 1);
    }

    @Test
    @DisplayName("Given time is 21, return Good Evening")
    public void givenTheTimeIs21ReturnGoodEvening(){
        int time = 21;
        String expected = "Good Evening";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);
        //Assertions.assertEquals("Good Evening", Greeter.getGreeting(21));
    }

    @Test
    @DisplayName("Given time is 10, return Good Morning")
    public void givenTheTimeIs10ReturnGoodMorning(){
        Assertions.assertEquals("Good Morning", Greeter.getGreeting(10));
    }

    @Test
    @DisplayName("Given time is 17, return Good Afternoon")
    public void givenTheTimeIs17ReturnGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon", Greeter.getGreeting(17));
    }

}
