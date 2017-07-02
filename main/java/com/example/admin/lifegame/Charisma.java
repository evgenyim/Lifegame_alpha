package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Charisma {
    static String charisma() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[1])+ Math.sqrt(MainMenu.Rangs_count[6])+Math.sqrt(MainMenu.Rangs_count[10])+Math.sqrt(MainMenu.Rangs_count[9])+Math.sqrt(MainMenu.Rangs_count[15])+Math.sqrt(MainMenu.Rangs_count[22]));
        return String.valueOf(s);
    }
}
