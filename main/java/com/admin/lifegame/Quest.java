package com.admin.lifegame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Quest extends AppCompatActivity {

    private ProgressBar pbHorizontal;
    private ProgressBar pbTask1;
    private ProgressBar pbTask2;
    private ProgressBar pbTask3;
    static String[] Rang = new String[31];
    static String[] Characteristic = new String[11];

    static int quest_number;
    static int y = 1;
    static boolean [] Quest_progress = new boolean[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);

        final String[] Quest = new String[11];
        for(int i = 1;i<=10;i++) {
            Quest[i]="Quest_"+i;
        }
        for(int i = 1;i<=10;i++) {
            Quest_progress[i]=MainMenu.sPref.getBoolean(Quest[i],false);
            Log.d("l", String.valueOf(Quest_progress[i]));
        }
        while(Quest_progress[y]) {
            y++;
        }
        quest_number=y;

        String[] Quest1 = {"","Новичок", "Умник","Спортсмен","Бегун"};
        String[] Task1 = {"","Повысь 3 разных ранга", "Интелл. игры: +2","Пресс и приседания: +7","Бег: +20" };
        String[] Task2 = {"","Зарядка: +3", "Чтение книг: +3", "Бег: +5","Бег: +200"};
        String[] Task3 = {"","Сила: +1", "Мудрость: +2", "Ловкость: +3","Ловкость: +20"};

        final TextView quest_name = (TextView) findViewById(R.id.quest1);
        quest_name.setText(Quest1[quest_number]);
        final TextView task1_name = (TextView) findViewById(R.id.task1);
        task1_name.setText(Task1[quest_number]);
        final TextView task2_name = (TextView) findViewById(R.id.task2);
        task2_name.setText(Task2[quest_number]);
        final TextView task3_name = (TextView) findViewById(R.id.task3);
        task3_name.setText(Task3[quest_number]);

        for(int i = 1;i<=30;i++) {
            Rang[i] = "Rang_"+i;
        }
        for(int i = 1;i<=10;i++) {
            Characteristic[i] = "Char_"+i;
        }
        final String[] task1 = new String[11];
        final String[] task2 = new String[11];
        final String[] task3 = new String[11];
        for(int i = 1;i<=10;i++) {
            task1[i] = "task1_"+i;
            task2[i] = "task2_"+i;
            task3[i] = "task3_"+i;
        }

        int[][] task1_count = new int[11][];
        task1_count[1]= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
        task1_count[2]= new int[]{9};
        task1_count[3]= new int[]{15,16};
        task1_count[4]= new int[]{1};

        int[] task1_firstsum = new int[11];
        task1_firstsum[quest_number] = MainMenu.sPref.getInt("task1_firstSum" +quest_number,0);
        int[] task1_sum = new int[11];
        boolean firstSum1 = MainMenu.sPref.getBoolean("firstSum1"+quest_number,false);
        if(!firstSum1) {
            for(int i = 0;i<task1_count[quest_number].length;i++) {
                task1_firstsum [quest_number]+=MainMenu.sPref.getInt(Rang[task1_count[quest_number][i]],0);
            }
            firstSum1 = true;
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putBoolean("firstSum1" +quest_number,true);
            ed.putInt("task1_firstSum" +quest_number,task1_firstsum[quest_number]);
            ed.commit();
        }
        if(firstSum1) {
            for(int i = 0;i<task1_count[quest_number].length;i++) {
                task1_sum [quest_number]+=MainMenu.sPref.getInt(Rang[task1_count[quest_number][i]],0);
            }
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putInt(task1[quest_number],task1_sum[quest_number]-task1_firstsum[quest_number]);
            ed.commit();
        }


        int[][] task2_count = new int[11][];
        task2_count[1]= new int[]{6};
        task2_count[2]= new int[]{12};
        task2_count[3]= new int[]{1};
        task2_count[4]= new int[]{1};

        int[] task2_firstsum = new int[11];
        task2_firstsum[quest_number] = MainMenu.sPref.getInt("task2_firstSum" +quest_number,0);
        int[] task2_sum = new int[11];
        boolean firstSum2 = MainMenu.sPref.getBoolean("firstSum2"+quest_number,false);
        if(!firstSum2) {
            for(int i = 0;i<task2_count[quest_number].length;i++) {
                task2_firstsum [quest_number]+=MainMenu.sPref.getInt(Rang[task2_count[quest_number][i]],0);
            }
            firstSum2 = true;
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putBoolean("firstSum2" +quest_number,true);
            ed.putInt("task2_firstSum" +quest_number,task2_firstsum[quest_number]);
            ed.commit();
        }
        if(firstSum2) {
            for(int i = 0;i<task2_count[quest_number].length;i++) {
                task2_sum [quest_number]+=MainMenu.sPref.getInt(Rang[task2_count[quest_number][i]],0);
            }
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putInt(task2[quest_number],task2_sum[quest_number]-task2_firstsum[quest_number]);
            ed.commit();
        }


        int[][] task3_count = new int[11][];
        task3_count[1]= new int[]{10};
        task3_count[2]= new int[]{6};
        task3_count[3]= new int[]{5};
        task3_count[4]= new int[]{5};

        int[] task3_firstsum = new int[11];
        task3_firstsum[quest_number] = MainMenu.sPref.getInt("task3_firstSum" +quest_number,0);
        int[] task3_sum = new int[11];
        boolean firstSum3 = MainMenu.sPref.getBoolean("firstSum3"+quest_number,false);
        if(!firstSum3) {
            for(int i = 0;i<task3_count[quest_number].length;i++) {
                if (task3_count[quest_number][i]==1) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Stress.stress());
                }
                if (task3_count[quest_number][i]==2) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Endurance.endurance());
                }
                if (task3_count[quest_number][i]==3) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Intelligence.intelligence());
                }
                if (task3_count[quest_number][i]==4) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Health.health());
                }
                if (task3_count[quest_number][i]==5) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Agility.agility());
                }
                if (task3_count[quest_number][i]==6) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Wisdom.winsdom());
                }
                if (task3_count[quest_number][i]==7) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Charisma.charisma());
                }
                if (task3_count[quest_number][i]==8) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Taste.tsxte());
                }
                if (task3_count[quest_number][i]==9) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Will.will());
                }
                if (task3_count[quest_number][i]==10) {
                    task3_firstsum [quest_number]+=Integer.parseInt(Power.power());
                }
            }
            firstSum3 = true;
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putBoolean("firstSum3" +quest_number,true);
            ed.putInt("task3_firstSum" +quest_number,task3_firstsum[quest_number]);
            ed.commit();
        }
        if(firstSum3) {
            for(int i = 0;i<task3_count[quest_number].length;i++) {
                if (task3_count[quest_number][i]==1) {
                    task3_sum [quest_number]+=Integer.parseInt(Stress.stress());
                }
                if (task3_count[quest_number][i]==2) {
                    task3_sum [quest_number]+=Integer.parseInt(Endurance.endurance());
                }
                if (task3_count[quest_number][i]==3) {
                    task3_sum [quest_number]+=Integer.parseInt(Intelligence.intelligence());
                }
                if (task3_count[quest_number][i]==4) {
                    task3_sum [quest_number]+=Integer.parseInt(Health.health());
                }
                if (task3_count[quest_number][i]==5) {
                    task3_sum [quest_number]+=Integer.parseInt(Agility.agility());
                }
                if (task3_count[quest_number][i]==6) {
                    task3_sum [quest_number]+=Integer.parseInt(Wisdom.winsdom());
                }
                if (task3_count[quest_number][i]==7) {
                    task3_sum [quest_number]+=Integer.parseInt(Charisma.charisma());
                }
                if (task3_count[quest_number][i]==8) {
                    task3_sum [quest_number]+=Integer.parseInt(Taste.tsxte());
                }
                if (task3_count[quest_number][i]==9) {
                    task3_sum [quest_number]+=Integer.parseInt(Will.will());
                }
                if (task3_count[quest_number][i]==10) {
                    task3_sum [quest_number]+=Integer.parseInt(Power.power());
                }
            }
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putInt(task3[quest_number],task3_sum[quest_number]-task3_firstsum[quest_number]);
            ed.commit();
        }




        pbTask1 = (ProgressBar) findViewById(R.id.progressTask1);
        pbTask1.setMax(MainMenu.task1_count[quest_number]);
        pbTask2 = (ProgressBar) findViewById(R.id.progressTask2);
        pbTask2.setMax(MainMenu.task2_count[quest_number]);
        pbTask3 = (ProgressBar) findViewById(R.id.progressTask3);
        pbTask3.setMax(MainMenu.task3_count[quest_number]);

        pbTask1.setProgress(MainMenu.sPref.getInt(task1[quest_number],0));
        pbTask2.setProgress(MainMenu.sPref.getInt(task2[quest_number],0));
        pbTask3.setProgress(MainMenu.sPref.getInt(task3[quest_number],0));

        pbHorizontal = (ProgressBar) findViewById(R.id.progressBar1);
        pbHorizontal.setMax(MainMenu.task1_count[quest_number]+MainMenu.task2_count[quest_number]+MainMenu.task3_count[quest_number]);
        pbHorizontal.setProgress(Math.min(MainMenu.sPref.getInt(task1[quest_number],0),MainMenu.task1_count[quest_number])+Math.min(MainMenu.sPref.getInt(task2[quest_number],0),MainMenu.task2_count[quest_number])+Math.min(MainMenu.sPref.getInt(task3[quest_number],0),MainMenu.task3_count[quest_number]));

        if(Math.min(MainMenu.sPref.getInt(task1[quest_number],0),MainMenu.task1_count[quest_number])+Math.min(MainMenu.sPref.getInt(task2[quest_number],0),MainMenu.task2_count[quest_number])+Math.min(MainMenu.sPref.getInt(task3[quest_number],0),MainMenu.task3_count[quest_number])==MainMenu.task1_count[quest_number]+MainMenu.task2_count[quest_number]+MainMenu.task3_count[quest_number]) {
            SharedPreferences.Editor ed = MainMenu.sPref.edit();
            ed.putBoolean(Quest[quest_number],true);
            ed.commit();
        }
        
        
        
    }
}
