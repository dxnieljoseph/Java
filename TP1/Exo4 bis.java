/*
  Saisir une date puis determiner la date suivante puis la date precedente 

    1- pas de classe de java 

    2- Faire avec les classes Java

*/
import java.util.Scanner;
class exos4{
    public static void main(String[]args){;
        Scanner sc=new Scanner(System.in);
        int add;
        int decrease;
        System.out.println("saisir date ");
        System.out.print("saisir jour : ");
        int jour=sc.nextInt();
        System.out.print("saisir mois : ");
        int mois=sc.nextInt();
        System.out.print("saisir année : ");
        int annee=sc.nextInt();
        if ((jour>31 || jour<1) || (mois>12 || mois<1) || (annee<1000 || annee>10000)){;
        System.out.println("THIS INPUT IS INCORRECT");
    }
    else{
        System.out.println("date aujourd'hui est : " +jour+"/"+mois+"/"+annee);
        add =jour+1;
        System.out.println("date demain est : " +add+"/"+mois+"/"+annee);
        decrease =jour-1;
        System.out.println("date hier est : " +decrease+"/"+mois+"/"+annee);
    }

        
        
        
    
}
}