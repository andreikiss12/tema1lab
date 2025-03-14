package Exercitiul3;

import java.util.Arrays;

/**
 * Clasa Placa
 * In aceasta clasa avem un constructor initializat si unul
 * neinitializat
 * Avem metode de getter si setter pentru fiecare argument din constructor
 */

public class Placa {
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean [] canturi;
    private int nr_bucati;

    public Placa() {
    }

    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public Orientare getOrientare() {
        return orientare;
    }

    public void setOrientare(Orientare orientare) {
        this.orientare = orientare;
    }

    public boolean[] getCanturi() {
        return canturi;
    }

    public void setCanturi(boolean[] canturi) {
        this.canturi = canturi;
    }

    public int getNr_bucati() {
        return nr_bucati;
    }

    public void setNr_bucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    /**
     * Suprascriere la functia toString
     * @return specificatiile unei placi
     */

    @Override
    public String toString() {
        return "Placa{" +
                "descriere='" + descriere + '\'' +
                ", lungime=" + lungime +
                ", latime=" + latime +
                ", orientare=" + orientare +
                ", canturi=" + Arrays.toString(canturi) +
                ", nr_bucati=" + nr_bucati +
                '}';
    }
}
