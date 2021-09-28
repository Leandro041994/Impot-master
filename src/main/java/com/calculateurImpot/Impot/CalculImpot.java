package com.calculateurImpot.Impot;

public class CalculImpot {

    public Double calculerImpot(double revenu) throws ExceptionRevenuNegatif {
        if(revenu <0){
            throw new ExceptionRevenuNegatif();
        }
        Double resultat = 0.0;
        if (revenu <= 20000) {
            return revenu * 0.10;
        }
        else if (revenu <=100000){
            resultat= 2000.0;
            resultat += (revenu-20000) *0.20;
            return resultat;
        }
        else{
            resultat=2000.0;
            resultat +=16000.0;
            resultat += (revenu-100000) *0.30;
            return resultat;

        }
    }
}