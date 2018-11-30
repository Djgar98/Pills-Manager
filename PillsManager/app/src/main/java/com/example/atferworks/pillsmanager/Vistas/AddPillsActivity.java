package com.example.atferworks.pillsmanager.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.atferworks.pillsmanager.R;

public class AddPillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pills);
        showToolbar(getResources().getString(R.string.title_AddPills),false);
    }

    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }//aqui ponemos el nombre a la toolbar y si necesitamos la flecha

}
