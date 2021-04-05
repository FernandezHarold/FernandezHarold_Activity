package com.example.fernandezharold_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_red,button_blue,button_green,button_reset,button_yellow,button_pink;
    View background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_red = (Button)findViewById(R.id.btn_red);
        button_blue = (Button)findViewById(R.id.btn_blue);
        button_green = (Button)findViewById(R.id.btn_green);
        button_reset = (Button)findViewById(R.id.btn_reset);
        button_yellow = (Button)findViewById(R.id.btn_yellow);
        button_pink = (Button)findViewById(R.id.btn_pink);

        background_view = this.getWindow().getDecorView();

        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_red.getText().equals("red"));
                {
                    background_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this, "You Have Sucessfully looking at red",Toast.LENGTH_LONG).show();
                }

            }
        });

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_blue.getText().equals("blue"));
                {
                    background_view.setBackgroundResource(R.color.blue);
                    Toast.makeText(MainActivity.this, "You Have Sucessfully looking at blue", Toast.LENGTH_LONG).show();
                }
            }
        });

        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_green.getText().equals("green"));
                {
                    background_view.setBackgroundResource(R.color.green);
                    Toast.makeText(MainActivity.this, "You Have Sucessfully looking at green", Toast.LENGTH_LONG).show();
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_reset.getText().equals("white"));
                {
                    background_view.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this, "You Have Sucessfully Reset the application", Toast.LENGTH_LONG).show();
                }
            }
        });
        button_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_pink.getText().equals("pink"));
                {
                    background_view.setBackgroundResource(R.color.pink);
                    Toast.makeText(MainActivity.this, "You Have Sucessfully looking at pink", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_yellow.getText().equals("yellow"));
                {
                    background_view.setBackgroundResource(R.color.yellow);
                    Toast.makeText(MainActivity.this, "You Have Sucessfully looking at yellow", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}