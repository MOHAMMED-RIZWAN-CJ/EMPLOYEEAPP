package com.example.employeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddEmployeeActivity extends AppCompatActivity {

    Button btnSubmit, btnGoToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        // Initialize Buttons
        btnSubmit = findViewById(R.id.btnSubmit);
        btnGoToMenu = findViewById(R.id.btnGoToMenu);

        // Handle Submit button click (no value from EditText used)
        btnSubmit.setOnClickListener(v -> {
            // Simply show success message without using any EditText values
            Toast.makeText(AddEmployeeActivity.this, "Employee added successfully", Toast.LENGTH_SHORT).show();
        });

        // Handle Go to Menu button click
        btnGoToMenu.setOnClickListener(v -> {
            Intent intent = new Intent(AddEmployeeActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}
