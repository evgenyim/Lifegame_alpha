package com.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Stress {
    static String stress() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[4])+ Math.sqrt(MainMenu.Rangs_count[5])+Math.sqrt(MainMenu.Rangs_count[10])+Math.sqrt(MainMenu.Rangs_count[13])+Math.sqrt(MainMenu.Rangs_count[18])+Math.sqrt(MainMenu.Rangs_count[20])+Math.sqrt(MainMenu.Rangs_count[21])+Math.sqrt(MainMenu.Rangs_count[22])+Math.sqrt(MainMenu.Rangs_count[23]));
        return String.valueOf(s);
    }
}
