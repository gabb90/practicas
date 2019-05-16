package com.example.comunicacionentrefragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PedidoFragment extends Fragment {


    public PedidoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pedido, container, false);
        Button buttonOrdenarPedido = view.findViewById(R.id.buttonFragmentOrdenarPedido);
        buttonOrdenarPedido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Hicieron Click",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
