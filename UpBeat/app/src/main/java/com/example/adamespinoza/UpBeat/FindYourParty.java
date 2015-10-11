package com.example.adamespinoza.UpBeat;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.adamespinoza.UpBeat.R;

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
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        }




    }