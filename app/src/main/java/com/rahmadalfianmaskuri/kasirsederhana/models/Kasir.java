package com.rahmadalfianmaskuri.kasirsederhana.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Kasir implements Parcelable {
    private String namaBarang;
    private String hargaBarang;
    private String jumlahBarang;
    private String total;
    private String bayar;
    private String kembalian;

    public Kasir() {
    }

    public Kasir(String namaBarang, String hargaBarang, String jumlahBarang, String total, String bayar, String kembalian) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.total = total;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public String setHargaBarang(String hargaBarang) {
        return this.hargaBarang = hargaBarang;
    }

    public String getJumlahBarang() {
        return jumlahBarang;
    }

    public String setJumlahBarang(String jumlahBarang) {
        return this.jumlahBarang = jumlahBarang;
    }

    public String getTotal() {
        return total;
    }

    public String  setTotal(String total) {
        return this.total = total;
    }

    public String getBayar() {
        return bayar;
    }

    public String setBayar(String bayar) {

        return this.bayar = bayar;
    }

    public String getKembalian() {
        return kembalian;
    }

    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaBarang);
        dest.writeString(this.hargaBarang);
        dest.writeString(this.jumlahBarang);
        dest.writeString(this.total);
        dest.writeString(this.bayar);
        dest.writeString(this.kembalian);
    }

    protected Kasir(Parcel in) {
        this.namaBarang = in.readString();
        this.hargaBarang = in.readString();
        this.jumlahBarang = in.readString();
        this.total = in.readString();
        this.bayar = in.readString();
        this.kembalian = in.readString();
    }

    public static final Parcelable.Creator<Kasir> CREATOR = new Parcelable.Creator<Kasir>() {
        @Override
        public Kasir createFromParcel(Parcel source) {
            return new Kasir(source);
        }

        @Override
        public Kasir[] newArray(int size) {
            return new Kasir[size];
        }
    };
}
