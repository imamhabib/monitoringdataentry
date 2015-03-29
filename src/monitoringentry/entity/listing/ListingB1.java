/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity.listing;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Habib
 */
@Entity
@Table(name = "listing_b1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListingB1.findAll", query = "SELECT l FROM ListingB1 l")})
public class ListingB1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "b1r1")
    private String b1r1;
    @Basic(optional = false)
    @Column(name = "b1r2")
    private String b1r2;
    @Basic(optional = false)
    @Column(name = "b1r3")
    private String b1r3;
    @Basic(optional = false)
    @Column(name = "b1r4")
    private String b1r4;
    @Basic(optional = false)
    @Column(name = "b1r5")
    private String b1r5;
    @Basic(optional = false)
    @Lob
    @Column(name = "b1r6")
    private String b1r6;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @OneToMany(mappedBy = "nksB1")
    private List<ListingB7> listingB7List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<ListingB2> listingB2List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<ListingB5> listingB5List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<ListingB3> listingB3List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<ListingB4> listingB4List;

    public ListingB1() {
    }

    public ListingB1(String nks) {
        this.nks = nks;
    }

    public ListingB1(String nks, String b1r1, String b1r2, String b1r3, String b1r4, String b1r5, String b1r6) {
        this.nks = nks;
        this.b1r1 = b1r1;
        this.b1r2 = b1r2;
        this.b1r3 = b1r3;
        this.b1r4 = b1r4;
        this.b1r5 = b1r5;
        this.b1r6 = b1r6;
    }

    public String getB1r1() {
        return b1r1;
    }

    public void setB1r1(String b1r1) {
        this.b1r1 = b1r1;
    }

    public String getB1r2() {
        return b1r2;
    }

    public void setB1r2(String b1r2) {
        this.b1r2 = b1r2;
    }

    public String getB1r3() {
        return b1r3;
    }

    public void setB1r3(String b1r3) {
        this.b1r3 = b1r3;
    }

    public String getB1r4() {
        return b1r4;
    }

    public void setB1r4(String b1r4) {
        this.b1r4 = b1r4;
    }

    public String getB1r5() {
        return b1r5;
    }

    public void setB1r5(String b1r5) {
        this.b1r5 = b1r5;
    }

    public String getB1r6() {
        return b1r6;
    }

    public void setB1r6(String b1r6) {
        this.b1r6 = b1r6;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    @XmlTransient
    public List<ListingB7> getListingB7List() {
        return listingB7List;
    }

    public void setListingB7List(List<ListingB7> listingB7List) {
        this.listingB7List = listingB7List;
    }

    @XmlTransient
    public List<ListingB2> getListingB2List() {
        return listingB2List;
    }

    public void setListingB2List(List<ListingB2> listingB2List) {
        this.listingB2List = listingB2List;
    }

    @XmlTransient
    public List<ListingB5> getListingB5List() {
        return listingB5List;
    }

    public void setListingB5List(List<ListingB5> listingB5List) {
        this.listingB5List = listingB5List;
    }

    @XmlTransient
    public List<ListingB3> getListingB3List() {
        return listingB3List;
    }

    public void setListingB3List(List<ListingB3> listingB3List) {
        this.listingB3List = listingB3List;
    }

    @XmlTransient
    public List<ListingB4> getListingB4List() {
        return listingB4List;
    }

    public void setListingB4List(List<ListingB4> listingB4List) {
        this.listingB4List = listingB4List;
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
        if (!(object instanceof ListingB1)) {
            return false;
        }
        ListingB1 other = (ListingB1) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.listing.ListingB1[ nks=" + nks + " ]";
    }
    
}
