package com.example.adamespinoza.UpBeat;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class HostParty extends AppCompatActivity {

    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_party);

        button = (ImageButton) findViewById(R.id.pauseButton);
        Drawable testButton = button.getDrawable();

        if (testButton.equals(R.drawable.pause_button)) {
            button.setOnClickListener(imgPlayButtonHandler);
        } else {
            button.setOnClickListener(imgPauseButtonHandler);
        }

    }


    View.OnClickListener imgPlayButtonHandler = new View.OnClickListener() {

        public void onClick(View v) {
            button.setBackgroundResource(R.drawable.play_button);

        }
    };

    View.OnClickListener imgPauseButtonHandler = new View.OnClickListener() {

        public void onClick(View v) {
                button.setBackgroundResource(R.drawable.pause_button);

            }
        };
    }


