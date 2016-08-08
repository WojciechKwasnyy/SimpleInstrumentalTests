package com.example.kwasny.test21;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttona = (Button) findViewById(R.id.button_a);
        Button buttonb = (Button) findViewById(R.id.button_b);
        Button buttonc = (Button) findViewById(R.id.button_c);
        Button buttond = (Button) findViewById(R.id.button_d);
        TextView txt = (TextView) findViewById(R.id.textView);
        AlertDialog builder11;
        Handler handler = new Handler();
       // AlertDialog.Builder alert = new AlertDialog.Builder(context);
        Random r = new Random();
        int i = r.nextInt(101);
        txt.setText(String.valueOf(i));



       buttona.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              // Toast.makeText(getApplicationContext(), "A Clicked", Toast.LENGTH_SHORT).show();
               new AlertDialog.Builder(MainActivity.this)
                       .setTitle("Button A clicked")
                       .setMessage("A")
                       .setCancelable(false)
                       .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               // Whatever...
                           }
                       }).create().show();

           }
       });
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Button B clicked")
                        .setMessage("B")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Whatever...
                            }
                        }).create().show();

            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Button C clicked")
                        .setMessage("C")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Whatever...
                            }
                        }).create().show();
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Button D clicked")
                        .setMessage("D")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Whatever...
                            }
                        }).create().show();
            }
        });

    }

}
