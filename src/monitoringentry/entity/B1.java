/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity;

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
@Table(name = "b1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B1.findAll", query = "SELECT b FROM B1 b")})
public class B1 implements Serializable {

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
    @Column(name = "b1r6")
    private String b1r6;
    @Basic(optional = false)
    @Column(name = "b1r7")
    private String b1r7;
    @Basic(optional = false)
    @Column(name = "b1r8")
    private String b1r8;
    @Basic(optional = false)
    @Column(name = "b1r9")
    private String b1r9;
    @Basic(optional = false)
    @Column(name = "b1r10")
    private String b1r10;
    @Basic(optional = false)
    @Column(name = "b1r11")
    private String b1r11;
    @Basic(optional = false)
    @Lob
    @Column(name = "b1r12")
    private String b1r12;
    @Column(name = "b1r13")
    private String b1r13;
    @Column(name = "cleanFlag")
    private Boolean cleanFlag;
    @Column(name ="lockFlag")
    private Boolean lockFlag;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<B2> b2List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<B3> b3List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<B4> b4List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<B5> b5List;
    @OneToMany(mappedBy = "nksB1")
    private List<B6> b6List;

    public B1() {
    }

    public B1(String nks) {
        this.nks = nks;
    }

    public B1(String nks, String b1r1, String b1r2, String b1r3, String b1r4, String b1r5, String b1r6, String b1r7, String b1r8, String b1r9, String b1r10, String b1r11, String b1r12) {
        this.nks = nks;
        this.b1r1 = b1r1;
        this.b1r2 = b1r2;
        this.b1r3 = b1r3;
        this.b1r4 = b1r4;
        this.b1r5 = b1r5;
        this.b1r6 = b1r6;
        this.b1r7 = b1r7;
        this.b1r8 = b1r8;
        this.b1r9 = b1r9;
        this.b1r10 = b1r10;
        this.b1r11 = b1r11;
        this.b1r12 = b1r12;
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

    public String getB1r7() {
        return b1r7;
    }

    public void setB1r7(String b1r7) {
        this.b1r7 = b1r7;
    }

    public String getB1r8() {
        return b1r8;
    }

    public void setB1r8(String b1r8) {
        this.b1r8 = b1r8;
    }

    public String getB1r9() {
        return b1r9;
    }

    public void setB1r9(String b1r9) {
        this.b1r9 = b1r9;
    }

    public String getB1r10() {
        return b1r10;
    }

    public void setB1r10(String b1r10) {
        this.b1r10 = b1r10;
    }

    public String getB1r11() {
        return b1r11;
    }

    public void setB1r11(String b1r11) {
        this.b1r11 = b1r11;
    }

    public String getB1r12() {
        return b1r12;
    }

    public void setB1r12(String b1r12) {
        this.b1r12 = b1r12;
    }

    public String getB1r13() {
        return b1r13;
    }

    public void setB1r13(String b1r13) {
        this.b1r13 = b1r13;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    @XmlTransient
    public List<B2> getB2List() {
        return b2List;
    }

    public void setB2List(List<B2> b2List) {
        this.b2List = b2List;
    }

    @XmlTransient
    public List<B3> getB3List() {
        return b3List;
    }

    public void setB3List(List<B3> b3List) {
        this.b3List = b3List;
    }

    @XmlTransient
    public List<B4> getB4List() {
        return b4List;
    }

    public void setB4List(List<B4> b4List) {
        this.b4List = b4List;
    }

    @XmlTransient
    public List<B5> getB5List() {
        return b5List;
    }

    public void setB5List(List<B5> b5List) {
        this.b5List = b5List;
    }

    @XmlTransient
    public List<B6> getB6List() {
        return b6List;
    }

    public void setB6List(List<B6> b6List) {
        this.b6List = b6List;
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
        if (!(object instanceof B1)) {
            return false;
        }
        B1 other = (B1) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.B1[ nks=" + nks + " ]";
    }

    public Boolean getCleanFlag() {
        return cleanFlag;
    }

    public void setCleanFlag(Boolean cleanFlag) {
        this.cleanFlag = cleanFlag;
    }

    
    public Boolean getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Boolean lock) {
        this.lockFlag = lock;
    }

}
