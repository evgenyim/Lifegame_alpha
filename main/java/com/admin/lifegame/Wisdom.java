package com.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Wisdom {
    static String winsdom() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[9])+ Math.sqrt(MainMenu.Rangs_count[19])+Math.sqrt(MainMenu.Rangs_count[23])+Math.sqrt(MainMenu.Rangs_count[12]));
        return String.valueOf(s);
    }
}
