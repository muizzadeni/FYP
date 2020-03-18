package com.example.code;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import androidx.appcompat.app.AppCompatActivity;

public class AddSpots extends AppCompatActivity {
     EditText EditLongitude;
     EditText EditLatitude;
     EditText EditTown;
     DatabaseReference reff;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_add_spot);

        EditTown = findViewById(R.id.enter_town);
        EditLongitude = findViewById(R.id.enter_longitude);
        EditLatitude = findViewById(R.id.enter_latitude);
       // reff= FirebaseDatabase.getInstance().getReference().child(String.valueOf(EditTown)); // EditTown is town name

        Button button = findViewById(R.id.add_location);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double Longitude = Double.parseDouble(EditLongitude.getText().toString().trim()); //might need to change this as double is being insterted
                double Latitude = Double.parseDouble(EditLatitude.getText().toString().trim()); //might need to change this as double is being insterted
                String Town = EditTown.getText().toString().trim(); //this was done differently in video
/*
                reff.push().setValue(Town);
                reff.push().setValue(Longitude);
                reff.push().setValue(Latitude);
                Toast.makeText(AddSpots.this,"data insterted successfully", Toast.LENGTH_LONG).show(); //done till here
*/
            }
        });

        //for starting next activity
        Button doneButton = findViewById(R.id.done);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),  TownList.class);
                startActivity(intent);

            }
        });
        //for starting next activity -- end
    }
}
