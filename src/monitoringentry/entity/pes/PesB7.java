/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity.pes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "pes_b7")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PesB7.findAll", query = "SELECT p FROM PesB7 p")})
public class PesB7 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @Lob
    @Column(name = "catatan")
    private String catatan;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne
    private PesB1 nksB1;

    public PesB7() {
    }

    public PesB7(String nks) {
        this.nks = nks;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
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
        if (!(object instanceof PesB7)) {
            return false;
        }
        PesB7 other = (PesB7) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.pes.PesB7[ nks=" + nks + " ]";
    }
    
}
