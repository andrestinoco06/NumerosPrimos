import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        int num;
        System.out.println ("Establece el limite para los numeros primos: ");
        int lim = S.nextInt ();
        System.out.println ("------------------------");
        System.out.println ("1");
        for (int i=1; i<=lim; i++){
            int cont=0;
            for (int j=1; j<=i; j++){
                if ((i%j)==0){
                    cont++;  
                }
            }
            if (cont==2){
                System.out.println (+i);
            }
        }
     }
      
}
      