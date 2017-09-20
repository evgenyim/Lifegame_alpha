package com.admin.lifegame;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.admin.lifegame.MainMenu;

import static com.admin.lifegame.MainMenu.height1;

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
      //  text1.setTextSize(MainMenu.width1/50);
        text1.setX(0);
        text1.setY(MainMenu.height1/75*1);

        final TextView text2 = (TextView) findViewById(R.id.textView2);
       // text2.setTextSize(MainMenu.width1/50);
        text2.setX(0);
        text2.setY(MainMenu.height1/75*2);

        final TextView text3 = (TextView) findViewById(R.id.textView3);
      //  text3.setTextSize(MainMenu.width1/50);
        text3.setX(0);
        text3.setY(MainMenu.height1/75*3);

        final TextView text4 = (TextView) findViewById(R.id.textView4);
      //  text4.setTextSize(MainMenu.width1/50);
        text4.setX(0);
        text4.setY(MainMenu.height1/75*4);

        final TextView text5 = (TextView) findViewById(R.id.textView5);
        //text5.setTextSize(MainMenu.width1/50);
        text5.setX(0);
        text5.setY(MainMenu.height1/75*5);

        final TextView text6 = (TextView) findViewById(R.id.textView6);
       // text6.setTextSize(MainMenu.width1/50);
        text6.setX(0);
        text6.setY(MainMenu.height1/75*6);

        final TextView text7 = (TextView) findViewById(R.id.textView7);
       // text7.setTextSize(MainMenu.width1/50);
        text7.setX(0);
        text7.setY(MainMenu.height1/75*7);

        final TextView text8 = (TextView) findViewById(R.id.textView8);
        //text8.setTextSize(MainMenu.width1/50);
        text8.setX(0);
        text8.setY(MainMenu.height1/75*8);

        final TextView text9 = (TextView) findViewById(R.id.textView9);
       // text9.setTextSize(MainMenu.width1/50);
        text9.setX(0);
        text9.setY(MainMenu.height1/75*9);

        final TextView text10 = (TextView) findViewById(R.id.textView10);
       // text10.setTextSize(MainMenu.width1/50);
        text10.setX(0);
        text10.setY(MainMenu.height1/75*10);

        final TextView text11 = (TextView) findViewById(R.id.ch1);
       // text11.setTextSize(MainMenu.width1/50);
        text11.setX(0);
        text11.setY(MainMenu.height1/75*1);
        text11.setText(Stress.stress());

        final TextView text12 = (TextView) findViewById(R.id.ch2);
       // text12.setTextSize(MainMenu.width1/50);
        text12.setX(0);
        text12.setY(MainMenu.height1/75*2);
        text12.setText(Endurance.endurance());

        final TextView text13 = (TextView) findViewById(R.id.ch3);
       // text13.setTextSize(MainMenu.width1/50);
        text13.setX(0);
        text13.setY(MainMenu.height1/75*3);
        text13.setText(Intelligence.intelligence());

        final TextView text14 = (TextView) findViewById(R.id.ch4);
        //text14.setTextSize(MainMenu.width1/50);
        text14.setX(0);
        text14.setY(MainMenu.height1/75*4);
        text14.setText(Health.health());

        final TextView text15 = (TextView) findViewById(R.id.ch5);
       // text15.setTextSize(MainMenu.width1/50);
        text15.setX(0);
        text15.setY(MainMenu.height1/75*5);
        text15.setText(Agility.agility());

        final TextView text16 = (TextView) findViewById(R.id.ch6);
       // text16.setTextSize(MainMenu.width1/50);
        text16.setX(0);
        text16.setY(MainMenu.height1/75*6);
        text16.setText(Wisdom.winsdom());

        final TextView text17 = (TextView) findViewById(R.id.ch7);
       // text17.setTextSize(MainMenu.width1/50);
        text17.setX(0);
        text17.setY(MainMenu.height1/75*7);
        text17.setText(Charisma.charisma());

        final TextView text18 = (TextView) findViewById(R.id.ch8);
       // text18.setTextSize(MainMenu.width1/50);
        text18.setX(0);
        text18.setY(MainMenu.height1/75*8);
        text18.setText(Taste.tsxte());

        final TextView text19 = (TextView) findViewById(R.id.ch9);
       // text19.setTextSize(MainMenu.width1/50);
        text19.setX(0);
        text19.setY(MainMenu.height1/75*9);
        text19.setText(Will.will());

        final TextView text20 = (TextView) findViewById(R.id.ch10);
        //text20.setTextSize(MainMenu.width1/50);
        text20.setX(0);
        text20.setY(MainMenu.height1/75*10);
        text20.setText(Power.power());

        final Toast toast1 = Toast.makeText(getApplicationContext(),"Готовка Жонглирование Контрастный душ Подвижный спорт Музыка Рисование",Toast.LENGTH_LONG);
        final Toast toast2 = Toast.makeText(getApplicationContext(),"Бег Бильярд Велосипед Отжимания Подвижный спорт Подтягивания Пресс Приседания",Toast.LENGTH_LONG);
        final Toast toast3 = Toast.makeText(getApplicationContext(),"Иностранный язык Интеллектуальные игры Чтение книг Программирование",Toast.LENGTH_LONG);
        final Toast toast4 = Toast.makeText(getApplicationContext(),"Бег Велосипед Зарядка Контрастный душ Отжимания Подвижный спорт Подтягивания Пресс Приседания",Toast.LENGTH_LONG);
        final Toast toast5 = Toast.makeText(getApplicationContext(),"Бильярд Готовка Жонглирование Муз. инструмент Подвижный спорт Рисование Рукоделие Танцы",Toast.LENGTH_LONG);
        final Toast toast6 = Toast.makeText(getApplicationContext(),"Театр Чтение книг Интеллектуальныые книги",Toast.LENGTH_LONG);
        final Toast toast7 = Toast.makeText(getApplicationContext(),"Бег Зарядка Пресс Танцы",Toast.LENGTH_LONG);
        final Toast toast8 = Toast.makeText(getApplicationContext(),"Музыка Рисование Рукоделие Театр Чтение книг",Toast.LENGTH_LONG);
        final Toast toast9 = Toast.makeText(getApplicationContext(),"Бег Бильярд Зарядка Муз. интсрумент Иностранный язык Контрастный душ",Toast.LENGTH_LONG);
        final Toast toast10 = Toast.makeText(getApplicationContext(),"Отжимания Подтягивания Приседания Пресс",Toast.LENGTH_LONG);

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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
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
                toast10.cancel();
            }
        };
        info9.setOnClickListener(listinfo9);

        final Button info10 = (Button) findViewById(R.id.info10);
        RelativeLayout.LayoutParams lp_info10 = (RelativeLayout.LayoutParams) info10.getLayoutParams();
        lp_info10.height = MainMenu.width1/15;
        lp_info10.width = MainMenu.width1/15;
        info10.setTypeface(null, Typeface.BOLD);// жирный текст
        info10.setY(MainMenu.height1/75*10);
        info10.setLayoutParams(lp_info10);
        info10.setBackgroundResource(R.drawable.info);
        final View.OnClickListener listinfo10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast10.show();
                toast1.cancel();
                toast2.cancel();
                toast3.cancel();
                toast4.cancel();
                toast5.cancel();
                toast6.cancel();
                toast7.cancel();
                toast8.cancel();
                toast9.cancel();
            }
        };
        info10.setOnClickListener(listinfo10);

    }

}
