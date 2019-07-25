package com.example.aplikasiceritarakyatjawatengah.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aplikasiceritarakyatjawatengah.Activity.DetailCeritaActivity;
import com.example.aplikasiceritarakyatjawatengah.Model.Model;
import com.example.aplikasiceritarakyatjawatengah.R;

import java.util.ArrayList;

public class AdapterKumpulanCerita extends RecyclerView.Adapter<AdapterKumpulanCerita.CategoryViewHolder> {
    private Context context;
    private ArrayList<Model> listKumpulanCerita;

    private ArrayList<Model> getListKumpulanCerita() {
        return listKumpulanCerita;
    }

    public void setListKumpulanCerita(ArrayList<Model> listKumpulanCerita) {
        this.listKumpulanCerita = listKumpulanCerita;
    }

    public AdapterKumpulanCerita(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cerita, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.Gambar.setImageResource(Integer.parseInt(getListKumpulanCerita().get(position).getGambar()));
        categoryViewHolder.judul.setText(getListKumpulanCerita().get(position).getJudul());
        categoryViewHolder.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(context, DetailCeritaActivity.class);
                goInput.putExtra("GAMBAR",getListKumpulanCerita().get(position).getGambar());
                goInput.putExtra("JUDUL",getListKumpulanCerita().get(position).getJudul());
                goInput.putExtra( "CERITA",getListKumpulanCerita().get(position).getCerita());
                goInput.putExtra("PESANMORAL",getListKumpulanCerita().get(position).getPesanmoral());
                goInput.putExtra("SUARA",getListKumpulanCerita().get(position).getSuara());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListKumpulanCerita().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        ImageView Gambar;
        LinearLayout list;


        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            judul=(TextView)itemView.findViewById(R.id.tvJudul);
            Gambar=(ImageView)itemView.findViewById(R.id.ivImage);
            list=(LinearLayout)itemView.findViewById(R.id.LayoutCardView);
        }
    }
}
