import java.util.Scanner;
class Anneebissextile{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);//saisir
        /*
        Exercice1:
        Saisir une année qui est un entier positif puis 
        déterminer si l'année est bissextile ou ordinaire. 
        Une année est bissextile si elle est :
        -divisible par 4 et non par 100
        -divisible par 400
        */

            System.out.print("saisir année : \t");
            int N=sc.nextInt();
            while (N<=0){
                System.out.print("saisir année valide : \t");
                int x=sc.nextInt();
                N=x;
            }
        if ((N%4==0 && N%100!=0) || N%400==0) // ou=||
        {
            System.out.println("année " +N+ " est bissextile");
        }else{
            System.out.println("année " +N+ " n'est pas bissextile");
        }
    }              
    
}