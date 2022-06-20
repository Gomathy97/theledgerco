package com.theledgerco;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.*;

@RunWith(PowerMockRunner.class)
public class MainTest {

    @Test
    public void testInput1() {
        Main.main(new String[]{"sample_input/input1.txt"});
    }

    @Test
    public void testInput2() {
        Main.main(new String[]{"sample_input/input2.txt"});
    }

    @Test
    public void testInput3() {
        Main.main(new String[]{"sample_input/input3.txt"});
    }

    @Test
    public void testInput4() {
        Main.main(new String[]{"sample_input/input4.txt"});
    }

}