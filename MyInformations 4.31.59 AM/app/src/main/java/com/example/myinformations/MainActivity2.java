package com.example.myinformations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageView im2I = findViewById(R.id.im2) ;
        ImageView im3I = findViewById(R.id.im3);


        TextView ins2T =findViewById(R.id.ins2) ;
        TextView name2T = findViewById(R.id.name2) ;
        TextView age2T = findViewById(R.id.age2) ;
        TextView id2T = findViewById(R.id.id2) ;
        TextView namev = findViewById(R.id.namev) ;
        TextView agev = findViewById(R.id.agev) ;
        TextView idv = findViewById(R.id.idv) ;
        TextView ins3T = findViewById(R.id.ins3) ;
        TextView clone4 = findViewById(R.id.clone4 );
        TextView clone5 = findViewById(R.id.clone5);
        TextView clone6 = findViewById(R.id.clone6 );


        Bundle bundle = getIntent().getExtras() ;


        String name = bundle.getString("name") ;
        namev.setText(name) ;


        int age = bundle.getInt("age") ;
        agev.setText(String.valueOf(age)) ;

       int ddid = bundle.getInt("ddid") ;
       idv.setText(String.valueOf(ddid));


        Button butt2 = findViewById(R.id.butt2) ;
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this , MainActivity.class) ;

                startActivity(intent);
                
            }
        });















    }
}