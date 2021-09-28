package com.calculateurImpot.Impot;

import org.junit.Assert;
import org.junit.Test;

public class
TestCalculImpot {

    @Test (timeout = 1000)
    public void testCalcul20000() throws ExceptionRevenuNegatif {
        CalculImpot calculImpot = new CalculImpot();
        Double res = calculImpot.calculerImpot(20000.0);
        System.out.println("Le resultat est " + res);
        Assert.assertEquals(2000.0,res,0.000000001);
    }
    @Test (timeout = 1000)
    public void testCalcul99999() throws ExceptionRevenuNegatif {
        CalculImpot calculImpot= new CalculImpot();
        Double res = calculImpot.calculerImpot(99999.0);
        System.out.println("Le resultat est " + res);
        Assert.assertEquals(17999,res,0.800000000003);
    }
    @Test (timeout = 1000)
    public void testCalcul200000() throws ExceptionRevenuNegatif {
        CalculImpot calculImpot= new CalculImpot();
        Double res = calculImpot.calculerImpot(200000.0);
        System.out.print("Le resultat est " + res);
        Assert.assertEquals(48000,res,0.0);
     }
}
