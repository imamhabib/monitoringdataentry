/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity.pes;

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
@Table(name = "pes_b1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PesB1.findAll", query = "SELECT p FROM PesB1 p")})
public class PesB1 implements Serializable {
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<PesB4> pesB4List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<PesB3> pesB3List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<PesB2> pesB2List;
    @OneToMany(mappedBy = "nksB1")
    private List<PesB7> pesB7List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nksB1")
    private List<PesB5> pesB5List;

    public PesB1() {
    }

    public PesB1(String nks) {
        this.nks = nks;
    }

    public PesB1(String nks, String b1r1, String b1r2, String b1r3, String b1r4, String b1r5, String b1r6) {
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
    public List<PesB4> getPesB4List() {
        return pesB4List;
    }

    public void setPesB4List(List<PesB4> pesB4List) {
        this.pesB4List = pesB4List;
    }

    @XmlTransient
    public List<PesB3> getPesB3List() {
        return pesB3List;
    }

    public void setPesB3List(List<PesB3> pesB3List) {
        this.pesB3List = pesB3List;
    }

    @XmlTransient
    public List<PesB2> getPesB2List() {
        return pesB2List;
    }

    public void setPesB2List(List<PesB2> pesB2List) {
        this.pesB2List = pesB2List;
    }

    @XmlTransient
    public List<PesB7> getPesB7List() {
        return pesB7List;
    }

    public void setPesB7List(List<PesB7> pesB7List) {
        this.pesB7List = pesB7List;
    }

    @XmlTransient
    public List<PesB5> getPesB5List() {
        return pesB5List;
    }

    public void setPesB5List(List<PesB5> pesB5List) {
        this.pesB5List = pesB5List;
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
        if (!(object instanceof PesB1)) {
            return false;
        }
        PesB1 other = (PesB1) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.pes.PesB1[ nks=" + nks + " ]";
    }
    
}
