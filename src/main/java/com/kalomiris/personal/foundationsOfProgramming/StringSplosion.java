package com.kalomiris.personal.foundationsOfProgramming;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringSplosion {

    public String explode(String input) {

        String exploded = "";
        for (int i = 1; i <= input.length(); i++) {
            exploded += input.substring(0, i);
        }

        Logger.getAnonymousLogger().log(Level.INFO, "StringSplosion.explode result: " + exploded);
        return exploded;
    }
}
