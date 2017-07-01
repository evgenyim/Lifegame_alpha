package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Intelligence {
    static String intelligence() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[8])+ Math.sqrt(MainMenu.Rangs_count[9])+Math.sqrt(MainMenu.Rangs_count[18])+Math.sqrt(MainMenu.Rangs_count[20])+Math.sqrt(MainMenu.Rangs_count[21])+Math.sqrt(MainMenu.Rangs_count[28])+Math.sqrt(MainMenu.Rangs_count[29])+Math.sqrt(MainMenu.Rangs_count[30]));
        return String.valueOf(s);
    }
}
