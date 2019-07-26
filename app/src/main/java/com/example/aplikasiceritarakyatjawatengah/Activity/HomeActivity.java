package com.example.aplikasiceritarakyatjawatengah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aplikasiceritarakyatjawatengah.R;

public class HomeActivity extends AppCompatActivity {
    Button Cerita,Kumpulan,Tentang,Exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Cerita=(Button) findViewById(R.id.btnCerita);
        Kumpulan=(Button)findViewById(R.id.btnKumpulan);
        Tentang=(Button)findViewById(R.id.btnTentang);
        Exit=(Button)findViewById(R.id.btnKeluar);
        Cerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,CeritaRakyatActivity.class);
                startActivity(intent);
            }
        });
        Kumpulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,KumpulanCeritaActivity.class);
                startActivity(intent);
            }
        });
        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            finish();
            System.exit(0);
            }
        });
    }
}
