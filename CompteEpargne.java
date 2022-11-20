public class CompteEpargne extends CompteBancaire{
    private CompteCourant c;
    private float montantTransfert;
    public CompteEpargne(int num,float montantTransfert,Client c,CompteCourant cp) {
        super(c,num);
        this.c = cp;
        this.montantTransfert = montantTransfert;
    }
    public float getMontantTransfert() {
        return montantTransfert;
    }
    public void transfert() {
        c.debit(montantTransfert);
        credit(montantTransfert);

    }
    @Override
    public String toString() {
        return "Compte epargne no "+ c.getNum() +"\tnumero du compte: "+ c.getNum()+"\tsolde: "+ c.getSolde()+"\n";
    }
}
