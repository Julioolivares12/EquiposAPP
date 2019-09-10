package com.julio.equiposapp;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private Bundle data;
    public ItemDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       data = getArguments();
        if (data != null){
            Activity activity = this.getActivity();
            assert activity != null;
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(data.getString(Constantes.NOMBRE_ITEM));
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_detail, container, false);
        ImageView imageView = view.findViewById(R.id.imageViewDetalle);
        TextView textView = view.findViewById(R.id.tv_nombreDetalle);
        TextView textView1 = view.findViewById(R.id.tv_descripcionDetalle);

        imageView.setImageResource(data.getInt(Constantes.IMAGEN_ITEM));
        textView.setText(data.getString(Constantes.NOMBRE_ITEM));
        textView1.setText(data.getString(Constantes.DESCRIPCION_ITEM));
        return view;
    }

}
