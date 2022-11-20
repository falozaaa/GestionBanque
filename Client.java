import java.util.*;
public class Client {
    private long num;
    private String nom;
    ArrayList<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
    public Client(long num, String nom) {
        this.num = num;
        this.nom = nom;
    }
    public long getNum() {
        return num;
    }
    public String getNom () {
        return nom;
    }
    public void setNum(long num) {
        this.num = num;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    public String toString() {
        return "\nnum: " + num + "\nnom: " + nom + "\ncompte(s) " + comptes;

    }

    public void addComptes(CompteBancaire c) {
        comptes.add(c);
    }
    public ArrayList<CompteBancaire> getComptes() {
        return comptes;
    }
}
