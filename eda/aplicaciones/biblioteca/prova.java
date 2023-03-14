package aplicaciones.biblioteca;

public class prova {
    public static void main(String [] args){
        /** 
         * Termino x = new Termino("casa");
        x.hashCode();
        System.out.println(x.valorHash);
        */
        Termino x = new Termino("saco");
        Termino y = new Termino("asco");
        Termino z = new Termino("noreste");
        Termino m = new Termino("enteros");
        Termino k = new Termino("cronista");
        Termino u = new Termino("cortinas");


        Termino [] res = new Termino[6];
        /**
         * res[0].termino = "saco";
        res[1].termino = "asco";
        res[2].termino = "noreste";
        res[3].termino = "enteros";
        res[4].termino = "cronista";
        res[5].termino = "cortinas";
         */
        

        res[0] = x;
        res[1] = y;
        res[2] = z;
        res[3] = m;
        res[4] = k;
        res[5] = u;

        for(int i = 0;i < res.length;i++){
            res[i].hashCode();   
        } 
        for(int i=0;i<res.length-1;i++){
            if(i%2 == 0){
                System.out.println(res[i].equals(res[i+1]));
            }
        }
        BuscadorDeLaBibl x = new BuscadorDeLaBibl();
        

    }
}
