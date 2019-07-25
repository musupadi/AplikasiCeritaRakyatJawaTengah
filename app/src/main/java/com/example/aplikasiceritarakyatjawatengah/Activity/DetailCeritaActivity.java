package com.example.aplikasiceritarakyatjawatengah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasiceritarakyatjawatengah.R;

public class DetailCeritaActivity extends AppCompatActivity {
    TextView Judul,Detail;
    ImageView Gambar,Play;
    Button Motto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cerita);
        Judul = (TextView)findViewById(R.id.tvJudul);
        Detail = (TextView)findViewById(R.id.tvDetailCerita);
        Gambar = (ImageView)findViewById(R.id.ivGambar);
        Play = (ImageView)findViewById(R.id.ivPlay);
        Motto = (Button)findViewById(R.id.btnMotto);
        Intent data = getIntent();
        //Constant

        final String gambar = data.getStringExtra("GAMBAR");
        final String judul = data.getStringExtra("JUDUL");
        final String cerita = data.getStringExtra("CERITA");
        final String pesanmoral = data.getStringExtra("PESANMORAL");
        final String suara = data.getStringExtra("SUARA");

        Judul.setText(judul);
        Gambar.setImageResource(Integer.parseInt(gambar));
        Detail.setText(cerita);
        Motto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(DetailCeritaActivity.this, MottoActivity.class);
                goInput.putExtra("GAMBAR",gambar);
                goInput.putExtra("JUDUL",judul);
                goInput.putExtra( "CERITA",cerita);
                goInput.putExtra("PESANMORAL",pesanmoral);
                goInput.putExtra("SUARA",suara);
                DetailCeritaActivity.this.startActivities(new Intent[]{goInput});
            }
        });
    }
}
