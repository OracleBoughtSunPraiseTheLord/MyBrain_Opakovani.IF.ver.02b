package opakování.pkgif;

import java.util.Scanner;

public class OpakováníIf {
    public static void main(String[] args) {
// je potřeba vstup od uživatele
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadej číslo a: ");
        int a = vstup.nextInt();
        System.out.print("Zadej číslo b: ");
        int b = vstup.nextInt();
        // prohodit proměnné, pokud jsou hodnoty obráceně
        if( a>b ){
            //swap 'a' a 'b'
            int pomocná = a;
            a=b;
            b=pomocná;
            
        }
        System.out.println("Čísla podle pořadí: "+ a +" "+ b);
    }
    
}
