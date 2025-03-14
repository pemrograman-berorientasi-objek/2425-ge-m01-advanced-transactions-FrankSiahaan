package fintech.model;


/**
 * @author 12S23012 Genesis Tombak Dapot Tua Panjaitan
 * @author 12S23016 Frank Niroy Siahaan
 */
public class Transaction {

    // class definition
    private final int id;
    private final String inisial;
    private final Double balance;
    private final String date;
    private final String keterangan;
    private Double amount;

    public Transaction(int _id, String _inisial, Double _balance, String _date, String _keterangan, Double _amount) {
        this.id = _id;
        this.inisial = _inisial;
        this.balance = _balance;
        this.date = _date;
        this.keterangan =  _keterangan;
        this.amount = _amount;
    }

    public int getid() {
        return this.id;
    }

    public String getinisial() {
        return this.inisial;
    }

    public Double getbalance() {
        return this.balance;
    }

    public String getdate() {
        return this.date;
    }

    public String getket() {
        return this.keterangan;
    }

    public Double getamount() {
        return this.amount;
    }

    public void setamount(Double _amounts) {
        this.amount = _amounts;
    }

    @Override
    public String toString() {
        return this.id + "|" + this.inisial + "|" + this.balance + "|" + this.date + "|" + this.keterangan;
    }
}