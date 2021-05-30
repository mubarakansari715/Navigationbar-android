package com.example.digital.happy.navigationbar.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.digital.happy.navigationbar.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        //initialization
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //set home bottomNavigationView
        bottomNavigationView.setSelectedItemId(R.id.favorite);
        //other items
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.favorite:
                        return true;
                    case R.id.search:   startActivity(new Intent(getApplicationContext(),
                            SearchActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:   startActivity(new Intent(getApplicationContext(),
                            HomeActivity.class));
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
