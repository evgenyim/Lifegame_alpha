package com.example.admin.lifegame;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final TextView text = (TextView) findViewById(R.id.textView);
        text.setTextSize(MainMenu.height1/35);

        final TextView text1 = (TextView) findViewById(R.id.textView1);
        text1.setTextSize(MainMenu.height1/55);
        text1.setX(0);
        text1.setY(MainMenu.height1/75*1);

        final TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setTextSize(MainMenu.height1/55);
        text2.setX(0);
        text2.setY(MainMenu.height1/75*2);

        final TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setTextSize(MainMenu.height1/55);
        text3.setX(0);
        text3.setY(MainMenu.height1/75*3);

        final TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setTextSize(MainMenu.height1/55);
        text4.setX(0);
        text4.setY(MainMenu.height1/75*4);

        final TextView text5 = (TextView) findViewById(R.id.textView5);
        text5.setTextSize(MainMenu.height1/55);
        text5.setX(0);
        text5.setY(MainMenu.height1/75*5);

        final TextView text6 = (TextView) findViewById(R.id.textView6);
        text6.setTextSize(MainMenu.height1/55);
        text6.setX(0);
        text6.setY(MainMenu.height1/75*6);

        final TextView text7 = (TextView) findViewById(R.id.textView7);
        text7.setTextSize(MainMenu.height1/55);
        text7.setX(0);
        text7.setY(MainMenu.height1/75*7);

        final TextView text8 = (TextView) findViewById(R.id.textView8);
        text8.setTextSize(MainMenu.height1/55);
        text8.setX(0);
        text8.setY(MainMenu.height1/75*8);

        final TextView text9 = (TextView) findViewById(R.id.textView9);
        text9.setTextSize(MainMenu.height1/55);
        text9.setX(0);
        text9.setY(MainMenu.height1/75*9);

        final TextView text10 = (TextView) findViewById(R.id.textView10);
        text10.setTextSize(MainMenu.height1/55);
        text10.setX(0);
        text10.setY(MainMenu.height1/75*10);

        final TextView text11 = (TextView) findViewById(R.id.ch1);
        text11.setTextSize(MainMenu.height1/55);
        text11.setX(0);
        text11.setY(MainMenu.height1/75*1);
        text11.setText(Stress.stress());

        final TextView text12 = (TextView) findViewById(R.id.ch2);
        text12.setTextSize(MainMenu.height1/55);
        text12.setX(0);
        text12.setY(MainMenu.height1/75*2);
        text12.setText(Endurance.endurance());

        final TextView text13 = (TextView) findViewById(R.id.ch3);
        text13.setTextSize(MainMenu.height1/55);
        text13.setX(0);
        text13.setY(MainMenu.height1/75*3);
        text13.setText(Intelligence.intelligence());

        final TextView text14 = (TextView) findViewById(R.id.ch4);
        text14.setTextSize(MainMenu.height1/55);
        text14.setX(0);
        text14.setY(MainMenu.height1/75*4);
        text14.setText(Health.health());

        final TextView text15 = (TextView) findViewById(R.id.ch5);
        text15.setTextSize(MainMenu.height1/55);
        text15.setX(0);
        text15.setY(MainMenu.height1/75*5);
        text15.setText(Agility.agility());

        final TextView text16 = (TextView) findViewById(R.id.ch6);
        text16.setTextSize(MainMenu.height1/55);
        text16.setX(0);
        text16.setY(MainMenu.height1/75*6);
        text16.setText(Wisdom.winsdom());

        final TextView text17 = (TextView) findViewById(R.id.ch7);
        text17.setTextSize(MainMenu.height1/55);
        text17.setX(0);
        text17.setY(MainMenu.height1/75*7);
        text17.setText(Charisma.charisma());

        final TextView text18 = (TextView) findViewById(R.id.ch8);
        text18.setTextSize(MainMenu.height1/55);
        text18.setX(0);
        text18.setY(MainMenu.height1/75*8);
        text18.setText(Taste.tsxte());

        final TextView text19 = (TextView) findViewById(R.id.ch9);
        text19.setTextSize(MainMenu.height1/55);
        text19.setX(0);
        text19.setY(MainMenu.height1/75*9);
        text19.setText(Will.will());

        final TextView text20 = (TextView) findViewById(R.id.ch10);
        text20.setTextSize(MainMenu.height1/55);
        text20.setX(0);
        text20.setY(MainMenu.height1/75*10);
        text20.setText(Power.power());

    }

}
