package lex.example.sinhronisationUKMtoBI.composit.bi;


import java.io.Serializable;

public class CashierReceiptId implements Serializable {
    private Integer store_id_ukm;
    private Integer cashier_id;

    public CashierReceiptId() {
    }

    public CashierReceiptId(Integer store_id_ukm, Integer cashier_id) {
        this.store_id_ukm = store_id_ukm;
        this.cashier_id = cashier_id;
    }

    public Integer getStore_id_ukm() {
        return store_id_ukm;
    }

    public void setStore_id_ukm(Integer store_id_ukm) {
        this.store_id_ukm = store_id_ukm;
    }

    public Integer getCashier_id() {
        return cashier_id;
    }

    public void setCashier_id(Integer cashier_id) {
        this.cashier_id = cashier_id;
    }
}
