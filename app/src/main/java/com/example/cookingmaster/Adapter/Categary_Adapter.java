package com.example.cookingmaster.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cookingmaster.Activity.Menu_Activity;
import com.example.cookingmaster.R;
import com.example.cookingmaster.Models.Recipes;

import java.util.ArrayList;

public class Categary_Adapter extends RecyclerView.Adapter<Categary_Adapter.Viewholder> {

    private Context context;
    private ArrayList<Recipes> arrcook;

    public Categary_Adapter(Context context, ArrayList<Recipes> arrcook) {

        this.context = context;
        this.arrcook = arrcook;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.ccoking_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Categary_Adapter.Viewholder holder, int position) {
        holder.imgitem.setImageResource(arrcook.get(position).getImg());
        holder.txtitem.setText(arrcook.get(position).getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Menu_Activity.class);
                intent.putExtra("pose", holder.getAdapterPosition() + 1);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrcook.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView imgitem;
        TextView txtitem;
        CardView cardView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardview);
            imgitem = itemView.findViewById(R.id.imageitem);
            txtitem = itemView.findViewById(R.id.textitem);
        }
    }
}
