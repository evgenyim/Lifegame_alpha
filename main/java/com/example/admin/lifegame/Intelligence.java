package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Intelligence {
    static String intelligence() {
        int s = (int) (Math.sqrt(MainMenu.Rangs_count[8])+ Math.sqrt(MainMenu.Rangs_count[9])+Math.sqrt(MainMenu.Rangs_count[17]*2)+Math.sqrt(MainMenu.Rangs_count[19])+Math.sqrt(MainMenu.Rangs_count[12]));
        return String.valueOf(s);
    }
}
