/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author SagabAdi
 */
public class Mahasiswa {

    private String NIM, Nama, Status;
    private char[] nilai;
    private int i;

    public Mahasiswa() {
        this.Status = "Tidak Lulus";
        this.i = 0;
        nilai = new char[10];
    }

    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        this.i = 0;
        nilai = new char[10];
    }

    public void addNilai(char nilai) {
        if (i < 10) {
            this.nilai[i] = nilai;
        }
        i++;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public char getNilai(int i) {
        return nilai[i];
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String toString() {
        String aps = null;
        String s = null;
        int j;
        aps = "NIM = " + NIM + "\nNama = " + Nama + "\nStatus = " + Status + "\nNilai = ";
        for (j = 0; j < i; j++) {
            aps = aps + nilai[j] + ",";
        }
        return aps;
    }

    public char cekNilai(Mahasiswa m) {
        int j = 0;
        int y = 0;
        char min = 'X';
        while (y != i) {
            while (j != i) {
                if (m.nilai[y] == nilai[j]) {
                    if (m.nilai[y] < min) {
                        min = m.nilai[y];
                    }
                }
                j++;
            }
            j = 0;
            y++;
        }
        return min;
    }
}
