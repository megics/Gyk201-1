package com.example.gyk201;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button girisyap; //buton tipinde girişyap isimli bir pivate  değişken

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        girisyap = findViewById(R.id.login); //girisyap degiskeninin xml componentine atanması.

        girisyap.setOnClickListener(new View.OnClickListener() { //giris yap butonunu dinler.
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(),HosgeldinSayfasi.class);//activity arası geçiş için intent tanımlaması.
                startActivity(i); //geçişi başlatır.
            }
        });

    }
}
