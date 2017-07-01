package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Agility {
    static String agility() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[2])+ Math.sqrt(MainMenu.Rangs_count[3])+Math.sqrt(MainMenu.Rangs_count[4])+Math.sqrt(MainMenu.Rangs_count[5])+Math.sqrt(MainMenu.Rangs_count[7])+Math.sqrt(MainMenu.Rangs_count[10])+Math.sqrt(MainMenu.Rangs_count[14])+Math.sqrt(MainMenu.Rangs_count[22])+Math.sqrt(MainMenu.Rangs_count[23])+Math.sqrt(MainMenu.Rangs_count[24]));
        return String.valueOf(s);
    }
}
