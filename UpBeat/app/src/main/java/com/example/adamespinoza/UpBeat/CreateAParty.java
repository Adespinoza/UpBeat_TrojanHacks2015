package com.example.adamespinoza.UpBeat;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class CreateAParty extends AppCompatActivity {

    Button litButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createparty);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
         fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
          }
         });*/

        litButton = (Button) findViewById(R.id.button3);


        final Intent goToMain = new Intent(this, HostParty.class);
        View.OnClickListener mainButton = new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(goToMain);

            }
        };
        litButton.setOnClickListener(mainButton);
        }

    }
