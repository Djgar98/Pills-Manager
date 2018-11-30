package com.example.atferworks.pillsmanager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import com.example.atferworks.pillsmanager.Vistas.DrugStoreFragment;
import com.example.atferworks.pillsmanager.Vistas.HomeFragment;
import com.example.atferworks.pillsmanager.Vistas.MedicineFragment;
import com.example.atferworks.pillsmanager.Vistas.SearchFragment;
import com.example.atferworks.pillsmanager.Vistas.UserFragment;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Fragment fragmentGeneric;
                    fragmentGeneric = new HomeFragment();
                    FragmentTransaction fragmnetTransicion_1 = getSupportFragmentManager().beginTransaction();
                    fragmnetTransicion_1.replace(R.id.container_principal,fragmentGeneric);
                    fragmnetTransicion_1.commit();
                    return true;
                case R.id.navigation_medicine:
                    Fragment fragmentGeneric1;
                    fragmentGeneric1 = new MedicineFragment();
                    FragmentTransaction fragmnetTransicion_2 = getSupportFragmentManager().beginTransaction();
                    fragmnetTransicion_2.replace(R.id.container_principal,fragmentGeneric1);
                    fragmnetTransicion_2.commit();
                    return true;
                case R.id.navigation_notifications:
                    Fragment fragmentGeneric2;
                    fragmentGeneric2 = new SearchFragment();
                    FragmentTransaction fragmnetTransicion_3 = getSupportFragmentManager().beginTransaction();
                    fragmnetTransicion_3.replace(R.id.container_principal,fragmentGeneric2);
                    fragmnetTransicion_3.commit();
                    return true;
                case R.id.navigation_search:
                    Fragment fragmentGeneric3;
                    fragmentGeneric3 = new DrugStoreFragment();
                    FragmentTransaction fragmnetTransicion_4 = getSupportFragmentManager().beginTransaction();
                    fragmnetTransicion_4.replace(R.id.container_principal,fragmentGeneric3);
                    fragmnetTransicion_4.commit();
                    return true;
                case R.id.navigation_user:
                    Fragment fragmentGeneric4;
                    fragmentGeneric4 = new UserFragment();
                    FragmentTransaction fragmnetTransicion_5 = getSupportFragmentManager().beginTransaction();
                    fragmnetTransicion_5.replace(R.id.container_principal,fragmentGeneric4);
                    fragmnetTransicion_5.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToolbar(getResources().getString(R.string.title_home),false);
       // mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }//aqui ponemos el nombre a la toolbar y si necesitamos la flecha


}
