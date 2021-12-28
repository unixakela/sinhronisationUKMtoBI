package lex.example.sinhronisationUKMtoBI.entity.ukm;



import lex.example.sinhronisationUKMtoBI.composit.ukm.TrmInUsersId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trm_in_users")
@IdClass(TrmInUsersId.class)
public class TrmInUsers implements Serializable {

    @Id
    @Column(name = "store_id", nullable = false)
    private Integer storeId;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "user_inn")
    private String userInn;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    public TrmInUsers() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserInn() {
        return userInn;
    }

    public void setUserInn(String userInn) {
        this.userInn = userInn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "TrmInUsers{" +
                "storeId=" + storeId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", userInn='" + userInn + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", version=" + version +
                ", deleted=" + deleted +
                '}';
    }
}
