package com.example.adamespinoza.UpBeat;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.content.Intent;
import com.example.adamespinoza.UpBeat.R;

public class HostParty extends AppCompatActivity {

    ImageButton button;
    Button shutItButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_party);
        shutItButton = (Button) findViewById(R.id.button4);
        button = (ImageButton) findViewById(R.id.pauseButton);
        Drawable testButton = button.getDrawable();
        shutItButton.setOnClickListener(mainButton);


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
    final Intent goToMain = new Intent(this, MainActivity.class);
    View.OnClickListener mainButton = new View.OnClickListener() {

        public void onClick(View v) {

            startActivity(goToMain);

        }
    };
                }


