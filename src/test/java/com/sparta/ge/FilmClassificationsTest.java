package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmClassificationsTest {

    @Test
    @DisplayName("Given age is 10, return U, PG & 12 films are available.")
    public void givenTheAgeIs10(){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(10));
    }

    @Test
    @DisplayName("Given age is 14, return U, PG, 12 & 15 films are available.")
    public void givenTheAgeIs14(){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(14));
    }

    @Test
    @DisplayName("Given age is 20, return All films are available.")
    public void givenTheAgeIs20(){
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(20));
    }
}
