package com.example.atferworks.pillsmanager.Controlador;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.atferworks.pillsmanager.Modelo.INTAKE;
import com.example.atferworks.pillsmanager.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PillsHolder> {

    private  List<INTAKE> ingesta;

    public Adapter(List<INTAKE> ingesta) {
        this.ingesta = ingesta;
    }


    @NonNull
    @Override
    public PillsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_inicio, viewGroup, false);
        PillsHolder holder = new PillsHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PillsHolder pillsHolder, int i) {
        INTAKE intake = ingesta.get(i);
        pillsHolder.txtPastillas.setText((String.valueOf(intake.getFK_IDDRUG())));
        pillsHolder.txthora.setText((String.valueOf(intake.getSTATUS())));
        pillsHolder.txtdosis.setText((String.valueOf(intake.getTIMELIMIT())));
    }


    @Override
    public int getItemCount() {
        return ingesta.size();
    }

    public static class PillsHolder extends RecyclerView.ViewHolder{
        TextView txtPastillas, txthora, txtdosis;

        public PillsHolder(@NonNull View itemView) {
            super(itemView);
            txtPastillas = itemView.findViewById(R.id.name_pills);
            txthora = itemView.findViewById(R.id.hora_1);
            txtdosis = itemView.findViewById(R.id.tomar);
        }
    }

}
