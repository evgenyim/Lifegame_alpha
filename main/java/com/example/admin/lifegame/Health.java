package com.example.admin.lifegame;

/**
 * Created by Марк on 30.06.2017.
 */

public class Health {
    static String health() {
        int s =  ((int) Math.sqrt(MainMenu.Rangs_count[1])+ (int) Math.sqrt(MainMenu.Rangs_count[3])+(int) Math.sqrt(MainMenu.Rangs_count[6])+(int) Math.sqrt(MainMenu.Rangs_count[10])+(int) Math.sqrt(MainMenu.Rangs_count[11])+(int) Math.sqrt(MainMenu.Rangs_count[14])+(int) Math.sqrt(MainMenu.Rangs_count[13])+(int) Math.sqrt(MainMenu.Rangs_count[15])+(int) Math.sqrt(MainMenu.Rangs_count[16]));
        return String.valueOf(s);
    }
}
