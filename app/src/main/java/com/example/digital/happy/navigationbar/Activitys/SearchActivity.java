package com.example.digital.happy.navigationbar.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.digital.happy.navigationbar.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //initialization
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //set home bottomNavigationView
        bottomNavigationView.setSelectedItemId(R.id.search);
        //other items
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.search:
                        return true;
                    case R.id.home:   startActivity(new Intent(getApplicationContext(),
                            HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favorite:   startActivity(new Intent(getApplicationContext(),
                            FavoriteActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:   startActivity(new Intent(getApplicationContext(),
                            ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
