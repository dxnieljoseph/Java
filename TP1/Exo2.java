///Saisir une année et un mois 
///puis determiner le nombre de jour de ce mois  dans l'année
///   1- pas de classe de java 
///   2- Faire avec les classes Java 
import java.util.Scanner;
class exos2{
    public static void main(String[] args){;
    Scanner sc=new Scanner(System.in);
    int jour;
    int i;
    int j=31;
    int y=30;
    int x=28;
    System.out.print("saisir année : ");
    int annee=sc.nextInt();
    System.out.println("année saisie est : \t"+annee);
    System.out.println("saisir mois : ");
    String mois=sc.next();
    String mois2=mois;
    System.out.println("mois saisi est : "+mois);
    switch (mois) {
        case "Janvier" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Mars" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Mai" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Juillet" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Aout" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Octobre" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Decembre" :
            System.out.println("mois: "+j+"jours"); 
        break;
        case "Fevrier" :
            System.out.println("mois: "+x+"jours"); 
        break;
        default:System.out.println("mois: "+y+"jours");
}
}
}
