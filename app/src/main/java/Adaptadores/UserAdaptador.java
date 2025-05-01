package Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiz.R;

import java.util.List;

import conten.Usuario;

public class UserAdaptador extends RecyclerView.Adapter<UserAdaptador.ViewHolder> {

    private List<Usuario> datos;
    public  UserAdaptador(List<Usuario>datos){
        this.datos= datos;

    }
    @NonNull
    @Override
    public UserAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdaptador.ViewHolder holder, int position) {
        Usuario dato= datos.get(position);
        holder.bind(dato);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    //da la informacion a cada uno de los elementos //
    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_titulo, txt_descripcion;
        ImageView img_usuario;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_titulo = itemView.findViewById(R.id.txt_titulo);
            txt_descripcion= itemView.findViewById(R.id.txt_descripcion);
            img_usuario= itemView.findViewById(R.id.img_usuario);
        }

        public void bind(Usuario dato) {
            txt_titulo.setText(dato.getTitulo());
            txt_descripcion.setText(dato.getDescripcion());
            //libreria de imagen
            Pica4sso.get().load(dato.getImagen()).into(img_usuario);
        }
    }
}
