package com.example.cookingmaster.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cookingmaster.Activity.Recepie_Activity;
import com.example.cookingmaster.R;
import com.example.cookingmaster.Models.Menu;

import java.util.ArrayList;

public class Sub_Categary_Adapter extends RecyclerView.Adapter<Sub_Categary_Adapter.Viewholder> {

    ArrayList<Menu> arrmenu;
    Context context;
    int fav1 = R.drawable.ic_baseline_favorite_border_24;

    public Sub_Categary_Adapter(ArrayList<Menu> arrmenu, Context context) {
        this.arrmenu = arrmenu;
        this.context = context;
    }

    @NonNull
    @Override
    public Sub_Categary_Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.menu_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.imagemenu.setImageResource(arrmenu.get(position).getImage());
        holder.imgfav.setImageResource(R.drawable.ic_baseline_favorite_border_24);
        holder.txtname.setText(arrmenu.get(position).getName());
        holder.txtclo.setText("334.6 Clories");
        holder.txtmin.setText("25 min");
        holder.txtview.setText("views : 37263");

        holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Recepie_Activity.class);
                intent.putExtra("pic", arrmenu.get(holder.getAdapterPosition()).getImage());
                context.startActivity(intent);
            }
        });

        holder.imgfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fav1 == (R.drawable.ic_baseline_favorite_border_24)) {
                    holder.imgfav.setImageResource(R.drawable.ic_baseline_favorite_24);
                    Toast.makeText(context, "Add to Favorite list", Toast.LENGTH_SHORT).show();
                } else if (fav1 != (R.drawable.ic_baseline_favorite_24)) {
                    holder.imgfav.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            holder.imgfav.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                            Toast.makeText(context, "Remove to Favorite list", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrmenu.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView imagemenu, imgfav;
        TextView txtname, txtclo, txtmin, txtview;
        LinearLayout ll;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imagemenu = itemView.findViewById(R.id.imagemenu);
            imgfav = itemView.findViewById(R.id.imgfav);
            txtname = itemView.findViewById(R.id.txtname);
            txtclo = itemView.findViewById(R.id.txtclo);
            txtmin = itemView.findViewById(R.id.txtmin);
            txtview = itemView.findViewById(R.id.txtview);
            ll = itemView.findViewById(R.id.ll);
        }
    }
}
