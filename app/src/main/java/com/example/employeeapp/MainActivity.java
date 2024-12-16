package com.example.employeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        b1 = findViewById(R.id.btnLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        // Set OnClickListener for the login button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input values
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Validate username and password
                if (validateCredentials(username, password)) {
                    // Navigate to MenuActivity
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                } else {
                    // Show error message using Toast
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private boolean validateCredentials(String username, String password) {

        String validUsername = "admin";
        String validPassword = "1234";

        return username.equals(validUsername) && password.equals(validPassword);
    }
}
