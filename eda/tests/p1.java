package tests;
import aplicaciones.primitiva.*;

public class p1 {
    public static void main (String [] args){
        ApuestaPrimitiva aOrd = new ApuestaPrimitiva(true);
        ApuestaPrimitiva aDes = new ApuestaPrimitiva(false);
        
        System.out.println("Ordenada: " + aOrd.toString());
        System.out.println("Desordenada: " + aDes.toString());
        

    }
}
