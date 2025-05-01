package com.example.quiz;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btn_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn_navigation = findViewById(R.id.btn_navigation);

        loadFragment(new NoticiasFragment());

        btn_navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.nav_noticias){
                    selectedFragment = new AjustesFragment();
                } else if (itemId == R.id.nav_ajustes) {
                    selectedFragment = new PerfilFragment();
                } else if (itemId == R.id.nav_ajustes) {
                    selectedFragment = new PerfilFragment();
                }

                if (selectedFragment != null){
                    loadFragment(selectedFragment);
                    return true;
                }
                return false;
            }
        });



    }

    private void loadFragment(Fragment fra) {
    }
}