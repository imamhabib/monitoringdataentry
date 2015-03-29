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
@Table(name = "listing_b4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListingB4.findAll", query = "SELECT l FROM ListingB4 l")})
public class ListingB4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "b4r1")
    private String b4r1;
    @Basic(optional = false)
    @Lob
    @Column(name = "b4r2")
    private String b4r2;
    @Basic(optional = false)
    @Column(name = "b4r3")
    private int b4r3;
    @Basic(optional = false)
    @Column(name = "b4r4")
    private int b4r4;
    @Basic(optional = false)
    @Column(name = "b4r5")
    private int b4r5;
    @Basic(optional = false)
    @Column(name = "b4r6")
    private int b4r6;
    @Basic(optional = false)
    @Column(name = "b4r7")
    private int b4r7;
    @Basic(optional = false)
    @Column(name = "b4r8")
    private String b4r8;
    @Basic(optional = false)
    @Column(name = "b4r9")
    private String b4r9;
    @Basic(optional = false)
    @Column(name = "b4r10")
    private String b4r10;
    @Basic(optional = false)
    @Column(name = "b4r11")
    private int b4r11;
    @Basic(optional = false)
    @Column(name = "b4r12")
    private String b4r12;
    @Column(name = "b4r13")
    private String b4r13;
    @Column(name = "b4r14")
    private String b4r14;
    @Column(name = "b4r15")
    private String b4r15;
    @Column(name = "b4r16")
    private String b4r16;
    @Column(name = "b4r17")
    private String b4r17;
    @Column(name = "b4r18")
    private String b4r18;
    @Column(name = "b4r19")
    private String b4r19;
    @Column(name = "b4r20")
    private String b4r20;
    @Column(name = "b4r21")
    private String b4r21;
    @Column(name = "b4r22")
    private String b4r22;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private ListingB1 nksB1;

    public ListingB4() {
    }

    public ListingB4(String nks) {
        this.nks = nks;
    }

    public ListingB4(String nks, String b4r1, String b4r2, int b4r3, int b4r4, int b4r5, int b4r6, int b4r7, String b4r8, String b4r9, String b4r10, int b4r11, String b4r12) {
        this.nks = nks;
        this.b4r1 = b4r1;
        this.b4r2 = b4r2;
        this.b4r3 = b4r3;
        this.b4r4 = b4r4;
        this.b4r5 = b4r5;
        this.b4r6 = b4r6;
        this.b4r7 = b4r7;
        this.b4r8 = b4r8;
        this.b4r9 = b4r9;
        this.b4r10 = b4r10;
        this.b4r11 = b4r11;
        this.b4r12 = b4r12;
    }

    public String getB4r1() {
        return b4r1;
    }

    public void setB4r1(String b4r1) {
        this.b4r1 = b4r1;
    }

    public String getB4r2() {
        return b4r2;
    }

    public void setB4r2(String b4r2) {
        this.b4r2 = b4r2;
    }

    public int getB4r3() {
        return b4r3;
    }

    public void setB4r3(int b4r3) {
        this.b4r3 = b4r3;
    }

    public int getB4r4() {
        return b4r4;
    }

    public void setB4r4(int b4r4) {
        this.b4r4 = b4r4;
    }

    public int getB4r5() {
        return b4r5;
    }

    public void setB4r5(int b4r5) {
        this.b4r5 = b4r5;
    }

    public int getB4r6() {
        return b4r6;
    }

    public void setB4r6(int b4r6) {
        this.b4r6 = b4r6;
    }

    public int getB4r7() {
        return b4r7;
    }

    public void setB4r7(int b4r7) {
        this.b4r7 = b4r7;
    }

    public String getB4r8() {
        return b4r8;
    }

    public void setB4r8(String b4r8) {
        this.b4r8 = b4r8;
    }

    public String getB4r9() {
        return b4r9;
    }

    public void setB4r9(String b4r9) {
        this.b4r9 = b4r9;
    }

    public String getB4r10() {
        return b4r10;
    }

    public void setB4r10(String b4r10) {
        this.b4r10 = b4r10;
    }

    public int getB4r11() {
        return b4r11;
    }

    public void setB4r11(int b4r11) {
        this.b4r11 = b4r11;
    }

    public String getB4r12() {
        return b4r12;
    }

    public void setB4r12(String b4r12) {
        this.b4r12 = b4r12;
    }

    public String getB4r13() {
        return b4r13;
    }

    public void setB4r13(String b4r13) {
        this.b4r13 = b4r13;
    }

    public String getB4r14() {
        return b4r14;
    }

    public void setB4r14(String b4r14) {
        this.b4r14 = b4r14;
    }

    public String getB4r15() {
        return b4r15;
    }

    public void setB4r15(String b4r15) {
        this.b4r15 = b4r15;
    }

    public String getB4r16() {
        return b4r16;
    }

    public void setB4r16(String b4r16) {
        this.b4r16 = b4r16;
    }

    public String getB4r17() {
        return b4r17;
    }

    public void setB4r17(String b4r17) {
        this.b4r17 = b4r17;
    }

    public String getB4r18() {
        return b4r18;
    }

    public void setB4r18(String b4r18) {
        this.b4r18 = b4r18;
    }

    public String getB4r19() {
        return b4r19;
    }

    public void setB4r19(String b4r19) {
        this.b4r19 = b4r19;
    }

    public String getB4r20() {
        return b4r20;
    }

    public void setB4r20(String b4r20) {
        this.b4r20 = b4r20;
    }

    public String getB4r21() {
        return b4r21;
    }

    public void setB4r21(String b4r21) {
        this.b4r21 = b4r21;
    }

    public String getB4r22() {
        return b4r22;
    }

    public void setB4r22(String b4r22) {
        this.b4r22 = b4r22;
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
        if (!(object instanceof ListingB4)) {
            return false;
        }
        ListingB4 other = (ListingB4) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.listing.ListingB4[ nks=" + nks + " ]";
    }
    
}
