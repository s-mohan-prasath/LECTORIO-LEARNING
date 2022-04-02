package com.mohan.practice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavBar;
    MenuItem profile,courses,lecRoom,aboutUs,announcements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    initProfileFragment();

    bottomNavBar=findViewById(R.id.bottomNavBar);
    bottomNavBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;

            switch (item.getItemId()) {
                case (R.id.courses): selectedFragment=new CoursesFragment();break;
                case (R.id.LectRoom): selectedFragment=new LectRoomFragment();break;
                case (R.id.announcements): selectedFragment=new AnnouncementsFragment();break;
                case (R.id.aboutUs): selectedFragment=new AboutUsFragment();break;
                case (R.id.profile): selectedFragment=new ProfileFragment();break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    });



    }

    public void initProfileFragment(){
        ProfileFragment selectedFragment=new ProfileFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
    }

}