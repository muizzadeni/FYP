package com.example.code;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;

import android.os.Bundle;

//import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.AdapterView;

import android.widget.ArrayAdapter;

import android.widget.ListView;


@SuppressLint("Registered")
public class TownList extends AppCompatActivity {

    ListView listView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_item_click_event);


        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[]{"Uxbridge", "Hayes",

                "Wembley", "Westminster", "Brixton",

                "Canary Wharf", "Crystal Palace", "Tower Bridge",

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,

                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,

                                    int position, long id) {

                if (position == 0) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 1) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 2) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 3) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 4) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 5) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 6) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }


                if (position == 7) {

                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);

                    startActivityForResult(myIntent, 0);

                }

            }

        });

    }
}
