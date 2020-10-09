package com.rahmadalfianmaskuri.kasirsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.rahmadalfianmaskuri.kasirsederhana.databinding.ActivityMainBinding;
import com.rahmadalfianmaskuri.kasirsederhana.models.Kasir;
public class MainActivity extends AppCompatActivity {
    Kasir kasir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        kasir = new Kasir();

        binding.btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hrgBrg;
                double total;
                double jmlBrg = Double.parseDouble(kasir.getJumlahBarang(binding.editJmlBrg.getText().toString().trim());
                hrgBrg = Double.parseDouble(kasir.getHargaBarang(binding.editHargaBrg.getText().toString().trim()));
                total  = jmlBrg * hrgBrg;
                binding.txtTotal.setText((int) total);
            }
        });
    }
}