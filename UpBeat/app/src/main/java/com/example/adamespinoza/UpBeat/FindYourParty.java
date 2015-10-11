package com.example.adamespinoza.UpBeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FindYourParty extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_your_party);

        String[]songs={"Black Out or Get Out",
                "Sigma Snooze",
                "Mureality Birthday Bash",
                "Dance Cat Party 2",
                "Ultimate Party",
                "Trojanhacks Turn Up",
                "Woodstock"
        };
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);
        ListView listView = (ListView) findViewById(R.id.list2);
        listView.setAdapter(adapter);


        final Intent intent3 = new Intent(this, CurrentParty.class);

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //code on click
               // startActivity(intent3);
                setContentView(R.layout.activity_current_party);
            }
        });

        }




    }