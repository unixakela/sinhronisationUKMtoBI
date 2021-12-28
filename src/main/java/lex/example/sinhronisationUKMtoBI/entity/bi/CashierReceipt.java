package lex.example.sinhronisationUKMtoBI.entity.bi;

import lex.example.sinhronisationUKMtoBI.composit.bi.CashierReceiptId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cashier_receipt")
@IdClass(CashierReceiptId.class)
public class CashierReceipt implements Serializable {
    @Id
    private Integer store_id_ukm;
    @Id
    private Integer cashier_id;

    private String cashier_name;
    private String  cashier_inn;
    private Long cashier_role;

    public CashierReceipt(Integer store_id_ukm, Integer cashier_id, String cashier_name, String cashier_inn, Long cashier_role) {
        this.store_id_ukm = store_id_ukm;
        this.cashier_id = cashier_id;
        this.cashier_name = cashier_name;
        this.cashier_inn = cashier_inn;
        this.cashier_role = cashier_role;
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

    public String getCashier_name() {
        return cashier_name;
    }

    public void setCashier_name(String cashier_name) {
        this.cashier_name = cashier_name;
    }

    public String getCashier_inn() {
        return cashier_inn;
    }

    public void setCashier_inn(String cashier_inn) {
        this.cashier_inn = cashier_inn;
    }

    public Long getCashier_role() {
        return cashier_role;
    }

    public void setCashier_role(Long cashier_role) {
        this.cashier_role = cashier_role;
    }



    public CashierReceipt() {
    }
}
