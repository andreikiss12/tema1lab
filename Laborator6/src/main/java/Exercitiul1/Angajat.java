package Exercitiul1;

import java.time.LocalDate;

public class Angajat {
    private String nume;
    private String postul;
    private LocalDate data_angajarii;
    private float salariul;

    public Angajat(String nume, String postul, LocalDate data_angajarii, float salariul) {
        this.nume = nume;
        this.postul = postul;
        this.data_angajarii = data_angajarii;
        this.salariul = salariul;
    }

    @Override
    public String toString() {
        return  "Nume: " + nume +
                "\n postul: " + postul +
                "\n data angajarii: " + data_angajarii +
                "\n salariul: " + salariul + " RON";
    }

    public Angajat() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPostul() {
        return postul;
    }

    public void setPostul(String postul) {
        this.postul = postul;
    }

    public LocalDate getData_angajarii() {
        return data_angajarii;
    }

    public void setData_angajarii(LocalDate data_angajarii) {
        this.data_angajarii = data_angajarii;
    }

    public float getSalariul() {
        return salariul;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }


}
