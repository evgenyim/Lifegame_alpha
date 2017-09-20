package com.admin.lifegame;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Achievments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievments);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final TextView text = (TextView) findViewById(R.id.textView);
        //text.setTextSize(MainMenu.width1/30);

        final TextView text1 = (TextView) findViewById(R.id.textView1);
        //text1.setTextSize(MainMenu.width1/40);
        text1.setX(0);
        text1.setY(MainMenu.height1/75*1);
        if(Integer.parseInt(Charisma.charisma())>4){
            text1.setText(R.string.achievments1);
            text1.setBackgroundResource(R.drawable.unblockedfon);
        }


        final TextView text2 = (TextView) findViewById(R.id.textView2);
       // text2.setTextSize(MainMenu.width1/40);
        text2.setX(0);
        text2.setY(MainMenu.height1/75*2);
        if(MainMenu.Rangs_count[6]+ MainMenu.Rangs_count[10] > 9) {
            text2.setBackgroundResource(R.drawable.unblockedfon);
            text2.setText(R.string.achievments2);
        }

        final TextView text3 = (TextView) findViewById(R.id.textView3);
       // text3.setTextSize(MainMenu.width1/40);
        text3.setX(0);
        text3.setY(MainMenu.height1/75*3);
        if(MainMenu.Rangs_count[20] + MainMenu.Rangs_count[23] > 9) {
            text3.setBackgroundResource(R.drawable.unblockedfon);
            text3.setText(R.string.achievments3);
        }

        final TextView text4 = (TextView) findViewById(R.id.textView4);
       // text4.setTextSize(MainMenu.width1/40);
        text4.setX(0);
        text4.setY(MainMenu.height1/75*4);

        if(MainMenu.Rangs_count[8] > 9) {
            text4.setText(R.string.achievments4);
            text4.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text5 = (TextView) findViewById(R.id.textView5);
       // text5.setTextSize(MainMenu.width1/40);
        text5.setX(0);
        text5.setY(MainMenu.height1/75*5);
        if(MainMenu.Rangs_count[5] + MainMenu.Rangs_count[17] + MainMenu.Rangs_count[20] > 19) {
            text5.setText(R.string.achievments5);
            text5.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text6 = (TextView) findViewById(R.id.textView6);
       // text6.setTextSize(MainMenu.width1/40);
        text6.setX(0);
        text6.setY(MainMenu.height1/75*6);
        if(MainMenu.Rangs_count[1] + MainMenu.Rangs_count[11] + MainMenu.Rangs_count[13] + MainMenu.Rangs_count[14] + MainMenu.Rangs_count[15] + MainMenu.Rangs_count[16] > 49) {
            text6.setText(R.string.achievments6);
            text6.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text7 = (TextView) findViewById(R.id.textView7);
       // text7.setTextSize(MainMenu.width1/40);
        text7.setX(0);
        text7.setY(MainMenu.height1/75*7);
        if(Integer.parseInt(Intelligence.intelligence())>4){
            text7.setText(R.string.achievments7);
            text7.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text8 = (TextView) findViewById(R.id.textView8);
      //  text8.setTextSize(MainMenu.width1/40);
        text8.setX(0);
        text8.setY(MainMenu.height1/75*8);
        if(Integer.parseInt(Wisdom.winsdom()) + Integer.parseInt(Stress.stress()) > 9){
            text8.setText(R.string.achievments8);
            text8.setBackgroundResource(R.drawable.unblockedfon);
        }

        final TextView text9 = (TextView) findViewById(R.id.textView9);
       // text9.setTextSize(MainMenu.width1/40);
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



        final Toast toast1 = Toast.makeText(getApplicationContext(),"Харизма > 5",Toast.LENGTH_LONG);
        final Toast toast2 = Toast.makeText(getApplicationContext(),"Зарядка + Контрастный душ >= 10",Toast.LENGTH_LONG);
        final Toast toast3 = Toast.makeText(getApplicationContext(),"Рисование + Театр >= 10",Toast.LENGTH_LONG);
        final Toast toast4 = Toast.makeText(getApplicationContext(),"Иностранный язык >=10",Toast.LENGTH_LONG);
        final Toast toast5 = Toast.makeText(getApplicationContext(),"Жонглирование + Программирование + Рисование >= 20",Toast.LENGTH_LONG);
        final Toast toast6 = Toast.makeText(getApplicationContext(),"Бег + Отжимания + Приседания + Подтягивания + Пресс + Подвижный спорт >= 50",Toast.LENGTH_LONG);
        final Toast toast7 = Toast.makeText(getApplicationContext(),"Интеллект >= 5",Toast.LENGTH_LONG);
        final Toast toast8 = Toast.makeText(getApplicationContext(),"Мудрость + Стрессоустойчивость >= 10",Toast.LENGTH_LONG);
        final Toast toast9 = Toast.makeText(getApplicationContext(),"Все навыки > 0 ",Toast.LENGTH_LONG);

        final Button info1 = (Button) findViewById(R.id.info1);
        RelativeLayout.LayoutParams lp_info1 = (RelativeLayout.LayoutParams) info1.getLayoutParams();
        lp_info1.height = MainMenu.width1/15;
        lp_info1.width = MainMenu.width1/15;
        info1.setY(MainMenu.height1/75*1);
        info1.setTypeface(null, Typeface.BOLD);// жирный текст
        info1.setLayoutParams(lp_info1);
        info1.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
                toast1.show();
            }
        };
        info1.setOnClickListener(listinfo1);

        final Button info2 = (Button) findViewById(R.id.info2);
        RelativeLayout.LayoutParams lp_info2 = (RelativeLayout.LayoutParams) info2.getLayoutParams();
        lp_info2.height = MainMenu.width1/15;
        lp_info2.width = MainMenu.width1/15;
        info2.setY(MainMenu.height1/75*2);
        info2.setTypeface(null, Typeface.BOLD);// жирный текст
        info2.setLayoutParams(lp_info2);
        info2.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast1.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
                toast2.show();
            }
        };
        info2.setOnClickListener(listinfo2);

        final Button info3 = (Button) findViewById(R.id.info3);
        RelativeLayout.LayoutParams lp_info3 = (RelativeLayout.LayoutParams) info3.getLayoutParams();
        lp_info3.height = MainMenu.width1/15;
        lp_info3.width = MainMenu.width1/15;
        info3.setTypeface(null, Typeface.BOLD);// жирный текст
        info3.setY(MainMenu.height1/75*3);
        info3.setLayoutParams(lp_info3);
        info3.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast3.show();
                toast1.cancel();
                toast2.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
            }
        };
        info3.setOnClickListener(listinfo3);

        final Button info4 = (Button) findViewById(R.id.info4);
        RelativeLayout.LayoutParams lp_info4 = (RelativeLayout.LayoutParams) info4.getLayoutParams();
        lp_info4.height = MainMenu.width1/15;
        lp_info4.width = MainMenu.width1/15;
        info4.setTypeface(null, Typeface.BOLD);// жирный текст
        info4.setY(MainMenu.height1/75*4);
        info4.setLayoutParams(lp_info4);
        info4.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast4.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
            }
        };
        info4.setOnClickListener(listinfo4);

        final Button info5 = (Button) findViewById(R.id.info5);
        RelativeLayout.LayoutParams lp_info5 = (RelativeLayout.LayoutParams) info5.getLayoutParams();
        lp_info5.height = MainMenu.width1/15;
        lp_info5.width = MainMenu.width1/15;
        info5.setTypeface(null, Typeface.BOLD);// жирный текст
        info5.setY(MainMenu.height1/75*5);
        info5.setLayoutParams(lp_info5);
        info5.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast5.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
            }
        };
        info5.setOnClickListener(listinfo5);

        final Button info6 = (Button) findViewById(R.id.info6);
        RelativeLayout.LayoutParams lp_info6 = (RelativeLayout.LayoutParams) info6.getLayoutParams();
        lp_info6.height = MainMenu.width1/15;
        lp_info6.width = MainMenu.width1/15;
        info6.setTypeface(null, Typeface.BOLD);// жирный текст
        info6.setY(MainMenu.height1/75*6);
        info6.setLayoutParams(lp_info6);
        info6.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast6.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
            }
        };
        info6.setOnClickListener(listinfo6);

        final Button info7 = (Button) findViewById(R.id.info7);
        RelativeLayout.LayoutParams lp_info7 = (RelativeLayout.LayoutParams) info7.getLayoutParams();
        lp_info7.height = MainMenu.width1/15;
        lp_info7.width = MainMenu.width1/15;
        info7.setTypeface(null, Typeface.BOLD);// жирный текст
        info7.setY(MainMenu.height1/75*7);
        info7.setLayoutParams(lp_info7);
        info7.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast7.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast8.cancel();
                toast9.cancel();
            }
        };
        info7.setOnClickListener(listinfo7);

        final Button info8 = (Button) findViewById(R.id.info8);
        RelativeLayout.LayoutParams lp_info8 = (RelativeLayout.LayoutParams) info8.getLayoutParams();
        lp_info8.height = MainMenu.width1/15;
        lp_info8.width = MainMenu.width1/15;
        info8.setTypeface(null, Typeface.BOLD);// жирный текст
        info8.setY(MainMenu.height1/75*8);
        info8.setLayoutParams(lp_info8);
        info8.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast8.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast9.cancel();
            }
        };
        info8.setOnClickListener(listinfo8);

        final Button info9 = (Button) findViewById(R.id.info9);
        RelativeLayout.LayoutParams lp_info9 = (RelativeLayout.LayoutParams) info9.getLayoutParams();
        lp_info9.height = MainMenu.width1/15;
        lp_info9.width = MainMenu.width1/15;
        info9.setTypeface(null, Typeface.BOLD);// жирный текст
        info9.setY(MainMenu.height1/75*9);
        info9.setLayoutParams(lp_info9);
        info9.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast9.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
            }
        };
        info9.setOnClickListener(listinfo9);

    }

}
