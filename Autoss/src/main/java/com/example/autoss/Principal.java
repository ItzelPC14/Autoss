package com.example.autoss;


public class Principal {
    public static void main(String[]args){

        Auto primero = new Auto("Fiat", "46PG", 20012);
        Auto segundo = new Auto("Fort", "94ET", 2019);
        Auto tercero = new Auto("Chebrolet", "54ET5", 2020);
        Auto cuarto = new Auto("Volkswagen", "648SYUJ", 2022);
        Auto quinto = new Auto("Fiat", "EG54", 2021);

        Auto[] carrera= new Auto[4];
        carrera[0]=primero;
        carrera[1]=segundo;
        carrera[2]=tercero;
        carrera[3]=cuarto;
        carrera[4]=quinto;

        for (Auto a:carrera){
            System.out.println("------------------");
            System.out.println(a.toString());
        }

    }
}
