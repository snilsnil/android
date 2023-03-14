package com.example.snilsnil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        /* 2주차 */

        /* 버튼 만들기 */
        /*getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.q);

        Button button1 = findViewById(R.id.button1);
        
        
        //버튼을 클릭했을때, 이벤트 발생
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "버튼을 눌렀어요"
                , Toast.LENGTH_SHORT).show();
            }
        });
        
        *//* 체크박스 만들기 *//*
        CheckBox check1;

        check1 = (CheckBox) findViewById(R.id.check1);
        
        //체크박스 이벤트 처리
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "체크박스 클릭",
                        Toast.LENGTH_SHORT).show();
            }
        });*/



        /* 4개 버튼 */
        Button btnNate, btn911, btnGal, btnEnd;

        btnNate = findViewById(R.id.btnNate);
        btn911 = findViewById(R.id.btn911);
        btnGal = findViewById(R.id.btnGal);
        btnEnd = findViewById(R.id.btnEnd);

        btnNate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(mIntent);
            }
        });

        btn911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });

        btnGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}