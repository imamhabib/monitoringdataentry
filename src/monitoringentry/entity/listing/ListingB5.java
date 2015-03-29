/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity.listing;

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
@Table(name = "listing_b5")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListingB5.findAll", query = "SELECT l FROM ListingB5 l")})
public class ListingB5 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "b5ar1")
    private String b5ar1;
    @Basic(optional = false)
    @Column(name = "b5ar2s1")
    private String b5ar2s1;
    @Basic(optional = false)
    @Column(name = "b5ar2s2")
    @Temporal(TemporalType.DATE)
    private Date b5ar2s2;
    @Basic(optional = false)
    @Column(name = "b5br1s1")
    private int b5br1s1;
    @Basic(optional = false)
    @Column(name = "b5br1s2")
    private int b5br1s2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "b5br1s3")
    private Double b5br1s3;
    @Column(name = "b5br2s1")
    private Integer b5br2s1;
    @Column(name = "b5br2s2")
    private Integer b5br2s2;
    @Column(name = "b5br2s3")
    private Integer b5br2s3;
    @Column(name = "b5br2s4")
    private Integer b5br2s4;
    @Column(name = "b5br2s5")
    private Integer b5br2s5;
    @Column(name = "b5br2s6")
    private Integer b5br2s6;
    @Column(name = "b5br2s7")
    private Integer b5br2s7;
    @Column(name = "b5br2s8")
    private Integer b5br2s8;
    @Column(name = "b5br2s9")
    private Integer b5br2s9;
    @Column(name = "b5br2s10")
    private Integer b5br2s10;
    @Column(name = "b5br2s11")
    private Integer b5br2s11;
    @Column(name = "b5br2s12")
    private Integer b5br2s12;
    @Column(name = "b5br2s13")
    private Integer b5br2s13;
    @Column(name = "b5br2s14")
    private Integer b5br2s14;
    @Column(name = "b5br2s15")
    private Integer b5br2s15;
    @Column(name = "b5br2s16")
    private Integer b5br2s16;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private ListingB1 nksB1;

    public ListingB5() {
    }

    public ListingB5(String nks) {
        this.nks = nks;
    }

    public ListingB5(String nks, String b5ar1, String b5ar2s1, Date b5ar2s2, int b5br1s1, int b5br1s2) {
        this.nks = nks;
        this.b5ar1 = b5ar1;
        this.b5ar2s1 = b5ar2s1;
        this.b5ar2s2 = b5ar2s2;
        this.b5br1s1 = b5br1s1;
        this.b5br1s2 = b5br1s2;
    }

    public String getB5ar1() {
        return b5ar1;
    }

    public void setB5ar1(String b5ar1) {
        this.b5ar1 = b5ar1;
    }

    public String getB5ar2s1() {
        return b5ar2s1;
    }

    public void setB5ar2s1(String b5ar2s1) {
        this.b5ar2s1 = b5ar2s1;
    }

    public Date getB5ar2s2() {
        return b5ar2s2;
    }

    public void setB5ar2s2(Date b5ar2s2) {
        this.b5ar2s2 = b5ar2s2;
    }

    public int getB5br1s1() {
        return b5br1s1;
    }

    public void setB5br1s1(int b5br1s1) {
        this.b5br1s1 = b5br1s1;
    }

    public int getB5br1s2() {
        return b5br1s2;
    }

    public void setB5br1s2(int b5br1s2) {
        this.b5br1s2 = b5br1s2;
    }

    public Double getB5br1s3() {
        return b5br1s3;
    }

    public void setB5br1s3(Double b5br1s3) {
        this.b5br1s3 = b5br1s3;
    }

    public Integer getB5br2s1() {
        return b5br2s1;
    }

    public void setB5br2s1(Integer b5br2s1) {
        this.b5br2s1 = b5br2s1;
    }

    public Integer getB5br2s2() {
        return b5br2s2;
    }

    public void setB5br2s2(Integer b5br2s2) {
        this.b5br2s2 = b5br2s2;
    }

    public Integer getB5br2s3() {
        return b5br2s3;
    }

    public void setB5br2s3(Integer b5br2s3) {
        this.b5br2s3 = b5br2s3;
    }

    public Integer getB5br2s4() {
        return b5br2s4;
    }

    public void setB5br2s4(Integer b5br2s4) {
        this.b5br2s4 = b5br2s4;
    }

    public Integer getB5br2s5() {
        return b5br2s5;
    }

    public void setB5br2s5(Integer b5br2s5) {
        this.b5br2s5 = b5br2s5;
    }

    public Integer getB5br2s6() {
        return b5br2s6;
    }

    public void setB5br2s6(Integer b5br2s6) {
        this.b5br2s6 = b5br2s6;
    }

    public Integer getB5br2s7() {
        return b5br2s7;
    }

    public void setB5br2s7(Integer b5br2s7) {
        this.b5br2s7 = b5br2s7;
    }

    public Integer getB5br2s8() {
        return b5br2s8;
    }

    public void setB5br2s8(Integer b5br2s8) {
        this.b5br2s8 = b5br2s8;
    }

    public Integer getB5br2s9() {
        return b5br2s9;
    }

    public void setB5br2s9(Integer b5br2s9) {
        this.b5br2s9 = b5br2s9;
    }

    public Integer getB5br2s10() {
        return b5br2s10;
    }

    public void setB5br2s10(Integer b5br2s10) {
        this.b5br2s10 = b5br2s10;
    }

    public Integer getB5br2s11() {
        return b5br2s11;
    }

    public void setB5br2s11(Integer b5br2s11) {
        this.b5br2s11 = b5br2s11;
    }

    public Integer getB5br2s12() {
        return b5br2s12;
    }

    public void setB5br2s12(Integer b5br2s12) {
        this.b5br2s12 = b5br2s12;
    }

    public Integer getB5br2s13() {
        return b5br2s13;
    }

    public void setB5br2s13(Integer b5br2s13) {
        this.b5br2s13 = b5br2s13;
    }

    public Integer getB5br2s14() {
        return b5br2s14;
    }

    public void setB5br2s14(Integer b5br2s14) {
        this.b5br2s14 = b5br2s14;
    }

    public Integer getB5br2s15() {
        return b5br2s15;
    }

    public void setB5br2s15(Integer b5br2s15) {
        this.b5br2s15 = b5br2s15;
    }

    public Integer getB5br2s16() {
        return b5br2s16;
    }

    public void setB5br2s16(Integer b5br2s16) {
        this.b5br2s16 = b5br2s16;
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
        if (!(object instanceof ListingB5)) {
            return false;
        }
        ListingB5 other = (ListingB5) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.listing.ListingB5[ nks=" + nks + " ]";
    }
    
}
