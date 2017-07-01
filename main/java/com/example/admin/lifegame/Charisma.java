package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Charisma {
    static String charisma() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[1])+ Math.sqrt(MainMenu.Rangs_count[6])+Math.sqrt(MainMenu.Rangs_count[11])+Math.sqrt(MainMenu.Rangs_count[13])+Math.sqrt(MainMenu.Rangs_count[16])+Math.sqrt(MainMenu.Rangs_count[24])+Math.sqrt(MainMenu.Rangs_count[26]));
        return String.valueOf(s);
    }
}
