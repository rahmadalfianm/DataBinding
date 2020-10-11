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
    private String metodeBayar;
    private String bank;

    public Kasir() {
    }

    public Kasir(String namaBarang, String hargaBarang, String jumlahBarang, String total, String bayar, String kembalian,
                 String metodeBayar, String bank) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.total = total;
        this.bayar = bayar;
        this.kembalian = kembalian;
        this.metodeBayar = metodeBayar;
        this.bank = bank;
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

    public String getMetodeBayar() {
        return metodeBayar;
    }

    public void setMetodeBayar(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
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
        dest.writeString(this.metodeBayar);
        dest.writeString(this.bank);
    }

    protected Kasir(Parcel in) {
        this.namaBarang = in.readString();
        this.hargaBarang = in.readString();
        this.jumlahBarang = in.readString();
        this.total = in.readString();
        this.bayar = in.readString();
        this.kembalian = in.readString();
        this.metodeBayar = in.readString();
        this.bank = in.readString();
    }

    public static final Creator<Kasir> CREATOR = new Creator<Kasir>() {
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

