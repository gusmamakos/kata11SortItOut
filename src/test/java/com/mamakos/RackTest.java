package com.mamakos;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RackTest {

    @Test
    public void add() {
        Rack rack = new Rack();
        rack.add(1);
        rack.add(2);
        rack.add(3);
        rack.add(4);
        var result = rack.balls();
        int[] expected = {1,2,3,4};
        assertArrayEquals(expected,result);
    }

    @Test
    public void balls() {
        Rack rack = new Rack();
        rack.add(4);
        rack.add(3);
        rack.add(1);
        rack.add(2);
        var result = rack.balls();
        int[] expected = {1,2,3,4};
        assertArrayEquals(expected,result);
    }
}