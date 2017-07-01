package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Will {
    static String will() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[1])+ Math.sqrt(MainMenu.Rangs_count[2])+Math.sqrt(MainMenu.Rangs_count[6])+Math.sqrt(MainMenu.Rangs_count[7])+Math.sqrt(MainMenu.Rangs_count[8])+Math.sqrt(MainMenu.Rangs_count[9])+Math.sqrt(MainMenu.Rangs_count[10])+Math.sqrt(MainMenu.Rangs_count[11])+Math.sqrt(MainMenu.Rangs_count[26]));
        return String.valueOf(s);
    }
}
