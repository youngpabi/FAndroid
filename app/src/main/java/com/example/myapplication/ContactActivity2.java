package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.TextView;
public class ContactActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);

                TextView textName = findViewById(R.id.textName);
                TextView textEmail = findViewById(R.id.textEmail);
                TextView textPhone = findViewById(R.id.textPhone);
                TextView textAddress = findViewById(R.id.textAddress);
                TextView textAdd = findViewById(R.id.textAdd);

                textName.setText("Pabi Andrew");
                textEmail.setText("pabiandrew@gmail.com");
                textPhone.setText("0552540633");
                textAddress.setText("Kaasi-Kumasi, MTN Switch");
                textAdd.setText("\n\nPlease Call to make an Order");
            }
        }
