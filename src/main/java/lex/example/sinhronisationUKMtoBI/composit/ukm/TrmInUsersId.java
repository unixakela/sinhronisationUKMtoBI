package lex.example.sinhronisationUKMtoBI.composit.ukm;


import java.io.Serializable;

public class TrmInUsersId implements Serializable {

    private Integer storeId;
    private Integer id;

    public TrmInUsersId(Integer storeId, Integer id) {
        this.storeId = storeId;
        this.id = id;
    }

    public TrmInUsersId() {
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
