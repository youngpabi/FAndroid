package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnSignIn;
    private TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        tvSignUp = findViewById(R.id.tvSignUp);

        DatabaseHelper databaseHelper = new DatabaseHelper(this);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform sign-in logic here
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if (databaseHelper.checkUser(email, password)) {
                    // User exists and credentials are correct
                    Intent intent = new Intent(MainActivity.this, HomeActivity2.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Sign-in successful!", Toast.LENGTH_SHORT).show();
                    // TODO: Implement your desired action after successful sign-in
                } else {
                    // User does not exist or credentials are incorrect
                    Toast.makeText(MainActivity.this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
                    // TODO: Implement your desired action for incorrect sign-in
                }
            }
        });

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the new email and password from EditText fields
                String newEmail = etEmail.getText().toString();
                String newPassword = etPassword.getText().toString();

                // Check if the email and password are not empty
                if (!newEmail.isEmpty() && !newPassword.isEmpty()) {
                    // Add the user to the database
                    databaseHelper.addUser(newEmail, newPassword);
                    Toast.makeText(MainActivity.this, "Sign up successful!", Toast.LENGTH_SHORT).show();
                     // Finish the activity and go back to SignInUpActivity
                } else {
                    Toast.makeText(MainActivity.this, "Email and password cannot be empty!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
