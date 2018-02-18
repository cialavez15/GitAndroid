package com.example.achar.gitandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button saludo;
    TextView Texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludo = (Button)findViewById(R.id.button3);
        Texto = (TextView)findViewById(R.id.lblSaludar);

        saludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Texto.setText("Hola GitHub");
            }
        });
    }

}
