package com.example.autoss;

public class Auto {
    private String marca;
    private String modelo;
    private int year;

    public Auto(String mar, String mod, int an){
        marca=mar;
        modelo=mod;
        year=an;
    }

    public Auto(){
        marca="Fiat";
        modelo="5466P";
        year=1997;
    }
    public String toString(){
        String mensaje = "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAño: " + this.year;
        return mensaje;
    }


}