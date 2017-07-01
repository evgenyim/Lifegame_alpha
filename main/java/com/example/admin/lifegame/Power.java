package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Power {

    static String power() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[12])+ Math.sqrt(MainMenu.Rangs_count[13])+Math.sqrt(MainMenu.Rangs_count[15])+Math.sqrt(MainMenu.Rangs_count[17])+Math.sqrt(MainMenu.Rangs_count[26]));
        return String.valueOf(s);
    }
}
