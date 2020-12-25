package com.mamakos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Rack {
    private List<Integer> numbers = new ArrayList<>();

    public void add(int num) {
        this.numbers.add(num);
        this.numbers = numbers.stream().sorted().collect(Collectors.toList());
    }

    public int[] balls() {
        int[] results = new int[this.numbers.size()];
        for (int i = 0; i < this.numbers.size(); i++) {
            results[i] = this.numbers.get(i);
        }
        return results;
    }

}
