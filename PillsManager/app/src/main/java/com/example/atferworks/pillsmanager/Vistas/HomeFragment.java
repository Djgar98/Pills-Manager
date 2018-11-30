package com.example.atferworks.pillsmanager.Vistas;


import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.annotation.NonNull;
=======
import android.support.design.widget.FloatingActionButton;
>>>>>>> origin/Leonardo_Juarez
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atferworks.pillsmanager.Controlador.Adapter;
import com.example.atferworks.pillsmanager.Modelo.INTAKE;
import com.example.atferworks.pillsmanager.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    View view;

    List<INTAKE> ingesta;

    Adapter adapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView reciclador = view.findViewById(R.id.recycler_home);
<<<<<<< HEAD
        reciclador.setHasFixedSize(true);
        reciclador.setLayoutManager(new LinearLayoutManager(getActivity()));

        ingesta = new ArrayList<>();

        //FirebaseDatabase database = FirebaseDatabase.getInstance();

        adapter = new Adapter(ingesta);
        reciclador.setAdapter(adapter);



       /* database.getReference().getRoot().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ingesta.removeAll(ingesta);
                for (DataSnapshot snapshot:
                     dataSnapshot.getChildren()) {
                    INTAKE intake = snapshot.getValue(INTAKE.class);
                    ingesta.add(intake);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
=======
        FloatingActionButton fabnueva = view.findViewById(R.id.fab_nueva_pastilla);
        fabnueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(), AddPillsActivity.class);
                startActivity(i);
            }
        });
>>>>>>> origin/Leonardo_Juarez

            }
        });*/
        return view;
    }

}
