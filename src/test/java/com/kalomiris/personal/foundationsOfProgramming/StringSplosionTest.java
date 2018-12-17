package com.kalomiris.personal.foundationsOfProgramming;

import junit.framework.TestCase;

public class StringSplosionTest extends TestCase {
    public void testExplode() throws Exception {

        StringSplosion testClass = new StringSplosion();
        assertEquals("", testClass.explode(""));
        assertEquals("n", testClass.explode("n"));
        assertEquals("nniniknikonikos", testClass.explode("nikos"));
    }

}