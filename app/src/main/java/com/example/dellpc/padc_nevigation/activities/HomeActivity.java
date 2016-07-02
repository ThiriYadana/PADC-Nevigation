package com.example.dellpc.padc_nevigation.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dellpc.padc_nevigation.R;
import com.example.dellpc.padc_nevigation.fragments.JobSearchFragment;
import com.example.dellpc.padc_nevigation.fragments.LinkedInFragment;
import com.example.dellpc.padc_nevigation.fragments.MovieFragment;
import com.example.dellpc.padc_nevigation.fragments.PulseFragment;
import com.example.dellpc.padc_nevigation.fragments.WinZinFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        //to get tool bar as action bar

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);              //to disable default_title on Action Bar
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_24dp);    //to show Humbager button
            actionBar.setDisplayHomeAsUpEnabled(true);                  //to clickable Humbager button
        }


        LinkedInFragment linkedInFragment = LinkedInFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,linkedInFragment)
                .commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id) {
            case android.R.id.home:                             //to get humbager item
                drawerLayout.openDrawer(GravityCompat.START);   //open nevigation layout
                return true;
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (menuItem.getItemId()) {
                    case R.id.PADC_LinkedIn:
                        navigateToPADCLinkedIn();
                        break;
                    case R.id.PADC_JobSearch:
                        navigateToPADCJobSearch();
                        break;
                    case R.id.PADC_Pulse:
                        nevigateToPADCPulse();
                        break;
                    case R.id.PADC_Movie:
                        nevigateToPADCMovie();
                        break;
                    case R.id.PADC_WinZin:
                        nevigateToPADCWinZin();
                        break;

                }
            }
        }, 100); //to close drawer smoothly.

        return true;
    }

    private void nevigateToPADCWinZin() {
        WinZinFragment winzinFragment = WinZinFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,winzinFragment)
                .commit();
        TextView tv_title = (TextView) findViewById(R.id.tv_actionBar_title);
        tv_title.setText(R.string.title_winzin);
    }

    private void nevigateToPADCMovie() {
        MovieFragment movieFragment = MovieFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,movieFragment)
                .commit();
        TextView tv_title = (TextView) findViewById(R.id.tv_actionBar_title);
        tv_title.setText(R.string.title_movie);
    }

    private void nevigateToPADCPulse() {
        PulseFragment pulseFragment = PulseFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,pulseFragment)
                .commit();

        TextView tv_title = (TextView) findViewById(R.id.tv_actionBar_title);
        tv_title.setText(R.string.title_pulse);
    }

    private void navigateToPADCJobSearch() {
        JobSearchFragment jobSearchFragment = JobSearchFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,jobSearchFragment)
                .commit();
        TextView tv_title = (TextView) findViewById(R.id.tv_actionBar_title);
        tv_title.setText(R.string.title_jobSearch);
    }

    private void navigateToPADCLinkedIn() {
        LinkedInFragment linkedInFragment = LinkedInFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,linkedInFragment)
                .commit();
        TextView tv_title = (TextView) findViewById(R.id.tv_actionBar_title);
        tv_title.setText(R.string.title_linkedin);
    }
}
