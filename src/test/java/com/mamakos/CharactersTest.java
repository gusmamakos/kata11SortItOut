package com.mamakos;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersTest {

    @Test
    public void TestCharacters(){
        Characters c = new Characters("When not studying nuclear physics, Bambi likes to play beach volleyball.");
        String expected = "aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy";
        String actual = c.toString();
        assertEquals("Test failed", expected, actual);
    }

}