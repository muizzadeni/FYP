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
     Button button;
     DatabaseReference reff;
     Spots spots;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_add_spot);

        EditTown = findViewById(R.id.enter_town);
        EditLatitude = findViewById(R.id.enter_latitude);
        EditLongitude = findViewById(R.id.enter_longitude);
        button = (Button)findViewById(R.id.add_location);
        spots = new Spots();
        reff= FirebaseDatabase.getInstance().getReference().child("Spots");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double Longitude = Double.parseDouble(EditLongitude.getText().toString().trim()); //might need to change this as double is being insterted
                double Latitude = Double.parseDouble(EditLatitude.getText().toString().trim()); //might need to change this as double is being insterted

                spots.setTown(EditTown.getText().toString().trim());
                spots.setLatitude(Latitude);
                spots.setLongitude(Longitude);



                reff.child(String.valueOf(EditTown.getText())).setValue(spots); // to name the child to the town name
                Toast.makeText(AddSpots.this, "data insterted successfully",Toast.LENGTH_LONG).show();

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
