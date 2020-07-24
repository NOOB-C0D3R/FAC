package com.example.fac;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class HomeScreen extends AppCompatActivity implements Test.OnFragmentInteractionListener, Prevention.OnFragmentInteractionListener,LiveUpdate.OnFragmentInteractionListener{

    String name, full, selId, dob, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.TabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Test & Remedies!"));
        tabLayout.addTab(tabLayout.newTab().setText("Prevention!"));
        tabLayout.addTab(tabLayout.newTab().setText("Live Updates!"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //intent

        final ViewPager ViewPager = (androidx.viewpager.widget.ViewPager) findViewById(R.id.Pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        ViewPager.setAdapter(adapter);
        ViewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void profile(View view) {
        Intent i = new Intent(HomeScreen.this,ProfileActivity.class);
        //intent
        startActivity(i);
    }
}

