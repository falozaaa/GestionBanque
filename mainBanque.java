import java.util.*;
public class mainBanque {
    public static void main(String [] args) {
        //partie1
        /*Client c5 = new Client(5,"Gold");
        Client c6 = new Client(6,"Silver");
        CompteBancaire com1 = new CompteBancaire(c1,10);
        CompteBancaire com2 = new CompteBancaire(c1,20);
        c6.setNom("Platinum");
        c5.addComptes(com1);
        c5.addComptes(com2);
        com1.setSolde(2000f); // le solde du client 1 pour son premier compte
        System.out.println(c5); //affichage des infos du client 1 */
        //partie2
        ArrayList<Client> c = new ArrayList<Client>();
        Client c1 = new Client(1,"client1");
        CompteBancaire com1 = new CompteBancaire(c1,20);
        c1.addComptes(com1);
        com1.setSolde(199);
        Client c2 = new Client(2,"client2");
        CompteBancaire com2 = new CompteBancaire(c2,12);
        com2.setSolde(100);
        CompteBancaire com3 = new CompteBancaire(c2,4);
        c2.addComptes(com2);
        c2.addComptes(com3);
        System.out.println("Client 1 has only one account: " +"\n->>informations: "+c1);
        System.out.println("Client 2 has two accounts: " +"\n->>informations: "+c2);
        //compteCourant
        CompteCourant compteC = new CompteCourant(1,c1);
        compteC.setSolde(100);
        CompteEpargne compteE = new CompteEpargne(1,10,c1,compteC);
        compteE.transfert();
        System.out.println(com1.getSolde());
        System.out.println(compteE.getSolde());





    }
}
