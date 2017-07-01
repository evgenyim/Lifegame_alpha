package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Endurance {
    static String endurance() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[1])+ Math.sqrt(MainMenu.Rangs_count[2])+Math.sqrt(MainMenu.Rangs_count[3])+Math.sqrt(MainMenu.Rangs_count[12])+Math.sqrt(MainMenu.Rangs_count[13])+Math.sqrt(MainMenu.Rangs_count[14])+Math.sqrt(MainMenu.Rangs_count[15])+Math.sqrt(MainMenu.Rangs_count[16])+Math.sqrt(MainMenu.Rangs_count[17])+Math.sqrt(MainMenu.Rangs_count[26])+Math.sqrt(MainMenu.Rangs_count[27]));
        return String.valueOf(s);
    }
}
