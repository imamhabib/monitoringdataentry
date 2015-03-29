/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity.pes;

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
@Table(name = "pes_b3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PesB3.findAll", query = "SELECT p FROM PesB3 p")})
public class PesB3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "b3r1s1")
    private String b3r1s1;
    @Basic(optional = false)
    @Column(name = "b3r1s2")
    private String b3r1s2;
    @Basic(optional = false)
    @Column(name = "b3r2s1")
    private String b3r2s1;
    @Basic(optional = false)
    @Column(name = "b3r2s2")
    private String b3r2s2;
    @Basic(optional = false)
    @Column(name = "b3r3s1")
    @Temporal(TemporalType.DATE)
    private Date b3r3s1;
    @Basic(optional = false)
    @Column(name = "b3r3s2")
    @Temporal(TemporalType.DATE)
    private Date b3r3s2;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private PesB1 nksB1;

    public PesB3() {
    }

    public PesB3(String nks) {
        this.nks = nks;
    }

    public PesB3(String nks, String b3r1s1, String b3r1s2, String b3r2s1, String b3r2s2, Date b3r3s1, Date b3r3s2) {
        this.nks = nks;
        this.b3r1s1 = b3r1s1;
        this.b3r1s2 = b3r1s2;
        this.b3r2s1 = b3r2s1;
        this.b3r2s2 = b3r2s2;
        this.b3r3s1 = b3r3s1;
        this.b3r3s2 = b3r3s2;
    }

    public String getB3r1s1() {
        return b3r1s1;
    }

    public void setB3r1s1(String b3r1s1) {
        this.b3r1s1 = b3r1s1;
    }

    public String getB3r1s2() {
        return b3r1s2;
    }

    public void setB3r1s2(String b3r1s2) {
        this.b3r1s2 = b3r1s2;
    }

    public String getB3r2s1() {
        return b3r2s1;
    }

    public void setB3r2s1(String b3r2s1) {
        this.b3r2s1 = b3r2s1;
    }

    public String getB3r2s2() {
        return b3r2s2;
    }

    public void setB3r2s2(String b3r2s2) {
        this.b3r2s2 = b3r2s2;
    }

    public Date getB3r3s1() {
        return b3r3s1;
    }

    public void setB3r3s1(Date b3r3s1) {
        this.b3r3s1 = b3r3s1;
    }

    public Date getB3r3s2() {
        return b3r3s2;
    }

    public void setB3r3s2(Date b3r3s2) {
        this.b3r3s2 = b3r3s2;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    public PesB1 getNksB1() {
        return nksB1;
    }

    public void setNksB1(PesB1 nksB1) {
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
        if (!(object instanceof PesB3)) {
            return false;
        }
        PesB3 other = (PesB3) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.pes.PesB3[ nks=" + nks + " ]";
    }
    
}
