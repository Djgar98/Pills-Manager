package com.example.atferworks.pillsmanager.Controlador;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class crud_USER {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference MyRef = database.getReference(FirebaseReferences.USER_REFERENCE);
  // MyRef.add
    /* log.i("KEY",myRef.getkey()); */
}
