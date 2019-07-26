package com.example.aplikasiceritarakyatjawatengah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.example.aplikasiceritarakyatjawatengah.Adapter.AdapterKumpulanCerita;
import com.example.aplikasiceritarakyatjawatengah.Model.DataModel;
import com.example.aplikasiceritarakyatjawatengah.Model.Model;
import com.example.aplikasiceritarakyatjawatengah.R;

import java.util.ArrayList;

public class KumpulanCeritaActivity extends AppCompatActivity {
    ImageView back;
    RecyclerView rvCategory;
    private ArrayList<Model> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_cerita);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        pList.addAll(DataModel.getListData());
        AdapterKumpulanCerita cardViewAdapter = new AdapterKumpulanCerita(this);
        cardViewAdapter.setListKumpulanCerita(pList);
        rvCategory.setAdapter(cardViewAdapter);

        back=(ImageView)findViewById(R.id.ivback);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KumpulanCeritaActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
