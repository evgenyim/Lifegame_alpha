package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Power {

    static String power() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[11])+ Math.sqrt(MainMenu.Rangs_count[14])+Math.sqrt(MainMenu.Rangs_count[15])+Math.sqrt(MainMenu.Rangs_count[16]));
        return String.valueOf(s);
    }
}
