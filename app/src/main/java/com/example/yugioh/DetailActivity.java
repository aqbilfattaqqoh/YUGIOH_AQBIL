package com.example.yugioh;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView tvNamaKartu;
    private TextView tvTipeKartu;
    private TextView tvDesKartu;
    private TextView tvAtkKartu;
    private TextView tvDefKartu;
    private TextView tvAttKartu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        tvNamaKartu.setText(getIntent().getStringExtra("nama_kartu "));
        tvTipeKartu.setText(getIntent().getStringExtra("tipe_kartu"));
        tvDesKartu.setText(getIntent().getStringExtra("des_kartu"));
        tvAtkKartu.setText(getIntent().getStringExtra("atk_kartu"));
        tvDefKartu.setText(getIntent().getStringExtra("def_kartu"));
        tvAttKartu.setText(getIntent().getStringExtra("att_kartu"));
    }
    private void initView() {
        tvNamaKartu = findViewById(R.id.tv_nama_kartu);
        tvTipeKartu = findViewById(R.id.tv_tipe_kartu);
        tvDesKartu = findViewById(R.id.tv_des_kartu);
        tvAtkKartu = findViewById(R.id.tv_atk_kartu);
        tvDefKartu = findViewById(R.id.tv_def_kartu);
        tvAttKartu = findViewById(R.id.tv_att_kartu);
    }
}