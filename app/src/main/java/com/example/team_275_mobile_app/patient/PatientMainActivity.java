package com.example.team_275_mobile_app.patient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.team_275_mobile_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class PatientMainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    public Toolbar toolbar;
    private ChipNavigationBar chipNavigationBar;
    private Fragment fragment = null;
    boolean doubleBackToExitPressedOnce = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // implement the drawer and the navigation drawer.
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        // implement the bottom navigation drawer.
        chipNavigationBar = findViewById(R.id.chipNavigation);
        chipNavigationBar.setItemSelected(R.id.home, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PatientHomeFragment()).commit();
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.home:
                        fragment = new PatientHomeFragment();
                        break;
                    case R.id.search:
                        fragment = new PatientSearchFragment();
                        break;
                    case R.id.appointments:
                        fragment = new PatientAppointmentsFragment();
                        break;
                    case R.id.chats:
                        fragment = new PatientChatsFragment();
                        break;
                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                }
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_profile:
                Intent prof = new Intent(PatientMainActivity.this, PatientProfile.class);
                startActivity(prof);
                break;
            case R.id.nav_favourites:
                Intent fav = new Intent(PatientMainActivity.this, PatientFavourites.class);
                startActivity(fav);
                break;
            case R.id.nav_settings:
                Intent settings = new Intent(PatientMainActivity.this, PatientSettings.class);
                startActivity(settings);
                break;
            case R.id.nav_help:
                Intent help = new Intent(PatientMainActivity.this, PatientHelp.class);
                startActivity(help);
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    // handle back press
    @Override
    public void onBackPressed() {
        //handle nav drawer close
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        // return home fragment before closing the app
        chipNavigationBar = findViewById(R.id.chipNavigation);
        if(chipNavigationBar.getSelectedItemId() == R.id.home){
        }else{
            chipNavigationBar.setItemSelected(R.id.home, true);
        }
        // now handle the back press action. set a post delay time to 2 sec
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        // Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);

    }

}