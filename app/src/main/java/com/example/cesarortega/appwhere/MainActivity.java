package com.example.cesarortega.appwhere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText txtCorreo, txtContraseña;
    ImageView imgIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        txtContraseña = (EditText) findViewById(R.id.txtContraseña);
        imgIniciar = (ImageView) findViewById(R.id.imgIniciar);

        imgIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBotton = new Intent(MainActivity.this, BottomNavigation.class);
                MainActivity.this.startActivity(intentBotton);
            }
        });



    }


}
