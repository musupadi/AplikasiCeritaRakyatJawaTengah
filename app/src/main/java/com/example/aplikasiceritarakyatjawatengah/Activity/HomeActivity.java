package com.example.aplikasiceritarakyatjawatengah.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aplikasiceritarakyatjawatengah.R;

public class HomeActivity extends AppCompatActivity {
    TextView Cerita,Kumpulan,Tentang,Exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Cerita=(TextView)findViewById(R.id.tvCeritaRakyat);
        Kumpulan=(TextView)findViewById(R.id.tvKumpulan);
    }
}
