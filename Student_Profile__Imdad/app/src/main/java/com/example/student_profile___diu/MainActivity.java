package com.example.student_profile___diu;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    TextView tv;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        ActionBarDrawerToggle toggle;


        toggle = new ActionBarDrawerToggle( this, drawer, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.imdadul, new Home());
        ft.commit();
        navigationView.setCheckedItem(R.id.nav_home);
    }
    public void setActionBarTitle(String str){getSupportActionBar().setTitle(str);}
        public void onBackPressed(){
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if(drawer.isDrawerOpen(GravityCompat.START)){
                drawer.closeDrawer(GravityCompat.START);
            }
            else{
                super.onBackPressed();
            }
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id=item.getItemId();

        if (id == R.id.nav_home){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.imdadul, new Home());
            ft.commit();
        }

        else if (id == R.id.nav_profile){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.imdadul, new Profile());
            ft.commit();
        }

        else if (id == R.id.nav_contactInfo){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.imdadul, new Contact_Info());
            ft.commit();
        }

        else if (id == R.id.nav_calculator){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.imdadul, new Calculator());
            ft.commit();
        }

        else if (id == R.id.nav_datePicker){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.imdadul, new DatePicker());
            ft.commit();

            //ei khane code Likhte hobe setOnclicklistner er  ??
        }

        else if (id == R.id.nav_currencyConverter){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.imdadul, new Currency_Converter());
            ft.commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
