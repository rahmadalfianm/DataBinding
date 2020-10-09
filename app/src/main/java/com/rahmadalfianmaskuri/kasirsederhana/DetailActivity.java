package com.rahmadalfianmaskuri.kasirsederhana;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.rahmadalfianmaskuri.kasirsederhana.databinding.ActivityDetailBinding;
import com.rahmadalfianmaskuri.kasirsederhana.models.Kasir;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        Kasir kasir = Objects.requireNonNull(getIntent().getExtras()).getParcelable("KASIR");
        binding.setKasir(kasir);
    }
}
