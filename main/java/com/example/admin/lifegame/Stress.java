package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Stress {
    static String stress() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[4])+ Math.sqrt(MainMenu.Rangs_count[5])+Math.sqrt(MainMenu.Rangs_count[10])+Math.sqrt(MainMenu.Rangs_count[11])+Math.sqrt(MainMenu.Rangs_count[14])+Math.sqrt(MainMenu.Rangs_count[19])+Math.sqrt(MainMenu.Rangs_count[22])+Math.sqrt(MainMenu.Rangs_count[23])+Math.sqrt(MainMenu.Rangs_count[24])+Math.sqrt(MainMenu.Rangs_count[25])+Math.sqrt(MainMenu.Rangs_count[27]));
        return String.valueOf(s);
    }
}
