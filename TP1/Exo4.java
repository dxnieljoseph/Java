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
        System.out.print("saisir date : ");
        int date=sc.nextInt();
        if (date<=0){;
            System.out.println("date éronnée saisir nouvelle date : ");
        }
        else{
            System.out.println("date aujourd'hui est : "+date);
            add =date+1;
            System.out.println("date deamin est : "+add);
            decrease =date-1;
            System.out.println("date hier est : "+decrease);
        }
        
    
}
}