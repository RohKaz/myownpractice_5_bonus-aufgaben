package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelNoviceTest {

    @Test
    void checkIfNumberGreaterThanZeroWithPositiveNumber() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        boolean result = levelNovice.checkIfNumberGreaterThanZero(5);
        //THEN
        assertEquals(true, result);
    }
    @Test
    void checkIfNumberGreaterThanZeroWithNegativeNumber() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        boolean result = levelNovice.checkIfNumberGreaterThanZero(-5);
        //THEN
        assertEquals(false, result);
    }

    @Test
    void checkIfNumberGreaterThanZeroWithZero() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        boolean result = levelNovice.checkIfNumberGreaterThanZero(0);
        //THEN
        assertEquals(false, result);
    }

    @Test
    void calculateSquareWithPositiveNumber() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        int result = levelNovice.calculateSquare(5);
        //THEN
        assertEquals(25, result);
    }

    @Test
    void calculateSquareWithNegativeNumber() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        int result = levelNovice.calculateSquare(-5);
        //THEN
        assertEquals(25, result);
    }

    @Test
    void calculateSquareWithZero() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        int result = levelNovice.calculateSquare(0);
        //THEN
        assertEquals(0, result);
    }

    @Test
    void nameSayer() {
        //GIVEN
        LevelNovice levelNovice = new LevelNovice();
        //WHEN
        String result = levelNovice.nameSayer();
        //THEN
        assertEquals("Hallo Roh", result);
    }
}