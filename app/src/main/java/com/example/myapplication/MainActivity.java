package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] anArray = new int[6];

        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        anArray[3] = 4;
        anArray[4] = 5;
        anArray[5] = 6;

        for(int i = 0; i < 6; i++){

            Log.d("This is Array",String .valueOf(anArray[i]));
123
        }




    }
}