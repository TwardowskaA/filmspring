package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tytul;
    private LocalDate data;
    private String opis;

    @Enumerated(value = EnumType.STRING)
    private Kategoria kategoria;

    public Film(String tytul, LocalDate data, String opis, Kategoria kategoria) {
        this.tytul = tytul;
        this.data = data;
        this.opis = opis;
        this.kategoria = kategoria;
    }

    public Film(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }
}
