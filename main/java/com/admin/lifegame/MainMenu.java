package com.admin.lifegame;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainMenu extends AppCompatActivity {

    static int width1;
    static int height1;

    static int [] Rangs_count = new int[31];

    static boolean [] Quest_progress = new boolean[11];

    static SharedPreferences sPref;

    static int [] task1_count = {0,3,2,7,20,1,1,1,1,1,1};
    static int [] task2_count = {0,3,3,5,200,1,1,1,1,1,1};
    static int [] task3_count = {0,1,2,3,20,1,1,1,1,1,1};

//    static int quest_number;
//    static int y = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        sPref = getPreferences(MODE_PRIVATE);

        final String[] Rang = new String[31];
        for(int i = 1;i<=30;i++) {
            Rang[i] = "Rang_"+i;
        }

        for(int i = 1;i<=30;i++) {
            MainMenu.Rangs_count[i]=MainMenu.sPref.getInt(Rang[i],0);
        }

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final int width = size.x;
        final int height = size.y;
        width1 = width;
        height1 = height;

        final Button btn3 = (Button) findViewById(R.id.btn3);
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) btn3.getLayoutParams();
        lp.height = height1/8;
        lp.width = width1/3;

        btn3.setX(0);
        btn3.setY(height1-height1/8);
        btn3.setBackgroundResource(R.drawable.start_button_background);

        final MainMenu this_ = this;
        final View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_,Achievments.class);
                startActivity(intent);
            }
        };
        btn3.setOnClickListener(listener3);


        final Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setLayoutParams(lp);
        btn1.setX(width1/3);
        btn1.setY(height1-height1/8*2);
        final View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_,Player.class);
                startActivity(intent);
            }
        };
        btn1.setBackgroundResource(R.drawable.start_button_background);
        btn1.setOnClickListener(listener1);

        final Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setLayoutParams(lp);
        btn4.setX(width1/3*2);
        btn4.setY(height1-height1/8*2);
        final View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_,Quest.class);
                startActivity(intent);
            }
        };
        btn4.setBackgroundResource(R.drawable.start_button_background);
        btn4.setOnClickListener(listener4);



        final Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setLayoutParams(lp);
        btn2.setX(width1/3*2);
        btn2.setY(height1-height1/8*3);
        btn2.setBackgroundResource(R.drawable.start_button_background);
        final View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this_,Rangs.class);
                startActivity(intent);
            }
        };
        btn2.setOnClickListener(listener2);

        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.menu_hero);
        final Bitmap images = Bitmap.createScaledBitmap(bitmap,MainMenu.width1/3*2, MainMenu.height1/3, false);
        final Drawable image_1 = new BitmapDrawable(getResources(), images);
        image.setX(width1/20);
        image.setY(height1-height1/8*2-height1/3);
        image.setBackground(image_1);

        final ImageView title = (ImageView) findViewById(R.id.imageView1);
        final Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.lifegame);
        final Bitmap titles = Bitmap.createScaledBitmap(bitmap1,MainMenu.width1, MainMenu.height1/3, false);
        final Drawable title_1 = new BitmapDrawable(getResources(), titles);
        title.setX(0);
        title.setY(height1/15);
        title.setBackground(title_1);

        final ImageView polosa = (ImageView) findViewById(R.id.imageView2);
        final Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.polosa);
        final Bitmap polosas = Bitmap.createScaledBitmap(bitmap2,MainMenu.width1/5, MainMenu.height1/8, false);
        final Drawable polosa_1 = new BitmapDrawable(getResources(), polosas);
        polosa.setX(width1/20);
        polosa.setY(height1-height1/8*2-height1/8/4);
        polosa.setBackground(polosa_1);

//        while(Quest_progress[y]) {
//            y++;
//        }
//        quest_number=y;


        final String[] task1 = new String[11];
        final String[] task2 = new String[11];
        final String[] task3 = new String[11];
        for(int i = 1;i<=10;i++) {
            task1[i] = "task1_"+i;
            task2[i] = "task2_"+i;
            task3[i] = "task3_"+i;
        }

//        final String[] Quest = new String[11];
//        for(int i = 1;i<=10;i++) {
//            Quest[i]="Quest_"+i;
//        }
//        for(int i = 1;i<=10;i++) {
//            MainMenu.Quest_progress[i]=MainMenu.sPref.getBoolean(Quest[i],false);
//        }




    }



}