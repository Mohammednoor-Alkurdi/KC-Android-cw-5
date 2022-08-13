package com.example.myinformations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView im1 = findViewById(R.id.im1);


        TextView clone1 = findViewById(R.id.clone1) ;
        TextView clone2 = findViewById(R.id.clone2) ;
        TextView clone = findViewById(R.id.clone3) ;
        TextView ins1T = findViewById(R.id.ins1) ;


        EditText name1E = findViewById(R.id.name1);
        EditText age1E = findViewById(R.id.age1);
        EditText ddiiE = findViewById(R.id.ddii);


        Button butt1 = findViewById(R.id.butt1);


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name1 = name1E.getText().toString();

                int age1 = Integer.parseInt(age1E.getText().toString());

                int dddd = Integer.parseInt(ddiiE.getText().toString());


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("name", name1);
                intent.putExtra("age", age1);
                intent.putExtra("ddid", dddd);

                startActivity(intent);

                Bundle bundle = getIntent().getExtras() ;

            }
        });


    }

}