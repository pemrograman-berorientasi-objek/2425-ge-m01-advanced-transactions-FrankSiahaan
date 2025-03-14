package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {
    private final String nama;
    private final String inisial;
    private Double balance;

    public Account(String _nama, String _inisial, Double _balance) {
        this.nama = _nama;
        this.inisial = _inisial;
        this.balance = _balance;
    }

    public String getnama() {
        return this.nama;
    }

    public String getinisial() {
        return this.inisial;
    }

    public Double balance() {
        return this.balance;
    }

    public void setbalance(Double _balancee) {
        this.balance = _balancee;
    }
    
    @Override
    public String toString() {
        return this.inisial + "|" + this.nama + "|" + this.balance;
    }
}