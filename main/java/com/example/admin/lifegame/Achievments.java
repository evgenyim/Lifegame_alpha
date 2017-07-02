package com.example.admin.lifegame;

import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Achievments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievments);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final TextView text = (TextView) findViewById(R.id.textView);
        text.setTextSize(MainMenu.height1/30);

        final TextView text1 = (TextView) findViewById(R.id.textView1);
        text1.setTextSize(MainMenu.height1/50);
        text1.setX(0);
        text1.setY(MainMenu.height1/75*1);
        if(Integer.parseInt(Charisma.charisma())>4){
            text1.setText(R.string.achievments1);
            text1.setBackgroundResource(R.drawable.unblockedfon);
        }


        final TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setTextSize(MainMenu.height1/50);
        text2.setX(0);
        text2.setY(MainMenu.height1/75*2);
        if(MainMenu.Rangs_count[6]+ MainMenu.Rangs_count[10] > 9) {
            text2.setBackgroundResource(R.drawable.unblockedfon);
            text2.setText(R.string.achievments2);
        }

        final TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setTextSize(MainMenu.height1/50);
        text3.setX(0);
        text3.setY(MainMenu.height1/75*3);
        if(MainMenu.Rangs_count[18] + MainMenu.Rangs_count[23] > 9) {
            text3.setBackgroundResource(R.drawable.unblockedfon);
            text3.setText(R.string.achievments3);
        }

        final TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setTextSize(MainMenu.height1/50);
        text4.setX(0);
        text4.setY(MainMenu.height1/75*4);

        if(MainMenu.Rangs_count[8] > 9) {
            text4.setText(R.string.achievments4);
            text4.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text5 = (TextView) findViewById(R.id.textView5);
        text5.setTextSize(MainMenu.height1/50);
        text5.setX(0);
        text5.setY(MainMenu.height1/75*5);
        if(MainMenu.Rangs_count[5] + MainMenu.Rangs_count[17] + MainMenu.Rangs_count[20] > 19) {
            text5.setText(R.string.achievments5);
            text5.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text6 = (TextView) findViewById(R.id.textView6);
        text6.setTextSize(MainMenu.height1/50);
        text6.setX(0);
        text6.setY(MainMenu.height1/75*6);
        if(MainMenu.Rangs_count[1] + MainMenu.Rangs_count[11] + MainMenu.Rangs_count[13] + MainMenu.Rangs_count[14] + MainMenu.Rangs_count[15] + MainMenu.Rangs_count[16] > 49) {
            text6.setText(R.string.achievments6);
            text6.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text7 = (TextView) findViewById(R.id.textView7);
        text7.setTextSize(MainMenu.height1/50);
        text7.setX(0);
        text7.setY(MainMenu.height1/75*7);
        if(Integer.parseInt(Intelligence.intelligence())>4){
            text7.setText(R.string.achievments7);
            text7.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text8 = (TextView) findViewById(R.id.textView8);
        text8.setTextSize(MainMenu.height1/50);
        text8.setX(0);
        text8.setY(MainMenu.height1/75*8);
        if(Integer.parseInt(Wisdom.winsdom()) + Integer.parseInt(Stress.stress()) > 9){
            text8.setText(R.string.achievments8);
            text8.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text9 = (TextView) findViewById(R.id.textView9);
        text9.setTextSize(MainMenu.height1/50);
        text9.setX(0);
        text9.setY(MainMenu.height1/75*9);
        boolean all = true;
        for (int i = 1;i<=23; i++){
            if(MainMenu.Rangs_count[i]<1) {
                all = false;
            }
        }
        if(all) {
            text9.setText(R.string.achievments9);
            text9.setBackgroundResource(R.drawable.unblockedfon);
        }

    }

}
