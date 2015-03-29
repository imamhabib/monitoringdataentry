/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Habib
 */
@Entity
@Table(name = "b3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B3.findAll", query = "SELECT b FROM B3 b")})
public class B3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "b3ar1")
    private Integer b3ar1;
    @Column(name = "b3ar2")
    private String b3ar2;
    @Column(name = "b3ar3")
    private String b3ar3;
    @Column(name = "b3ar4")
    private String b3ar4;
    @Column(name = "b3ar5")
    private String b3ar5;
    @Column(name = "b3ar6")
    private String b3ar6;
    @Column(name = "b3ar7s1")
    private String b3ar7s1;
    @Column(name = "b3ar7s2")
    private String b3ar7s2;
    @Column(name = "b3ar7s2lainnya")
    private String b3ar7s2lainnya;
    @Column(name = "b3ar7s3")
    private String b3ar7s3;
    @Column(name = "b3ar8s1")
    private Integer b3ar8s1;
    @Column(name = "b3ar8s2")
    private Integer b3ar8s2;
    @Column(name = "b3ar8s3")
    private String b3ar8s3;
    @Column(name = "b3ar8s4")
    private Integer b3ar8s4;
    @Column(name = "b3ar9s1")
    private String b3ar9s1;
    @Column(name = "b3ar9s2")
    private Integer b3ar9s2;
    @Column(name = "b3ar10s1")
    private String b3ar10s1;
    @Column(name = "b3ar10s2")
    private Integer b3ar10s2;
    @Column(name = "b3br11")
    private String b3br11;
    @Column(name = "b3br12")
    private Integer b3br12;
    @Column(name = "b3br13")
    private String b3br13;
    @Column(name = "b3br14")
    private Integer b3br14;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private B1 nksB1;

    public B3() {
    }

    public B3(String nks) {
        this.nks = nks;
    }

    public Integer getB3ar1() {
        return b3ar1;
    }

    public void setB3ar1(Integer b3ar1) {
        this.b3ar1 = b3ar1;
    }

    public String getB3ar2() {
        return b3ar2;
    }

    public void setB3ar2(String b3ar2) {
        this.b3ar2 = b3ar2;
    }

    public String getB3ar3() {
        return b3ar3;
    }

    public void setB3ar3(String b3ar3) {
        this.b3ar3 = b3ar3;
    }

    public String getB3ar4() {
        return b3ar4;
    }

    public void setB3ar4(String b3ar4) {
        this.b3ar4 = b3ar4;
    }

    public String getB3ar5() {
        return b3ar5;
    }

    public void setB3ar5(String b3ar5) {
        this.b3ar5 = b3ar5;
    }

    public String getB3ar6() {
        return b3ar6;
    }

    public void setB3ar6(String b3ar6) {
        this.b3ar6 = b3ar6;
    }

    public String getB3ar7s1() {
        return b3ar7s1;
    }

    public void setB3ar7s1(String b3ar7s1) {
        this.b3ar7s1 = b3ar7s1;
    }

    public String getB3ar7s2() {
        return b3ar7s2;
    }

    public void setB3ar7s2(String b3ar7s2) {
        this.b3ar7s2 = b3ar7s2;
    }

    public String getB3ar7s2lainnya() {
        return b3ar7s2lainnya;
    }

    public void setB3ar7s2lainnya(String b3ar7s2lainnya) {
        this.b3ar7s2lainnya = b3ar7s2lainnya;
    }

    public String getB3ar7s3() {
        return b3ar7s3;
    }

    public void setB3ar7s3(String b3ar7s3) {
        this.b3ar7s3 = b3ar7s3;
    }

    public Integer getB3ar8s1() {
        return b3ar8s1;
    }

    public void setB3ar8s1(Integer b3ar8s1) {
        this.b3ar8s1 = b3ar8s1;
    }

    public Integer getB3ar8s2() {
        return b3ar8s2;
    }

    public void setB3ar8s2(Integer b3ar8s2) {
        this.b3ar8s2 = b3ar8s2;
    }

    public String getB3ar8s3() {
        return b3ar8s3;
    }

    public void setB3ar8s3(String b3ar8s3) {
        this.b3ar8s3 = b3ar8s3;
    }

    public Integer getB3ar8s4() {
        return b3ar8s4;
    }

    public void setB3ar8s4(Integer b3ar8s4) {
        this.b3ar8s4 = b3ar8s4;
    }

    public String getB3ar9s1() {
        return b3ar9s1;
    }

    public void setB3ar9s1(String b3ar9s1) {
        this.b3ar9s1 = b3ar9s1;
    }

    public Integer getB3ar9s2() {
        return b3ar9s2;
    }

    public void setB3ar9s2(Integer b3ar9s2) {
        this.b3ar9s2 = b3ar9s2;
    }

    public String getB3ar10s1() {
        return b3ar10s1;
    }

    public void setB3ar10s1(String b3ar10s1) {
        this.b3ar10s1 = b3ar10s1;
    }

    public Integer getB3ar10s2() {
        return b3ar10s2;
    }

    public void setB3ar10s2(Integer b3ar10s2) {
        this.b3ar10s2 = b3ar10s2;
    }

    public String getB3br11() {
        return b3br11;
    }

    public void setB3br11(String b3br11) {
        this.b3br11 = b3br11;
    }

    public Integer getB3br12() {
        return b3br12;
    }

    public void setB3br12(Integer b3br12) {
        this.b3br12 = b3br12;
    }

    public String getB3br13() {
        return b3br13;
    }

    public void setB3br13(String b3br13) {
        this.b3br13 = b3br13;
    }

    public Integer getB3br14() {
        return b3br14;
    }

    public void setB3br14(Integer b3br14) {
        this.b3br14 = b3br14;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    public B1 getNksB1() {
        return nksB1;
    }

    public void setNksB1(B1 nksB1) {
        this.nksB1 = nksB1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nks != null ? nks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B3)) {
            return false;
        }
        B3 other = (B3) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.B3[ nks=" + nks + " ]";
    }
    
}
