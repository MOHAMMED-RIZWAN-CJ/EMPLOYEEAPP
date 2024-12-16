package com.example.employeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Button references
        Button btnAddEmployee = findViewById(R.id.btnAddEmployee);
        Button btnSearchEmployee = findViewById(R.id.btnSearchEmployee);
        Button btnGoToLogin = findViewById(R.id.btnGoToLogin);

        // Navigate to Add Employee Activity
        btnAddEmployee.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, AddEmployeeActivity.class);
            startActivity(intent);
        });

        // Navigate to Search Employee Activity
        btnSearchEmployee.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SearchEmployeeActivity.class);
            startActivity(intent);
        });

        // Navigate back to Login Activity
        btnGoToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
