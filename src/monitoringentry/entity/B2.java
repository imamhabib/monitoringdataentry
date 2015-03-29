/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Habib
 */
@Entity
@Table(name = "b2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B2.findAll", query = "SELECT b FROM B2 b")})
public class B2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "b2r1s1")
    private String b2r1s1;
    @Basic(optional = false)
    @Column(name = "b2r1s2")
    private String b2r1s2;
    @Basic(optional = false)
    @Column(name = "b2r2s1")
    private String b2r2s1;
    @Basic(optional = false)
    @Column(name = "b2r2s2")
    private String b2r2s2;
    @Basic(optional = false)
    @Column(name = "b2r3s1")
    @Temporal(TemporalType.DATE)
    private Date b2r3s1;
    @Basic(optional = false)
    @Column(name = "b2r3s2")
    @Temporal(TemporalType.DATE)
    private Date b2r3s2;
    @Basic(optional = false)
    @Column(name = "b2r5")
    private String b2r5;
    @Id
    @Basic(optional = false)
    @Column(name = "NKS")
    private String nks;
    @JoinColumn(name = "NKS_B1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private B1 nksB1;

    public B2() {
    }

    public B2(String nks) {
        this.nks = nks;
    }

    public B2(String nks, String b2r1s1, String b2r1s2, String b2r2s1, String b2r2s2, Date b2r3s1, Date b2r3s2, String b2r5) {
        this.nks = nks;
        this.b2r1s1 = b2r1s1;
        this.b2r1s2 = b2r1s2;
        this.b2r2s1 = b2r2s1;
        this.b2r2s2 = b2r2s2;
        this.b2r3s1 = b2r3s1;
        this.b2r3s2 = b2r3s2;
        this.b2r5 = b2r5;
    }

    public String getB2r1s1() {
        return b2r1s1;
    }

    public void setB2r1s1(String b2r1s1) {
        this.b2r1s1 = b2r1s1;
    }

    public String getB2r1s2() {
        return b2r1s2;
    }

    public void setB2r1s2(String b2r1s2) {
        this.b2r1s2 = b2r1s2;
    }

    public String getB2r2s1() {
        return b2r2s1;
    }

    public void setB2r2s1(String b2r2s1) {
        this.b2r2s1 = b2r2s1;
    }

    public String getB2r2s2() {
        return b2r2s2;
    }

    public void setB2r2s2(String b2r2s2) {
        this.b2r2s2 = b2r2s2;
    }

    public Date getB2r3s1() {
        return b2r3s1;
    }

    public void setB2r3s1(Date b2r3s1) {
        this.b2r3s1 = b2r3s1;
    }

    public Date getB2r3s2() {
        return b2r3s2;
    }

    public void setB2r3s2(Date b2r3s2) {
        this.b2r3s2 = b2r3s2;
    }

    public String getB2r5() {
        return b2r5;
    }

    public void setB2r5(String b2r5) {
        this.b2r5 = b2r5;
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
        if (!(object instanceof B2)) {
            return false;
        }
        B2 other = (B2) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.B2[ nks=" + nks + " ]";
    }
    
}
