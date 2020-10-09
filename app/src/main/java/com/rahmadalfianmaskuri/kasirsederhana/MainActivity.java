package com.rahmadalfianmaskuri.kasirsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
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
                double jmlBrg = Double.parseDouble(kasir.setJumlahBarang(binding.editJmlBrg.getText().toString().trim()));
                hrgBrg = Double.parseDouble(kasir.setHargaBarang(binding.editHargaBrg.getText().toString().trim()));
                total  = jmlBrg * hrgBrg;
                binding.txtTotal.setText(String.valueOf(total));
            }
        });
        binding.btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double bayar = Double.parseDouble(kasir.setBayar(binding.editBayar.getText().toString().trim()));
                double tt = Double.parseDouble(binding.txtTotal.getText().toString().trim());
                double kembalian = bayar - tt;
                binding.txtKembalian.setText(String.valueOf(kembalian));
            }
        });
        binding.btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kasir.setNamaBarang(binding.spinnerNama.getSelectedItem().toString());
                kasir.setHargaBarang(binding.editHargaBrg.getText().toString());
                kasir.setJumlahBarang(binding.editJmlBrg.getText().toString());
                kasir.setBayar(binding.editBayar.getText().toString());
                kasir.setKembalian(binding.txtKembalian.getText().toString());
                kasir.setTotal(binding.txtTotal.getText().toString());
                Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                // put mahasiswa object to extra
                intent.putExtra("KASIR",kasir);
                startActivity(intent);


            }
        });
        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editHargaBrg.setText("");
                binding.editJmlBrg.setText("");
                binding.editBayar.setText("");
                binding.txtTotal.setText("");
                binding.txtKembalian.setText("");
            }
        });


    }
}