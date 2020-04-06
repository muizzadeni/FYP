package com.example.code;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


@SuppressLint("Registered")
public class TownList extends AppCompatActivity {

    ListView myListView;

    ArrayList<String> myArrayList = new ArrayList<>();

    DatabaseReference mRef;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_item_click_event);

        final ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(TownList.this, android.R.layout.simple_list_item_1,myArrayList);

        myListView = (ListView) findViewById(R.id.list); //List is id given in xml file
        myListView.setAdapter(myArrayAdapter);

        mRef = FirebaseDatabase.getInstance().getReference("Spots");

        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String value = dataSnapshot.child("town").getValue(String.class); // this will receive string values from firebase
                //reff.child(String.valueOf(EditTown.getText())).setValue(spots);
                myArrayList.add(value);
                myArrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                myArrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}

// --------------------=========================================================================================

//package com.example.code;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.content.Intent;
//
//import android.os.Bundle;
//
////import android.support.v7.app.AppCompatActivity;
//
//import android.view.View;
//
//import android.widget.AdapterView;
//
//import android.widget.ArrayAdapter;
//
//import android.widget.ListView;
//
//import com.google.firebase.database.ChildEventListener;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//import java.util.ArrayList;
//
//
//@SuppressLint("Registered")
//public class TownList extends AppCompatActivity {
//
//    ListView myListView;
//
//    ArrayList<String> myArrayList = new ArrayList<>();
//
//    DatabaseReference mRef;
//
//    @Override
//
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.listview_item_click_event);
//
//        final ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(TownList.this, android.R.layout.simple_list_item_1,myArrayList);
//
//        myListView = (ListView) findViewById(R.id.list); //List is id given in xml file
//        myListView.setAdapter(myArrayAdapter);
//
//        mRef = FirebaseDatabase.getInstance().getReference();
//
//        mRef.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                String value = dataSnapshot.getValue(String.class); // this will receive string values from firebase
//                myArrayList.add(value);
//                myArrayAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                myArrayAdapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//    }
//}

// ----------------==============================================================================

//package com.example.code;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.content.Intent;
//
//import android.os.Bundle;
//
////import android.support.v7.app.AppCompatActivity;
//
//import android.view.View;
//
//import android.widget.AdapterView;
//
//import android.widget.ArrayAdapter;
//
//import android.widget.ListView;
//
//
//@SuppressLint("Registered")
//public class TownList extends AppCompatActivity {
//
//    ListView listView;
//
//
//    @Override
//
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.listview_item_click_event);
//
//
//        listView = (ListView) findViewById(R.id.list);
//
//        String[] values = new String[]{"Uxbridge", "Hayes",
//
//                "Wembley", "Westminster", "Brixton",
//
//                "Canary Wharf", "Crystal Palace", "Tower Bridge",
//
//        };
//
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//
//                android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//
//        listView.setAdapter(adapter);
//
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            public void onItemClick(AdapterView<?> parent, View view,
//
//                                    int position, long id) {
//
//                if (position == 0) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 1) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 2) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 3) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 4) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 5) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 6) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//
//                if (position == 7) {
//
//                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
//
//                    startActivityForResult(myIntent, 0);
//
//                }
//
//            }
//
//        });
//
//    }
//}
