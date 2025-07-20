package com.example.tollnavigator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnViewSites, btnUploadSites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewSites = findViewById(R.id.btnViewSites);
        btnUploadSites = findViewById(R.id.btnUploadSites);

        btnViewSites.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SiteListActivity.class);
            startActivity(intent);
        });

        btnUploadSites.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UploadActivity.class);
            startActivity(intent);
        });
    }
}

