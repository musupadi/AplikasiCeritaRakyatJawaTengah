package com.example.aplikasiceritarakyatjawatengah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aplikasiceritarakyatjawatengah.R;

public class MottoActivity extends AppCompatActivity {
    TextView Motto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motto);
        Motto = (TextView)findViewById(R.id.tvMotto);
        Intent data = getIntent();
        //Constant

        final String gambar = data.getStringExtra("GAMBAR");
        final String judul = data.getStringExtra("JUDUL");
        final String cerita = data.getStringExtra("CERITA");
        final String pesanmoral = data.getStringExtra("PESANMORAL");
        final String suara = data.getStringExtra("SUARA");
        Motto.setText(pesanmoral);
    }
}
