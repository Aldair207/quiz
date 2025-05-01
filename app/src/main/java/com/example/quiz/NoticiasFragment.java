package com.example.quiz;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Adaptadores.UserAdaptador;
import conten.Usuario;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoticiasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoticiasFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NoticiasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NoticiasFragment.
     */
    // TODO: Rename and change types and number of parameters

    public class MainActivity extends AppCompatActivity {

        RecyclerView rcv_usuarios;
        List<Usuario> listauser= new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            //dar info

            rcv_usuarios= findViewById(R.id.rcv_usuarios);
            Usuario usu1 = new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg", "Mariana","Movil");
            Usuario usu2 = new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg", "Mel","Movil");
            Usuario usu3 = new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg", "Nawa","Movil");
            Usuario usu4 = new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg", "Amandi","Movil");
            listauser.add(usu1);
            listauser.add(usu2);
            listauser.add(usu3);
            listauser.add(usu4);

            rcv_usuarios. setLayoutManager(new LinearLayoutManager(this));
            rcv_usuarios.setAdapter(new UserAdaptador(listauser));




        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_noticias, container, false);
    }
}