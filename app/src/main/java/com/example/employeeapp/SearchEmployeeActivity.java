package com.example.employeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SearchEmployeeActivity extends AppCompatActivity {

    EditText etEmployeeCode;
    Button btnSubmitSearch, btnGoToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_employee);

        // Initialize views
        etEmployeeCode = findViewById(R.id.etEmployeeCode);
        btnSubmitSearch = findViewById(R.id.btnSubmitSearch);
        btnGoToMenu = findViewById(R.id.btnGoToMenu);

        // Handle Submit (Search) button click
        btnSubmitSearch.setOnClickListener(v -> {
            // You can access the Employee Code entered (not used here)
            String employeeCode = etEmployeeCode.getText().toString();

            // For now, just show a Toast message when the button is clicked
            Toast.makeText(SearchEmployeeActivity.this, "Searching for Employee Code: " + employeeCode, Toast.LENGTH_SHORT).show();
        });

        // Handle Go to Menu button click
        btnGoToMenu.setOnClickListener(v -> {
            Intent intent = new Intent(SearchEmployeeActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}
