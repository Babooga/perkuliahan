/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided2;

/**
 *
 * @author rama
 * 2211102208
 */
public final class Direktur extends Pegawai {

    private double gajiDirektur;
    private double dividenSaham;
//Konstruktor Kelas Direktur

    public Direktur(String nama, double gaji, double dividen) {
        super(nama); //Memanggil konstruktor kelas Pegawai
        setGajiDirektur(gaji);
        setDividen(dividen);
    }

    public void setGajiDirektur(double gaji) //Mengeset gaji direktur
    {
        if (gaji > 0) {
            gajiDirektur = gaji;
        } else {
            gajiDirektur = 0;
        }

    }
//Mengeset hasil pembagian dividen keuntungan saham

    public void setDividen(double dividen) {
        if (dividen > 0) {
            dividenSaham = dividen;
        } else {
            dividenSaham = 0;
        }

    }

    public String nama()//Method yang mengembalikan nama
    {
        return super.namaPegawai();
    }

    public String jabatan()//Method yang mengembalikan jabatan
    {
        return "Direktur";
    }
//Method yang mengembalikan besar gaji direktur

    public double gajiPerBulan() {
        return gajiDirektur;
    }
//Method yang mengembalikan besar dividen saham

    public double labaDividen() {
        return dividenSaham;
    }
//Pengimplementasian / Pendefinisian method abstract dari kelas Pegawai
//Method ini mengembalikan besar gaji direktur

    @Override
    public double income() {
        return (gajiDirektur + dividenSaham);
    }
}
