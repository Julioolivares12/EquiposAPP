package com.julio.equiposapp.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.julio.equiposapp.MainActivity;
import com.julio.equiposapp.R;
import com.julio.equiposapp.listeners.OnItemClickListener;
import com.julio.equiposapp.modelo.EquiposContent;

import java.util.List;

public class EquiposAdaptador extends RecyclerView.Adapter<EquiposAdaptador.EquiposHolder> {
    private final List<EquiposContent.EquipoItem> equipoItemList;

    private final boolean mTwoPane;


    private final OnItemClickListener itemClickListener;

    public EquiposAdaptador(List<EquiposContent.EquipoItem> equipoItemList, boolean mTwoPane, OnItemClickListener itemClickListener){
        this.equipoItemList = equipoItemList;
        this.mTwoPane = mTwoPane;
        this.itemClickListener = itemClickListener;
    }
    @NonNull
    @Override
    public EquiposHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_content,viewGroup,false);
        return new EquiposHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EquiposHolder equiposHolder, int i) {
        EquiposContent.EquipoItem equipoItem = equipoItemList.get(i);
        equiposHolder.bind(equipoItem,itemClickListener);
    }

    @Override
    public int getItemCount() {
        return equipoItemList.size();
    }

    class EquiposHolder extends RecyclerView.ViewHolder {

        private TextView tv_NombreEquipo;
        private ImageView imagenEquipo;
        public EquiposHolder(@NonNull View itemView) {
            super(itemView);
            tv_NombreEquipo = itemView.findViewById(R.id.tv_nombreEquipo);
            imagenEquipo = itemView.findViewById(R.id.imagenEquipo);

        }

        private void bind(final EquiposContent.EquipoItem equipoItem,final OnItemClickListener itemClickListener){
            tv_NombreEquipo.setText(equipoItem.nombreEquipo);
            imagenEquipo.setImageResource(equipoItem.imagenEquipo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.onClick(equipoItem);
                }
            });
        }
    }
}
