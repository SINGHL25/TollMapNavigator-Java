package com.example.tollnavigator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class SiteListActivity extends AppCompatActivity {

    ListView siteListView;
    List<Site> siteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_list);

        siteListView = findViewById(R.id.siteListView);
        siteList = JsonUtils.loadSitesFromJSON(this);

        SiteAdapter adapter = new SiteAdapter(this, siteList);
        siteListView.setAdapter(adapter);

        siteListView.setOnItemClickListener((adapterView, view, i, l) -> {
            Site site = siteList.get(i);
            Intent intent = new Intent(SiteListActivity.this, SiteDetailActivity.class);
            intent.putExtra("site", site);
            startActivity(intent);
        });
    }
}

