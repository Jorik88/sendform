package com.example.sendform;

import org.junit.Test;

public class TestUnit {

    @Test
    public void testSplitWithCommaSeparated() {
        String str = "Одесса Косая 14 25";
        String resultStr = str.replace(" ", ", ");
        System.out.println(resultStr);
    }
}
