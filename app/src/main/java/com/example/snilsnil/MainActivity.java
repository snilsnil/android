package com.example.snilsnil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
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
       /* Button btnNate, btn911, btnGal, btnEnd;

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
        });*/


        /* 프로젝트 Exer2_7 */

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("좀 그럴듯한 앱");

        EditText edit1;
        Button btnToast, btnHomepage;
        RadioButton rdoCorn, rdoTira;
        ImageView ivAndroid;

        edit1 = findViewById(R.id.edit1);
        btnToast = findViewById(R.id.btnToast);
        btnHomepage=findViewById(R.id.btnHomepage);
        rdoCorn = findViewById(R.id.rdoCo);
        rdoTira = findViewById(R.id.rdoTi);
        ivAndroid = findViewById(R.id.ivAndroid);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        edit1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        btnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit1
                        .getText().toString()));
                startActivity(mIntent);
            }
        });
        rdoCorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivAndroid.setImageResource(R.drawable.snow_corn);
            }
        });
        rdoTira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivAndroid.setImageResource(R.drawable.tiramisu01);
            }
        });

    }
}