package com.example.clockapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public ConstraintLayout city1;
    public ConstraintLayout city2;
    public ConstraintLayout city3;
    public ConstraintLayout city4;
    public ConstraintLayout city5;
    public ConstraintLayout city6;
    public TextView cityName;
    public ImageView cityImage;
    public TextClock textClock;
    public Button button1;
    public Button button2;
    public CheckBox hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

       //topbar work

        hide = findViewById(R.id.hideCity1);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city1.setVisibility(View.VISIBLE);
                } else {
                    city1.setVisibility(View.GONE);
                }
            }
        });

        hide = findViewById(R.id.hideCity2);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city2.setVisibility(View.VISIBLE);
                } else {
                    city2.setVisibility(View.GONE);
                }
            }
        });

        hide = findViewById(R.id.hideCity3);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city3.setVisibility(View.VISIBLE);
                } else {
                    city3.setVisibility(View.GONE);
                }
            }
        });

        hide = findViewById(R.id.hideCity4);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city4.setVisibility(View.VISIBLE);
                } else {
                    city4.setVisibility(View.GONE);
                }
            }
        });

        hide = findViewById(R.id.hideCity5);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city5.setVisibility(View.VISIBLE);
                } else {
                    city5.setVisibility(View.GONE);
                }
            }
        });

        hide = findViewById(R.id.hideCity5);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city5.setVisibility(View.VISIBLE);
                } else {
                    city5.setVisibility(View.GONE);
                }
            }
        });

        hide = findViewById(R.id.hideCity6);
        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    city6.setVisibility(View.VISIBLE);
                } else {
                    city6.setVisibility(View.GONE);
                }
            }
        });


       //buttons to toggle 12/24, note both just modify 12hour format. i.e kk vs h

        button1 = findViewById(R.id.twentyFour);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textClock = city1.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("kk:mm:ss, E");
                textClock = city2.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("kk:mm:ss, E");
                textClock = city3.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("kk:mm:ss, E");
                textClock = city4.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("kk:mm:ss, E");
                textClock = city5.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("kk:mm:ss, E");
                textClock = city6.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("kk:mm:ss, E");
                textClock = findViewById(R.id.timeLocal);
                textClock.setFormat12Hour("kk:mm:ss, E");

                button1.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                button2.setBackgroundColor(getColor(R.color.colorPrimary));
            }
        });

        button2 = findViewById(R.id.twelve);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textClock = city1.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("h:mm:ss a, E");
                textClock = city2.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("h:mm:ss a, E");
                textClock = city3.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("h:mm:ss a, E");
                textClock = city4.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("h:mm:ss a, E");
                textClock = city5.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("h:mm:ss a, E");
                textClock = city6.findViewById(R.id.timeNow);
                textClock.setFormat12Hour("h:mm:ss a, E");
                textClock = findViewById(R.id.timeLocal);
                textClock.setFormat12Hour("h:mm:ss a, E");

                button2.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                button1.setBackgroundColor(getColor(R.color.colorPrimary));
            }
        });

      //cities and their timezones being set as well as name and picture

        //Paris
        city1 = findViewById(R.id.one);

        //city1.setVisibility(View.GONE);

        cityName = city1.findViewById(R.id.loaction);
        cityName.setText(getString(R.string.city1));
        cityImage = city1.findViewById(R.id.photo);
        cityImage.setImageResource(R.drawable.parisclock);
        textClock = city1.findViewById(R.id.timeNow);
        textClock.setTimeZone("Europe/Paris");

        //Tokyo
        city2 = findViewById(R.id.two);
        cityName = city2.findViewById(R.id.loaction);
        cityName.setText(getString(R.string.city2));
        cityImage = city2.findViewById(R.id.photo);
        cityImage.setImageResource(R.drawable.tokyoclock);
        textClock = city2.findViewById(R.id.timeNow);
        textClock.setTimeZone("Asia/Tokyo");

        //London
        city3 = findViewById(R.id.three);
        cityName = city3.findViewById(R.id.loaction);
        cityName.setText(getString(R.string.city3));
        cityImage = city3.findViewById(R.id.photo);
        cityImage.setImageResource(R.drawable.londonclock);
        textClock = city3.findViewById(R.id.timeNow);
        textClock.setTimeZone("Europe/London");

        //Moscow
        city4 = findViewById(R.id.four);
        cityName = city4.findViewById(R.id.loaction);
        cityName.setText(getString(R.string.city4));
        cityImage = city4.findViewById(R.id.photo);
        cityImage.setImageResource(R.drawable.moscowclock);
        textClock = city4.findViewById(R.id.timeNow);
        textClock.setTimeZone("Europe/Moscow");

        //New York
        city5 = findViewById(R.id.five);
        cityName = city5.findViewById(R.id.loaction);
        cityName.setText(getString(R.string.city5));
        cityImage = city5.findViewById(R.id.photo);
        cityImage.setImageResource(R.drawable.nycclock);
        textClock = city5.findViewById(R.id.timeNow);
        textClock.setTimeZone("America/New_York");

        //Sydney
        city6 = findViewById(R.id.six);
        cityName = city6.findViewById(R.id.loaction);
        cityName.setText(getString(R.string.city6));
        cityImage = city6.findViewById(R.id.photo);
        cityImage.setImageResource(R.drawable.sydclock);
        textClock = city6.findViewById(R.id.timeNow);
        textClock.setTimeZone("Australia/Sydney");
    }
}
