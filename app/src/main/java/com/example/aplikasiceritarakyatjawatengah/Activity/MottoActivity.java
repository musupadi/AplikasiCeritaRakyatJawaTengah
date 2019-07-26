package com.example.aplikasiceritarakyatjawatengah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasiceritarakyatjawatengah.R;

public class MottoActivity extends AppCompatActivity {
    ImageView back, exit;
    Button selesai;
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

        back=(ImageView)findViewById(R.id.ivback);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MottoActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        selesai=(Button) findViewById(R.id.ivselesai);

        selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MottoActivity.this,DetailCeritaActivity.class);
                startActivity(intent);
                finish();
            }
        });
        exit=(ImageView)findViewById(R.id.ivexit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MottoActivity.this,KumpulanCeritaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
