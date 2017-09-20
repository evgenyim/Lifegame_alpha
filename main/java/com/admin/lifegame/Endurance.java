package com.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Endurance {
    static String endurance() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[1])+ Math.sqrt(MainMenu.Rangs_count[2])+Math.sqrt(MainMenu.Rangs_count[3])+Math.sqrt(MainMenu.Rangs_count[11])+Math.sqrt(MainMenu.Rangs_count[13])+Math.sqrt(MainMenu.Rangs_count[14])+Math.sqrt(MainMenu.Rangs_count[15])+Math.sqrt(MainMenu.Rangs_count[16]));
        return String.valueOf(s);
    }
}
