package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Wisdom {
    static String winsdom() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[20])+ Math.sqrt(MainMenu.Rangs_count[21])+Math.sqrt(MainMenu.Rangs_count[25])+Math.sqrt(MainMenu.Rangs_count[28])+Math.sqrt(MainMenu.Rangs_count[29])+Math.sqrt(MainMenu.Rangs_count[30]));
        return String.valueOf(s);
    }
}
