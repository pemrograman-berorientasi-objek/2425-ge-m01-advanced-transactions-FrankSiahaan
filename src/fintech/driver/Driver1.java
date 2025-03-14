package fintech.driver;
import fintech.model.Account;
import fintech.model.Transaction;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S23016 Frank Niroy Siahaan
 * @author 12S23012 Genesis Panjaitan
 */
public class Driver1 {

    public static void main(String[] _args) {
        ArrayList<Account> account = new ArrayList<>();
        ArrayList<Transaction> trans = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String temp;
        String nama;
        String inisial;
        Double balance;

        String inisials;
        Double balances;
        String date;
        String keterangan;

        int i = 1;
        
        while (true) {
            temp = input.nextLine();
            String[] hasil = temp.split("#");
            if (temp.equals("---")) {
                break;
            }
            
            if (hasil[0].equals("create-account")) {
                nama = hasil[1];
                inisial = hasil[2];
                balance = 0.0;
                account.add(new Account(nama, inisial, balance));

                for (Account r : account) {
                    if (r.getnama().contains(nama)) {
                        System.out.println(r.toString());
                    }
                }
                
            } else if (hasil[0].equals("create-transaction")) {
                Double amount = 0.0;
                inisials = hasil[1];
                balances = Double.valueOf(hasil[2]);
                

                for (Account s : account) {
                    if (s.getinisial().contains(inisials)) {
                        amount = balances + s.balance();
                    }
                }

                if (amount < 0.0) {
                    amount = 0.0;
                } else {
                    date = hasil[3];
                    keterangan = hasil[4];
    
                    for (Account t : account) {
                        if (t.getinisial().contains(inisials)) {
                            t.setbalance(amount);
                        }
                    }
                    
                    trans.add(new Transaction(i, inisials, balances, date, keterangan, amount));
                }
                i++;
            } else if(hasil[0].equals("show-account")) {
                for (Account s : account) {
                    if (s.getinisial().contains(hasil[1])) {
                        System.out.println(s.toString());
                        for (Transaction g : trans) {
                            if (hasil[1].contains(g.getinisial())) {
                                System.out.println(g.toString());
                            }
                        }
                    }
                }
            }
        }

        input.close();
    }
}