public class CompteCourant extends CompteBancaire{
    public CompteCourant(long num, Client c) {
        super(c,num);
    }
    @Override
    public String toString() {
        return "Numero du Compte courant: " + getNum() + "\t" +
                "numero du compte: "+ getNum() + "\t" +
                "solde: " +getSolde() +"\n";
    }
}
