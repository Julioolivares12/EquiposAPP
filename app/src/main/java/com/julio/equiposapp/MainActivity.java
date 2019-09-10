package com.julio.equiposapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.julio.equiposapp.adaptadores.EquiposAdaptador;
import com.julio.equiposapp.listeners.OnItemClickListener;
import com.julio.equiposapp.modelo.EquiposContent;


public class MainActivity extends AppCompatActivity {


    private boolean mTwoPane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.item_detail_container) != null){
            mTwoPane = true;
        }

        RecyclerView recyclerEquipos = findViewById(R.id.list_equipos);
        assert recyclerEquipos != null;
        setUpRecyclerView(recyclerEquipos);

    }

    private void setUpRecyclerView(@NonNull RecyclerView recyclerView){
        recyclerView.setAdapter(new EquiposAdaptador(EquiposContent.ITEMS, mTwoPane, new OnItemClickListener() {
            @Override
            public void onClick(EquiposContent.EquipoItem equipoItem) {
                if (mTwoPane){
                    Bundle argumentos = new Bundle();
                    argumentos.putString(Constantes.NOMBRE_ITEM,equipoItem.nombreEquipo);
                    argumentos.putString(Constantes.DESCRIPCION_ITEM,equipoItem.descripcion);
                    argumentos.putInt(Constantes.IMAGEN_ITEM,equipoItem.imagenEquipo);

                    ItemDetailFragment itemDetailFragment = new ItemDetailFragment();
                    itemDetailFragment.setArguments(argumentos);

                    getSupportFragmentManager().beginTransaction().replace(R.id.item_detail_container,itemDetailFragment).commit();
                }else {
                    Context context =getApplicationContext();

                    Intent intent = new Intent(context,ItemDetailActivity.class);
                    intent.putExtra(Constantes.NOMBRE_ITEM,equipoItem.nombreEquipo);
                    intent.putExtra(Constantes.DESCRIPCION_ITEM,equipoItem.descripcion);
                    intent.putExtra(Constantes.IMAGEN_ITEM,equipoItem.imagenEquipo);

                    startActivity(intent);
                    //context.startActivity(intent);
                }
            }
        }));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.datos){
            Intent intent = new Intent(getApplicationContext(),DatosActivity.class);
            startActivity(intent);
        }
        return true;
    }


}
