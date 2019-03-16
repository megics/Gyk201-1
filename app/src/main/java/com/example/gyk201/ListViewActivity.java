package com.example.gyk201;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView listview;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        builder = new AlertDialog.Builder(ListViewActivity.this); //alert dialog yaratmak için
        listview = findViewById(R.id.listview); //xml dosyasındaki listviewimiz
        final ArrayList<String> liste = new ArrayList<>(); //listviewe atılacak verileri tutan array
        liste.add("Tükiye"); //array liste veriler ekleniyor
        liste.add("Yunanistan");
        liste.add("Almanya");
        liste.add("İsviçre");

        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, liste); //string tipindeki verileri listviewe yerleştirecek olan array adapter

        listview.setAdapter(veriAdaptoru); //adapterü set eder.

        //list viewda bir iteme tıklanmasını dinler.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                builder.setMessage(liste.get(position)); //alert dialog içerisindeki yazıyı set eder.
                builder.setPositiveButton("TAMAM", new DialogInterface.OnClickListener() { //tamam butonunu dinler
                    public void onClick(DialogInterface dialog, int id) {

                        //butona tıklanınca kapatılmasını istiyorsak içini boş bırakıyoruz.
                    }
                });
                builder.show(); //alert dialogu gösterir.
            }
        });

    }
}
