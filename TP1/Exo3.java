/*Saisir une date (jj-mm-aaaa) puis determiner si la date 
  est valide ou pas 
1- pas de classe de java 
2- Faire avec les classes Java
*/

import java.util.Scanner;
class Date{
    public static void main(String[] args){;
        Scanner sc=new Scanner(System.in);
        System.out.print("saisir jour : ");
        int jour=sc.nextInt();
        System.out.print("saisir mois : ");
        int mois=sc.nextInt();
        System.out.print("saisir année : ");
        int annee=sc.nextInt();
        if ((jour>31 || jour<1) || (mois>12 || mois<1) || (annee<1000 || annee>10000)){;
        System.out.println("donnée saisie incorrecte");
    }
        else{ 
            System.out.println("donnée saisie est '...' ");
            System.out.println((jour)+"-"+(mois)+"-"+(annee));

        }
       


    
}
}