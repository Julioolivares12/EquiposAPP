package com.julio.equiposapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Toolbar toolbar = findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null){
            Bundle arguments = new Bundle();
            datos = getIntent().getExtras();
            if (datos != null){
                //creo los argumentos para pasarlos al fragmento
                arguments.putString(Constantes.NOMBRE_ITEM,datos.getString(Constantes.NOMBRE_ITEM));
                arguments.putString(Constantes.DESCRIPCION_ITEM,datos.getString(Constantes.DESCRIPCION_ITEM));
                arguments.putInt(Constantes.IMAGEN_ITEM,datos.getInt(Constantes.IMAGEN_ITEM));

                ItemDetailFragment detailFragment = new ItemDetailFragment();

                //paso los argumentos al fragmento con setArguments
                detailFragment.setArguments(arguments);
                //reemplazo el fragment
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.item_detail_container,detailFragment)
                        .commit();
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
