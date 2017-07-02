package com.example.admin.lifegame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Rangs_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangs_2);


        final TextView text15 = (TextView) findViewById(R.id.textView15);
        text15.setTextSize(MainMenu.height1/50);
        text15.setX(0);
        text15.setY(MainMenu.height1/150*1);

        final TextView text16 = (TextView) findViewById(R.id.textView16);
        text16.setTextSize(MainMenu.height1/50);
        text16.setX(0);
        text16.setY(MainMenu.height1/150*2);

        final TextView text17 = (TextView) findViewById(R.id.textView17);
        text17.setTextSize(MainMenu.height1/50);
        text17.setX(0);
        text17.setY(MainMenu.height1/150*3);

        final TextView text18 = (TextView) findViewById(R.id.textView18);
        text18.setTextSize(MainMenu.height1/50);
        text18.setX(0);
        text18.setY(MainMenu.height1/150*4);

        final TextView text19 = (TextView) findViewById(R.id.textView19);
        text19.setTextSize(MainMenu.height1/50);
        text19.setX(0);
        text19.setY(MainMenu.height1/150*5);

        final TextView text20 = (TextView) findViewById(R.id.textView20);
        text20.setTextSize(MainMenu.height1/50);
        text20.setX(0);
        text20.setY(MainMenu.height1/150*6);

        final TextView text21 = (TextView) findViewById(R.id.textView21);
        text21.setTextSize(MainMenu.height1/50);
        text21.setX(0);
        text21.setY(MainMenu.height1/150*7);

        final TextView text22 = (TextView) findViewById(R.id.textView22);
        text22.setTextSize(MainMenu.height1/50);
        text22.setX(0);
        text22.setY(MainMenu.height1/150*8);

        final TextView text23 = (TextView) findViewById(R.id.textView23);
        text23.setTextSize(MainMenu.height1/50);
        text23.setX(0);
        text23.setY(MainMenu.height1/150*9);

        ///////////////////

        final TextView rang15 = (TextView) findViewById(R.id.rang15);
        rang15.setTextSize(MainMenu.height1/50);
        rang15.setX(0);
        rang15.setY(MainMenu.height1/150*1);
        rang15.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[15],0)));    //// во все циферки

        final TextView rang16 = (TextView) findViewById(R.id.rang16);
        rang16.setTextSize(MainMenu.height1/50);
        rang16.setX(0);
        rang16.setY(MainMenu.height1/150*2);
        rang16.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[16],0)));  ////


        final TextView rang17 = (TextView) findViewById(R.id.rang17);
        rang17.setTextSize(MainMenu.height1/50);
        rang17.setX(0);
        rang17.setY(MainMenu.height1/150*3);
        rang17.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[17],0)));


        final TextView rang18 = (TextView) findViewById(R.id.rang18);
        rang18.setTextSize(MainMenu.height1/50);
        rang18.setX(0);
        rang18.setY(MainMenu.height1/150*4);
        rang18.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[18],0)));


        final TextView rang19 = (TextView) findViewById(R.id.rang19);
        rang19.setTextSize(MainMenu.height1/50);
        rang19.setX(0);
        rang19.setY(MainMenu.height1/150*5);
        rang19.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[19],0)));

        final TextView rang20 = (TextView) findViewById(R.id.rang20);
        rang20.setTextSize(MainMenu.height1/50);
        rang20.setX(0);
        rang20.setY(MainMenu.height1/150*6);
        rang20.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[20],0)));

        final TextView rang21 = (TextView) findViewById(R.id.rang21);
        rang21.setTextSize(MainMenu.height1/50);
        rang21.setX(0);
        rang21.setY(MainMenu.height1/150*7);
        rang21.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[21],0)));

        final TextView rang22 = (TextView) findViewById(R.id.rang22);
        rang22.setTextSize(MainMenu.height1/50);
        rang22.setX(0);
        rang22.setY(MainMenu.height1/150*8);
        rang22.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[22],0)));

        final TextView rang23 = (TextView) findViewById(R.id.rang23);
        rang23.setTextSize(MainMenu.height1/50);
        rang23.setX(0);
        rang23.setY(MainMenu.height1/150*9);
        rang23.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[23],0)));

        //////////////////////

        final Button minus15 = (Button) findViewById(R.id.minus15);
        minus15.setTypeface(null, Typeface.BOLD);// жирный текст
        RelativeLayout.LayoutParams lp_minus15 = (RelativeLayout.LayoutParams) minus15.getLayoutParams();
        lp_minus15.height = MainMenu.width1/15;
        lp_minus15.width = MainMenu.width1/15;
        minus15.setBackgroundResource(R.drawable.minus_button);
        minus15.setX(0);
        minus15.setY(MainMenu.height1/150*1);
        final View.OnClickListener listminus15 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainMenu.sPref.getInt(Rangs.Rang[15],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[15], MainMenu.sPref.getInt(Rangs.Rang[15], 0) - 1);
                    ed.commit();
                    MainMenu.Rangs_count[15] = MainMenu.sPref.getInt(Rangs.Rang[15], 0);
                    rang15.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[15], 0)));
                }
            }
        };
        minus15.setOnClickListener(listminus15);

        final Button plus15 = (Button) findViewById(R.id.plus15);
        plus15.setTypeface(null, Typeface.BOLD);        // жирный текст
        RelativeLayout.LayoutParams lp_plus15 = (RelativeLayout.LayoutParams) plus15.getLayoutParams();
        lp_plus15.height = MainMenu.width1/15;
        lp_plus15.width = MainMenu.width1/15;
        plus15.setBackgroundResource(R.drawable.plus_button);
        plus15.setX(0);
        plus15.setY(MainMenu.height1/150*1);
        final View.OnClickListener listplus15 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[15], MainMenu.sPref.getInt(Rangs.Rang[15],0)+1);
                ed.commit();
                MainMenu.Rangs_count[15] = MainMenu.sPref.getInt(Rangs.Rang[15],0);
                rang15.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[15],0)));
            }
        };
        plus15.setOnClickListener(listplus15);



        final Button minus16 = (Button) findViewById(R.id.minus16);  ////
        RelativeLayout.LayoutParams lp_minus16 = (RelativeLayout.LayoutParams) minus16.getLayoutParams();
        lp_minus16.height = MainMenu.width1/15;
        lp_minus16.width = MainMenu.width1/15;
        minus16.setBackgroundResource(R.drawable.minus_button);
        minus16.setX(0);
        minus16.setY(MainMenu.height1/150*2);
        final View.OnClickListener listminus16 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[16],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[16], MainMenu.sPref.getInt(Rangs.Rang[16], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[16] = MainMenu.sPref.getInt(Rangs.Rang[16], 0);   ////
                    rang16.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[16], 0))); ////
                }
            }
        };
        minus16.setOnClickListener(listminus16);  ////

        final Button plus16 = (Button) findViewById(R.id.plus16);
        RelativeLayout.LayoutParams lp_plus16 = (RelativeLayout.LayoutParams) plus16.getLayoutParams();
        lp_plus16.height = MainMenu.width1/15;
        lp_plus16.width = MainMenu.width1/15;
        plus16.setBackgroundResource(R.drawable.plus_button);
        plus16.setX(0);
        plus16.setY(MainMenu.height1/150*2);
        final View.OnClickListener listplus16 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[16], MainMenu.sPref.getInt(Rangs.Rang[16],0)+1);
                ed.commit();
                MainMenu.Rangs_count[16] = MainMenu.sPref.getInt(Rangs.Rang[16],0);
                rang16.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[16],0)));
            }
        };
        plus16.setOnClickListener(listplus16);

        final Button minus17 = (Button) findViewById(R.id.minus17);  ////
        RelativeLayout.LayoutParams lp_minus17 = (RelativeLayout.LayoutParams) minus17.getLayoutParams();
        lp_minus17.height = MainMenu.width1/15;
        lp_minus17.width = MainMenu.width1/15;
        minus17.setBackgroundResource(R.drawable.minus_button);
        minus17.setX(0);
        minus17.setY(MainMenu.height1/150*3);
        final View.OnClickListener listminus17 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[17],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[17], MainMenu.sPref.getInt(Rangs.Rang[17], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[17] = MainMenu.sPref.getInt(Rangs.Rang[17], 0);   ////
                    rang17.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[17], 0))); ////
                }
            }
        };
        minus17.setOnClickListener(listminus17);  ////

        final Button plus17 = (Button) findViewById(R.id.plus17);   ////
        RelativeLayout.LayoutParams lp_plus17 = (RelativeLayout.LayoutParams) plus17.getLayoutParams();
        lp_plus17.height = MainMenu.width1/15;
        lp_plus17.width = MainMenu.width1/15;
        plus17.setBackgroundResource(R.drawable.plus_button);
        plus17.setX(0);
        plus17.setY(MainMenu.height1/150*3);
        final View.OnClickListener listplus17 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[17], MainMenu.sPref.getInt(Rangs.Rang[17],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[17] = MainMenu.sPref.getInt(Rangs.Rang[17],0);  ////
                rang17.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[17],0)));   ////
            }
        };
        plus17.setOnClickListener(listplus17);  ////

        final Button minus18 = (Button) findViewById(R.id.minus18);  ////
        RelativeLayout.LayoutParams lp_minus18 = (RelativeLayout.LayoutParams) minus18.getLayoutParams();
        lp_minus18.height = MainMenu.width1/15;
        lp_minus18.width = MainMenu.width1/15;
        minus18.setBackgroundResource(R.drawable.minus_button);
        minus18.setX(0);
        minus18.setY(MainMenu.height1/150*4);
        final View.OnClickListener listminus18 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[18],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[18], MainMenu.sPref.getInt(Rangs.Rang[18], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[18] = MainMenu.sPref.getInt(Rangs.Rang[18], 0);   ////
                    rang18.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[18], 0))); ////
                }
            }
        };
        minus18.setOnClickListener(listminus18);  ////

        final Button plus18 = (Button) findViewById(R.id.plus18);   ////
        RelativeLayout.LayoutParams lp_plus18 = (RelativeLayout.LayoutParams) plus18.getLayoutParams();
        lp_plus18.height = MainMenu.width1/15;
        lp_plus18.width = MainMenu.width1/15;
        plus18.setBackgroundResource(R.drawable.plus_button);
        plus18.setX(0);
        plus18.setY(MainMenu.height1/150*4);
        final View.OnClickListener listplus18 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[18], MainMenu.sPref.getInt(Rangs.Rang[18],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[18] = MainMenu.sPref.getInt(Rangs.Rang[18],0);  ////
                rang18.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[18],0)));   ////
            }
        };
        plus18.setOnClickListener(listplus18);  ////

        final Button minus19= (Button) findViewById(R.id.minus19);  ////
        RelativeLayout.LayoutParams lp_minus19 = (RelativeLayout.LayoutParams) minus19.getLayoutParams();
        lp_minus19.height = MainMenu.width1/15;
        lp_minus19.width = MainMenu.width1/15;
        minus19.setBackgroundResource(R.drawable.minus_button);
        minus19.setX(0);
        minus19.setY(MainMenu.height1/150*5);
        final View.OnClickListener listminus19 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[19],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[19], MainMenu.sPref.getInt(Rangs.Rang[19], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[19] = MainMenu.sPref.getInt(Rangs.Rang[19], 0);   ////
                    rang19.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[19], 0))); ////
                }
            }
        };
        minus19.setOnClickListener(listminus19);  ////

        final Button plus19 = (Button) findViewById(R.id.plus19);   ////
        RelativeLayout.LayoutParams lp_plus19 = (RelativeLayout.LayoutParams) plus19.getLayoutParams();
        lp_plus19.height = MainMenu.width1/15;
        lp_plus19.width = MainMenu.width1/15;
        plus19.setBackgroundResource(R.drawable.plus_button);
        plus19.setX(0);
        plus19.setY(MainMenu.height1/150*5);
        final View.OnClickListener listplus19 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[19], MainMenu.sPref.getInt(Rangs.Rang[19],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[19] = MainMenu.sPref.getInt(Rangs.Rang[19],0);  ////
                rang19.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[19],0)));   ////
            }
        };
        plus19.setOnClickListener(listplus19);  ////

        final Button minus20 = (Button) findViewById(R.id.minus20);  ////
        RelativeLayout.LayoutParams lp_minus20 = (RelativeLayout.LayoutParams) minus20.getLayoutParams();
        lp_minus20.height = MainMenu.width1/15;
        lp_minus20.width = MainMenu.width1/15;
        minus20.setBackgroundResource(R.drawable.minus_button);
        minus20.setX(0);
        minus20.setY(MainMenu.height1/150*6);
        final View.OnClickListener listminus20 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[20],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[20], MainMenu.sPref.getInt(Rangs.Rang[20], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[20] = MainMenu.sPref.getInt(Rangs.Rang[20], 0);   ////
                    rang20.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[20], 0))); ////
                }
            }
        };
        minus20.setOnClickListener(listminus20);  ////

        final Button plus20 = (Button) findViewById(R.id.plus20);   ////
        RelativeLayout.LayoutParams lp_plus20 = (RelativeLayout.LayoutParams) plus20.getLayoutParams();
        lp_plus20.height = MainMenu.width1/15;
        lp_plus20.width = MainMenu.width1/15;
        plus20.setBackgroundResource(R.drawable.plus_button);
        plus20.setX(0);
        plus20.setY(MainMenu.height1/150*6);
        final View.OnClickListener listplus20 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[20], MainMenu.sPref.getInt(Rangs.Rang[20],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[20] = MainMenu.sPref.getInt(Rangs.Rang[20],0);  ////
                rang20.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[20],0)));   ////
            }
        };
        plus20.setOnClickListener(listplus20);  ////

        final Button minus21 = (Button) findViewById(R.id.minus21);  ////
        RelativeLayout.LayoutParams lp_minus21 = (RelativeLayout.LayoutParams) minus21.getLayoutParams();
        lp_minus21.height = MainMenu.width1/15;
        lp_minus21.width = MainMenu.width1/15;
        minus21.setBackgroundResource(R.drawable.minus_button);
        minus21.setX(0);
        minus21.setY(MainMenu.height1/150*7);
        final View.OnClickListener listminus21 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[21],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[21], MainMenu.sPref.getInt(Rangs.Rang[21], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[21] = MainMenu.sPref.getInt(Rangs.Rang[21], 0);   ////
                    rang21.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[21], 0))); ////
                }
            }
        };
        minus21.setOnClickListener(listminus21);  ////

        final Button plus21 = (Button) findViewById(R.id.plus21);   ////
        RelativeLayout.LayoutParams lp_plus21 = (RelativeLayout.LayoutParams) plus21.getLayoutParams();
        lp_plus21.height = MainMenu.width1/15;
        lp_plus21.width = MainMenu.width1/15;
        plus21.setBackgroundResource(R.drawable.plus_button);
        plus21.setX(0);
        plus21.setY(MainMenu.height1/150*7);
        final View.OnClickListener listplus21= new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[21], MainMenu.sPref.getInt(Rangs.Rang[21],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[21] = MainMenu.sPref.getInt(Rangs.Rang[21],0);  ////
                rang21.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[21],0)));   ////
            }
        };
        plus21.setOnClickListener(listplus21);  ////

        final Button minus22 = (Button) findViewById(R.id.minus22);  ////
        RelativeLayout.LayoutParams lp_minus22 = (RelativeLayout.LayoutParams) minus22.getLayoutParams();
        lp_minus22.height = MainMenu.width1/15;
        lp_minus22.width = MainMenu.width1/15;
        minus22.setBackgroundResource(R.drawable.minus_button);
        minus22.setX(0);
        minus22.setY(MainMenu.height1/150*8);
        final View.OnClickListener listminus22 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[22],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[22], MainMenu.sPref.getInt(Rangs.Rang[22], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[22] = MainMenu.sPref.getInt(Rangs.Rang[22], 0);   ////
                    rang22.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[22], 0))); ////
                }
            }
        };
        minus22.setOnClickListener(listminus22);  ////

        final Button plus22 = (Button) findViewById(R.id.plus22);   ////
        RelativeLayout.LayoutParams lp_plus22 = (RelativeLayout.LayoutParams) plus22.getLayoutParams();
        lp_plus22.height = MainMenu.width1/15;
        lp_plus22.width = MainMenu.width1/15;
        plus22.setBackgroundResource(R.drawable.plus_button);
        plus22.setX(0);
        plus22.setY(MainMenu.height1/150*8);
        final View.OnClickListener listplus22 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[22], MainMenu.sPref.getInt(Rangs.Rang[22],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[22] = MainMenu.sPref.getInt(Rangs.Rang[22],0);  ////
                rang22.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[22],0)));   ////
            }
        };
        plus22.setOnClickListener(listplus22);  ////


        final Button minus23= (Button) findViewById(R.id.minus23);  ////
        RelativeLayout.LayoutParams lp_minus23 = (RelativeLayout.LayoutParams) minus23.getLayoutParams();
        lp_minus23.height = MainMenu.width1/15;
        lp_minus23.width = MainMenu.width1/15;
        minus23.setBackgroundResource(R.drawable.minus_button);
        minus23.setX(0);
        minus23.setY(MainMenu.height1/150*9);
        final View.OnClickListener listminus23 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //
                if(MainMenu.sPref.getInt(Rangs.Rang[23],0)>0) {
                    SharedPreferences.Editor ed = MainMenu.sPref.edit();
                    ed.putInt(Rangs.Rang[23], MainMenu.sPref.getInt(Rangs.Rang[23], 0) - 1);   ////
                    ed.commit();
                    MainMenu.Rangs_count[9] = MainMenu.sPref.getInt(Rangs.Rang[23], 0);   ////
                    rang23.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[23], 0))); ////
                }
            }
        };
        minus23.setOnClickListener(listminus23);  ////

        final Button plus23 = (Button) findViewById(R.id.plus23);   ////
        RelativeLayout.LayoutParams lp_plus23 = (RelativeLayout.LayoutParams) plus23.getLayoutParams();
        lp_plus23.height = MainMenu.width1/15;
        lp_plus23.width = MainMenu.width1/15;
        plus23.setBackgroundResource(R.drawable.plus_button);
        plus23.setX(0);
        plus23.setY(MainMenu.height1/150*9);
        final View.OnClickListener listplus23 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //
                SharedPreferences.Editor ed = MainMenu.sPref.edit();
                ed.putInt(Rangs.Rang[23], MainMenu.sPref.getInt(Rangs.Rang[23],0)+1);   ////
                ed.commit();
                MainMenu.Rangs_count[23] = MainMenu.sPref.getInt(Rangs.Rang[23],0);  ////
                rang23.setText(String.valueOf(MainMenu.sPref.getInt(Rangs.Rang[23],0)));   ////
            }
        };
        plus23.setOnClickListener(listplus23);  ////



    }
}
