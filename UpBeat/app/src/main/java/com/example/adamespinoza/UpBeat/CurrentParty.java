package com.example.adamespinoza.UpBeat;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class CurrentParty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_party);
        String[]tunes={"Hazey - Glass Animals",
                "Sundara - ODESZA",
                "Timber - Pitbull",
                "Trap Queen - Fetty Wap",
                "It Wasn't Me - Shaggy",
                "The Drug - Kids of 88",
                "Believe - Maduk",
                "Hollaback Girl - Gwen Stefani",
                "Look at Me Now - Chris Brown",
                "Intoxicated - Martin Solveig"
        };
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tunes);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
