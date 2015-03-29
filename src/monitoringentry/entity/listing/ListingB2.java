/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity.listing;

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
@Table(name = "listing_b2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListingB2.findAll", query = "SELECT l FROM ListingB2 l")})
public class ListingB2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "b2r1")
    private int b2r1;
    @Basic(optional = false)
    @Column(name = "b2r2")
    private int b2r2;
    @Basic(optional = false)
    @Column(name = "b2r3")
    private int b2r3;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private ListingB1 nksB1;

    public ListingB2() {
    }

    public ListingB2(String nks) {
        this.nks = nks;
    }

    public ListingB2(String nks, int b2r1, int b2r2, int b2r3) {
        this.nks = nks;
        this.b2r1 = b2r1;
        this.b2r2 = b2r2;
        this.b2r3 = b2r3;
    }

    public int getB2r1() {
        return b2r1;
    }

    public void setB2r1(int b2r1) {
        this.b2r1 = b2r1;
    }

    public int getB2r2() {
        return b2r2;
    }

    public void setB2r2(int b2r2) {
        this.b2r2 = b2r2;
    }

    public int getB2r3() {
        return b2r3;
    }

    public void setB2r3(int b2r3) {
        this.b2r3 = b2r3;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    public ListingB1 getNksB1() {
        return nksB1;
    }

    public void setNksB1(ListingB1 nksB1) {
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
        if (!(object instanceof ListingB2)) {
            return false;
        }
        ListingB2 other = (ListingB2) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.listing.ListingB2[ nks=" + nks + " ]";
    }
    
}
