package com.example.admin.lifegame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public class Rangs extends AppCompatActivity {

    static String[] Rang = new String[31];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangs);
        final Rangs this_ = this;
        final Button btn1 = (Button) findViewById(R.id.button);
        final View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_,Rangs_2.class);
                startActivity(intent);
                finish();
            }
        };
        btn1.setOnClickListener(listener1);

       // final String[] Rang = new String[31];
        for(int i = 1;i<=30;i++) {
            Rang[i] = "Rang_"+i;
        }

        final TextView text = (TextView) findViewById(R.id.textView);
        text.setTextSize(MainMenu.height1/30);

        final TextView text1 = (TextView) findViewById(R.id.textView1);
        text1.setTextSize(MainMenu.height1/50);
        text1.setX(0);
        text1.setY(MainMenu.height1/150*1);

        final TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setTextSize(MainMenu.height1/50);
        text2.setX(0);
        text2.setY(MainMenu.height1/150*2);

        final TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setTextSize(MainMenu.height1/50);
        text3.setX(0);
        text3.setY(MainMenu.height1/150*3);

        final TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setTextSize(MainMenu.height1/50);
        text4.setX(0);
        text4.setY(MainMenu.height1/150*4);

        final TextView text5 = (TextView) findViewById(R.id.textView5);
        text5.setTextSize(MainMenu.height1/50);
        text5.setX(0);
        text5.setY(MainMenu.height1/150*5);

        final TextView text6 = (TextView) findViewById(R.id.textView6);
        text6.setTextSize(MainMenu.height1/50);
        text6.setX(0);
        text6.setY(MainMenu.height1/150*6);

        final TextView text7 = (TextView) findViewById(R.id.textView7);
        text7.setTextSize(MainMenu.height1/50);
        text7.setX(0);
        text7.setY(MainMenu.height1/150*7);

        final TextView text8 = (TextView) findViewById(R.id.textView8);
        text8.setTextSize(MainMenu.height1/50);
        text8.setX(0);
        text8.setY(MainMenu.height1/150*8);

        final TextView text9 = (TextView) findViewById(R.id.textView9);
        text9.setTextSize(MainMenu.height1/50);
        text9.setX(0);
        text9.setY(MainMenu.height1/150*9);

        final TextView text10 = (TextView) findViewById(R.id.textView10);
        text10.setTextSize(MainMenu.height1/50);
        text10.setX(0);
        text10.setY(MainMenu.height1/150*10);

        final TextView text11 = (TextView) findViewById(R.id.textView11);
        text11.setTextSize(MainMenu.height1/50);
        text11.setX(0);
        text11.setY(MainMenu.height1/150*11);

        final TextView text12 = (TextView) findViewById(R.id.textView12);
        text12.setTextSize(MainMenu.height1/50);
        text12.setX(0);
        text12.setY(MainMenu.height1/150*12);

        final TextView text13 = (TextView) findViewById(R.id.textView13);
        text13.setTextSize(MainMenu.height1/50);
        text13.setX(0);
        text13.setY(MainMenu.height1/150*13);

        final TextView text14 = (TextView) findViewById(R.id.textView14);
        text14.setTextSize(MainMenu.height1/50);
        text14.setX(0);
        text14.setY(MainMenu.height1/150*14);

        final TextView rang1 = (TextView) findViewById(R.id.rang1);
        rang1.setTextSize(MainMenu.height1/50);
        rang1.setX(0);
        rang1.setY(MainMenu.height1/150*1);
        rang1.setText(String.valueOf(MainMenu.sPref.getInt(Rang[1],0)));    //// во все циферки

        final TextView rang2 = (TextView) findViewById(R.id.rang2);
        rang2.setTextSize(MainMenu.height1/50);
        rang2.setX(0);
        rang2.setY(MainMenu.height1/150*2);
        rang2.setText(String.valueOf(MainMenu.sPref.getInt(Rang[2],0)));  ////


        final TextView rang3 = (TextView) findViewById(R.id.rang3);
        rang3.setTextSize(MainMenu.height1/50);
        rang3.setX(0);
        rang3.setY(MainMenu.height1/150*3);
        rang3.setText(String.valueOf(MainMenu.sPref.getInt(Rang[3],0)));


        final TextView rang4 = (TextView) findViewById(R.id.rang4);
        rang4.setTextSize(MainMenu.height1/50);
        rang4.setX(0);
        rang4.setY(MainMenu.height1/150*4);
        rang4.setText(String.valueOf(MainMenu.sPref.getInt(Rang[4],0)));


        final TextView rang5 = (TextView) findViewById(R.id.rang5);
        rang5.setTextSize(MainMenu.height1/50);
        rang5.setX(0);
        rang5.setY(MainMenu.height1/150*5);
        rang5.setText(String.valueOf(MainMenu.sPref.getInt(Rang[5],0)));

        final TextView rang6 = (TextView) findViewById(R.id.rang6);
        rang6.setTextSize(MainMenu.height1/50);
        rang6.setX(0);
        rang6.setY(MainMenu.height1/150*6);
        rang6.setText(String.valueOf(MainMenu.sPref.getInt(Rang[6],0)));

        final TextView rang7 = (TextView) findViewById(R.id.rang7);
        rang7.setTextSize(MainMenu.height1/50);
        rang7.setX(0);
        rang7.setY(MainMenu.height1/150*7);
        rang7.setText(String.valueOf(MainMenu.sPref.getInt(Rang[7],0)));

        final TextView rang8 = (TextView) findViewById(R.id.rang8);
        rang8.setTextSize(MainMenu.height1/50);
        rang8.setX(0);
        rang8.setY(MainMenu.height1/150*8);
        rang8.setText(String.valueOf(MainMenu.sPref.getInt(Rang[8],0)));

        final TextView rang9 = (TextView) findViewById(R.id.rang9);
        rang9.setTextSize(MainMenu.height1/50);
        rang9.setX(0);
        rang9.setY(MainMenu.height1/150*9);
        rang9.setText(String.valueOf(MainMenu.sPref.getInt(Rang[9],0)));

        final TextView rang10 = (TextView) findViewById(R.id.rang10);
        rang10.setTextSize(MainMenu.height1/50);
        rang10.setX(0);
        rang10.setY(MainMenu.height1/150*10);
        rang10.setText(String.valueOf(MainMenu.sPref.getInt(Rang[10],0)));

        final TextView rang11 = (TextView) findViewById(R.id.rang11);
        rang11.setTextSize(MainMenu.height1/50);
        rang11.setX(0);
        rang11.setY(MainMenu.height1/150*11);
        rang11.setText(String.valueOf(MainMenu.sPref.getInt(Rang[11],0)));

        final TextView rang12 = (TextView) findViewById(R.id.rang12);
        rang12.setTextSize(MainMenu.height1/50);
        rang12.setX(0);
        rang12.setY(MainMenu.height1/150*12);
        rang12.setText(String.valueOf(MainMenu.sPref.getInt(Rang[12],0)));

        final TextView rang13 = (TextView) findViewById(R.id.rang13);
        rang13.setTextSize(MainMenu.height1/50);
        rang13.setX(0);
        rang13.setY(MainMenu.height1/150*13);
        rang13.setText(String.valueOf(MainMenu.sPref.getInt(Rang[13],0)));

        final TextView rang14 = (TextView) findViewById(R.id.rang14);
        rang14.setTextSize(MainMenu.height1/50);
        rang14.setX(0);
        rang14.setY(MainMenu.height1/150*14);
        rang14.setText(String.valueOf(MainMenu.sPref.getInt(Rang[14],0)));

        final Button minus1 = (Button) findViewById(R.id.minus1);
        minus1.setTypeface(null, Typeface.BOLD);// жирный текст
        minus1.setX(0);
        minus1.setY(MainMenu.height1/150*1);
        final View.OnClickListener listminus1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[1], MainMenu.sPref.getInt(Rang[1],0)-1);
                ed.commit();
                MainMenu.Rangs_count[1] = MainMenu.sPref.getInt(Rang[1],0);
                rang1.setText(String.valueOf(MainMenu.sPref.getInt(Rang[1],0)));
            }
        };
        minus1.setOnClickListener(listminus1);

        final Button plus1 = (Button) findViewById(R.id.plus1);
        plus1.setTypeface(null, Typeface.BOLD);        // жирный текст
        plus1.setX(0);
        plus1.setY(MainMenu.height1/150*1);
        final View.OnClickListener listplus1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[1], MainMenu.sPref.getInt(Rang[1],0)+1);
                ed.commit();
                MainMenu.Rangs_count[1] = MainMenu.sPref.getInt(Rang[1],0);
                rang1.setText(String.valueOf(MainMenu.sPref.getInt(Rang[1],0)));
            }
        };
        plus1.setOnClickListener(listplus1);



        final Button minus2 = (Button) findViewById(R.id.minus2);  ////
        minus2.setX(0);
        minus2.setY(MainMenu.height1/150*2);
        final View.OnClickListener listminus2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[2], MainMenu.sPref.getInt(Rang[2],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[2] = MainMenu.sPref.getInt(Rang[2],0);   ////
                rang2.setText(String.valueOf(MainMenu.sPref.getInt(Rang[2],0))); ////
            }
        };
        minus2.setOnClickListener(listminus2);  ////

        final Button plus2 = (Button) findViewById(R.id.plus2);
        plus2.setX(0);
        plus2.setY(MainMenu.height1/150*2);
        final View.OnClickListener listplus2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[2], MainMenu.sPref.getInt(Rang[2],0)+1);
                ed.commit();
                MainMenu.Rangs_count[2] = MainMenu.sPref.getInt(Rang[2],0);
                rang2.setText(String.valueOf(MainMenu.sPref.getInt(Rang[2],0)));
            }
        };
        plus2.setOnClickListener(listplus2);

        final Button minus3 = (Button) findViewById(R.id.minus3);  ////
        minus3.setX(0);
        minus3.setY(MainMenu.height1/150*3);
        final View.OnClickListener listminus3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[3], MainMenu.sPref.getInt(Rang[3],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[3] = MainMenu.sPref.getInt(Rang[3],0);   ////
                rang3.setText(String.valueOf(MainMenu.sPref.getInt(Rang[3],0))); ////
            }
        };
        minus3.setOnClickListener(listminus3);  ////

        final Button plus3 = (Button) findViewById(R.id.plus3);   ////
        plus3.setX(0);
        plus3.setY(MainMenu.height1/150*3);
        final View.OnClickListener listplus3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[3], MainMenu.sPref.getInt(Rang[3],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[3] = MainMenu.sPref.getInt(Rang[3],0);  ////
                rang3.setText(String.valueOf(MainMenu.sPref.getInt(Rang[3],0)));   ////
            }
        };
        plus3.setOnClickListener(listplus3);  ////

        final Button minus4 = (Button) findViewById(R.id.minus4);  ////
        minus4.setX(0);
        minus4.setY(MainMenu.height1/150*4);
        final View.OnClickListener listminus4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[4], MainMenu.sPref.getInt(Rang[4],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[4] = MainMenu.sPref.getInt(Rang[4],0);   ////
                rang4.setText(String.valueOf(MainMenu.sPref.getInt(Rang[4],0))); ////
            }
        };
        minus4.setOnClickListener(listminus4);  ////

        final Button plus4 = (Button) findViewById(R.id.plus4);   ////
        plus4.setX(0);
        plus4.setY(MainMenu.height1/150*4);
        final View.OnClickListener listplus4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[4], MainMenu.sPref.getInt(Rang[4],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[4] = MainMenu.sPref.getInt(Rang[4],0);  ////
                rang4.setText(String.valueOf(MainMenu.sPref.getInt(Rang[4],0)));   ////
            }
        };
        plus4.setOnClickListener(listplus4);  ////

        final Button minus5 = (Button) findViewById(R.id.minus5);  ////
        minus5.setX(0);
        minus5.setY(MainMenu.height1/150*5);
        final View.OnClickListener listminus5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[5], MainMenu.sPref.getInt(Rang[5],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[5] = MainMenu.sPref.getInt(Rang[5],0);   ////
                rang5.setText(String.valueOf(MainMenu.sPref.getInt(Rang[5],0))); ////
            }
        };
        minus5.setOnClickListener(listminus5);  ////

        final Button plus5 = (Button) findViewById(R.id.plus5);   ////
        plus5.setX(0);
        plus5.setY(MainMenu.height1/150*5);
        final View.OnClickListener listplus5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[5], MainMenu.sPref.getInt(Rang[5],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[5] = MainMenu.sPref.getInt(Rang[5],0);  ////
                rang5.setText(String.valueOf(MainMenu.sPref.getInt(Rang[5],0)));   ////
            }
        };
        plus5.setOnClickListener(listplus5);  ////

        final Button minus6 = (Button) findViewById(R.id.minus6);  ////
        minus6.setX(0);
        minus6.setY(MainMenu.height1/150*6);
        final View.OnClickListener listminus6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[6], MainMenu.sPref.getInt(Rang[6],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[6] = MainMenu.sPref.getInt(Rang[6],0);   ////
                rang6.setText(String.valueOf(MainMenu.sPref.getInt(Rang[6],0))); ////
            }
        };
        minus6.setOnClickListener(listminus6);  ////

        final Button plus6 = (Button) findViewById(R.id.plus6);   ////
        plus6.setX(0);
        plus6.setY(MainMenu.height1/150*6);
        final View.OnClickListener listplus6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[6], MainMenu.sPref.getInt(Rang[6],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[6] = MainMenu.sPref.getInt(Rang[6],0);  ////
                rang6.setText(String.valueOf(MainMenu.sPref.getInt(Rang[6],0)));   ////
            }
        };
        plus6.setOnClickListener(listplus6);  ////

        final Button minus7 = (Button) findViewById(R.id.minus7);  ////
        minus7.setX(0);
        minus7.setY(MainMenu.height1/150*7);
        final View.OnClickListener listminus7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[7], MainMenu.sPref.getInt(Rang[7],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[7] = MainMenu.sPref.getInt(Rang[7],0);   ////
                rang7.setText(String.valueOf(MainMenu.sPref.getInt(Rang[7],0))); ////
            }
        };
        minus7.setOnClickListener(listminus7);  ////

        final Button plus7 = (Button) findViewById(R.id.plus7);   ////
        plus7.setX(0);
        plus7.setY(MainMenu.height1/150*7);
        final View.OnClickListener listplus7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[7], MainMenu.sPref.getInt(Rang[7],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[7] = MainMenu.sPref.getInt(Rang[7],0);  ////
                rang7.setText(String.valueOf(MainMenu.sPref.getInt(Rang[7],0)));   ////
            }
        };
        plus7.setOnClickListener(listplus7);  ////

        final Button minus8 = (Button) findViewById(R.id.minus8);  ////
        minus8.setX(0);
        minus8.setY(MainMenu.height1/150*8);
        final View.OnClickListener listminus8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[8], MainMenu.sPref.getInt(Rang[8],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[8] = MainMenu.sPref.getInt(Rang[8],0);   ////
                rang8.setText(String.valueOf(MainMenu.sPref.getInt(Rang[8],0))); ////
            }
        };
        minus8.setOnClickListener(listminus8);  ////

        final Button plus8 = (Button) findViewById(R.id.plus8);   ////
        plus8.setX(0);
        plus8.setY(MainMenu.height1/150*8);
        final View.OnClickListener listplus8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[8], MainMenu.sPref.getInt(Rang[8],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[8] = MainMenu.sPref.getInt(Rang[8],0);  ////
                rang8.setText(String.valueOf(MainMenu.sPref.getInt(Rang[8],0)));   ////
            }
        };
        plus8.setOnClickListener(listplus8);  ////


        final Button minus9 = (Button) findViewById(R.id.minus9);  ////
        minus9.setX(0);
        minus9.setY(MainMenu.height1/150*9);
        final View.OnClickListener listminus9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[9], MainMenu.sPref.getInt(Rang[9],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[9] = MainMenu.sPref.getInt(Rang[9],0);   ////
                rang9.setText(String.valueOf(MainMenu.sPref.getInt(Rang[9],0))); ////
            }
        };
        minus9.setOnClickListener(listminus9);  ////

        final Button plus9 = (Button) findViewById(R.id.plus9);   ////
        plus9.setX(0);
        plus9.setY(MainMenu.height1/150*9);
        final View.OnClickListener listplus9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[9], MainMenu.sPref.getInt(Rang[9],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[9] = MainMenu.sPref.getInt(Rang[9],0);  ////
                rang9.setText(String.valueOf(MainMenu.sPref.getInt(Rang[9],0)));   ////
            }
        };
        plus9.setOnClickListener(listplus9);  ////


        final Button minus10 = (Button) findViewById(R.id.minus10);  ////
        minus10.setX(0);
        minus10.setY(MainMenu.height1/150*10);
        final View.OnClickListener listminus10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[10], MainMenu.sPref.getInt(Rang[10],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[10] = MainMenu.sPref.getInt(Rang[10],0);   ////
                rang10.setText(String.valueOf(MainMenu.sPref.getInt(Rang[10],0))); ////
            }
        };
        minus10.setOnClickListener(listminus10);  ////

        final Button plus10 = (Button) findViewById(R.id.plus10);   ////
        plus10.setX(0);
        plus10.setY(MainMenu.height1/150*10);
        final View.OnClickListener listplus10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[10], MainMenu.sPref.getInt(Rang[10],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[10] = MainMenu.sPref.getInt(Rang[10],0);  ////
                rang10.setText(String.valueOf(MainMenu.sPref.getInt(Rang[10],0)));   ////
            }
        };
        plus10.setOnClickListener(listplus10);  ////


        final Button minus11 = (Button) findViewById(R.id.minus11);  ////
        minus11.setX(0);
        minus11.setY(MainMenu.height1/150*11);
        final View.OnClickListener listminus11 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[11], MainMenu.sPref.getInt(Rang[11],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[11] = MainMenu.sPref.getInt(Rang[11],0);   ////
                rang11.setText(String.valueOf(MainMenu.sPref.getInt(Rang[11],0))); ////
            }
        };
        minus11.setOnClickListener(listminus11);  ////

        final Button plus11 = (Button) findViewById(R.id.plus11);   ////
        plus11.setX(0);
        plus11.setY(MainMenu.height1/150*11);
        final View.OnClickListener listplus11 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[11], MainMenu.sPref.getInt(Rang[11],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[11] = MainMenu.sPref.getInt(Rang[11],0);  ////
                rang11.setText(String.valueOf(MainMenu.sPref.getInt(Rang[11],0)));   ////
            }
        };
        plus11.setOnClickListener(listplus11);  ////

        final Button minus12 = (Button) findViewById(R.id.minus12);  ////
        minus12.setX(0);
        minus12.setY(MainMenu.height1/150*12);
        final View.OnClickListener listminus12 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[12], MainMenu.sPref.getInt(Rang[12],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[12] = MainMenu.sPref.getInt(Rang[12],0);   ////
                rang12.setText(String.valueOf(MainMenu.sPref.getInt(Rang[12],0))); ////
            }
        };
        minus12.setOnClickListener(listminus12);  ////

        final Button plus12= (Button) findViewById(R.id.plus12);   ////
        plus12.setX(0);
        plus12.setY(MainMenu.height1/150*12);
        final View.OnClickListener listplus12 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[12], MainMenu.sPref.getInt(Rang[12],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[12] = MainMenu.sPref.getInt(Rang[12],0);  ////
                rang12.setText(String.valueOf(MainMenu.sPref.getInt(Rang[12],0)));   ////
            }
        };
        plus12.setOnClickListener(listplus12);  ////


        final Button minus13 = (Button) findViewById(R.id.minus13);  ////
        minus13.setX(0);
        minus13.setY(MainMenu.height1/150*13);
        final View.OnClickListener listminus13 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[13], MainMenu.sPref.getInt(Rang[13],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[13] = MainMenu.sPref.getInt(Rang[13],0);   ////
                rang13.setText(String.valueOf(MainMenu.sPref.getInt(Rang[13],0))); ////
            }
        };
        minus13.setOnClickListener(listminus13);  ////

        final Button plus13 = (Button) findViewById(R.id.plus13);   ////
        plus13.setX(0);
        plus13.setY(MainMenu.height1/150*13);
        final View.OnClickListener listplus13 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[13], MainMenu.sPref.getInt(Rang[13],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[13] = MainMenu.sPref.getInt(Rang[13],0);  ////
                rang13.setText(String.valueOf(MainMenu.sPref.getInt(Rang[13],0)));   ////
            }
        };
        plus13.setOnClickListener(listplus13);  ////

        final Button minus14 = (Button) findViewById(R.id.minus14);  ////
        minus14.setX(0);
        minus14.setY(MainMenu.height1/150*14);
        final View.OnClickListener listminus14 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[14], MainMenu.sPref.getInt(Rang[14],0)-1);   ////
                ed.commit();
                MainMenu.Rangs_count[14] = MainMenu.sPref.getInt(Rang[14],0);   ////
                rang14.setText(String.valueOf(MainMenu.sPref.getInt(Rang[14],0))); ////
            }
        };
        minus14.setOnClickListener(listminus14);  ////

        final Button plus14 = (Button) findViewById(R.id.plus14);   ////
        plus14.setX(0);
        plus14.setY(MainMenu.height1/150*14);
        final View.OnClickListener listplus14 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rang[14], MainMenu.sPref.getInt(Rang[14],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[14] = MainMenu.sPref.getInt(Rang[14],0);  ////
                rang14.setText(String.valueOf(MainMenu.sPref.getInt(Rang[14],0)));   ////
            }
        };
        plus14.setOnClickListener(listplus14);  ////

    }


}