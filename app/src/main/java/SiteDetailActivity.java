package com.example.tollnavigator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SiteDetailActivity extends AppCompatActivity {

    TextView txtName, txtDescription, txtNavigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_detail);

        Site site = (Site) getIntent().getSerializableExtra("site");

        txtName = findViewById(R.id.txtSiteName);
        txtDescription = findViewById(R.id.txtSiteDescription);
        txtNavigate = findViewById(R.id.txtNavigate);

        txtName.setText(site.getName());
        txtDescription.setText(site.getDescription());

        txtNavigate.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("google.navigation:q=" + site.getLatitude() + "," + site.getLongitude());
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
    }
}

