public class CompteBancaire {
    private long num;
    private Client c;
    private float solde;
    public CompteBancaire(Client c, long num) {
        this.num = num;
        this.c = c;
    }
    public float getSolde() {
        return solde;
    }
    public Client getC(){
        return c;
    }
    public long getNum() {
        return num;
    }
    public void setSolde(float solde) {
        this.solde=solde;
    }
    public String toString() {
        return "Compte: " +num+ "\t-Client: "+ c.getNom() + "\t-solde: " + solde + "\t";
    }
     public void credit(float m) {
        solde += m;
     }
    public void debit(float m) {
        solde -= m;
    }
}
