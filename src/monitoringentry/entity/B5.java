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
@Table(name = "b5")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B5.findAll", query = "SELECT b FROM B5 b")})
public class B5 implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "b5ar1s1")
    private Double b5ar1s1;
    @Column(name = "b5ar1s2")
    private Double b5ar1s2;
    @Column(name = "b5ar1s3")
    private Double b5ar1s3;
    @Column(name = "b5br2s1")
    private String b5br2s1;
    @Column(name = "b5br2s2")
    private String b5br2s2;
    @Column(name = "b5br2s2lainnya")
    private String b5br2s2lainnya;
    @Column(name = "b5br2s3")
    private String b5br2s3;
    @Column(name = "b5br2s4")
    private String b5br2s4;
    @Column(name = "b5br2s4lainnya")
    private String b5br2s4lainnya;
    @Column(name = "b5br2s5")
    private Double b5br2s5;
    @Column(name = "b5br2s6")
    private Double b5br2s6;
    @Column(name = "b5br3s1")
    private String b5br3s1;
    @Column(name = "b5br3s2")
    private String b5br3s2;
    @Column(name = "b5br3s2lainnya")
    private String b5br3s2lainnya;
    @Column(name = "b5br3s3")
    private String b5br3s3;
    @Column(name = "b5br3s4")
    private String b5br3s4;
    @Column(name = "b5br3s4lainnya")
    private String b5br3s4lainnya;
    @Column(name = "b5br3s5")
    private Double b5br3s5;
    @Column(name = "b5br3s6")
    private Double b5br3s6;
    @Column(name = "b5br4s1")
    private String b5br4s1;
    @Column(name = "b5br4s2")
    private String b5br4s2;
    @Column(name = "b5br4s2lainnya")
    private String b5br4s2lainnya;
    @Column(name = "b5br4s3")
    private Double b5br4s3;
    @Column(name = "b5br4s4")
    private Double b5br4s4;
    @Column(name = "b5br5s1")
    private String b5br5s1;
    @Column(name = "b5br5s2")
    private String b5br5s2;
    @Column(name = "b5br5s3")
    private String b5br5s3;
    @Column(name = "b5br5s4")
    private Double b5br5s4;
    @Column(name = "b5br5s5")
    private String b5br5s5;
    @Column(name = "b5br5s6")
    private String b5br5s6;
    @Column(name = "b5br5s6lainnya")
    private String b5br5s6lainnya;
    @Column(name = "b5br6s1")
    private String b5br6s1;
    @Column(name = "b5br6s2")
    private String b5br6s2;
    @Column(name = "b5br6s2lainnya")
    private String b5br6s2lainnya;
    @Column(name = "b5br7s1")
    private String b5br7s1;
    @Column(name = "b5br7s2d1")
    private Integer b5br7s2d1;
    @Column(name = "b5br7s2d2")
    private Integer b5br7s2d2;
    @Column(name = "b5br7s2d3")
    private Integer b5br7s2d3;
    @Column(name = "b5br7s2d4")
    private Integer b5br7s2d4;
    @Column(name = "b5br7s2d5")
    private Integer b5br7s2d5;
    @Column(name = "b5br7s2d5lainnya")
    private String b5br7s2d5lainnya;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private B1 nksB1;

    public B5() {
    }

    public B5(String nks) {
        this.nks = nks;
    }

    public Double getB5ar1s1() {
        return b5ar1s1;
    }

    public void setB5ar1s1(Double b5ar1s1) {
        this.b5ar1s1 = b5ar1s1;
    }

    public Double getB5ar1s2() {
        return b5ar1s2;
    }

    public void setB5ar1s2(Double b5ar1s2) {
        this.b5ar1s2 = b5ar1s2;
    }

    public Double getB5ar1s3() {
        return b5ar1s3;
    }

    public void setB5ar1s3(Double b5ar1s3) {
        this.b5ar1s3 = b5ar1s3;
    }

    public String getB5br2s1() {
        return b5br2s1;
    }

    public void setB5br2s1(String b5br2s1) {
        this.b5br2s1 = b5br2s1;
    }

    public String getB5br2s2() {
        return b5br2s2;
    }

    public void setB5br2s2(String b5br2s2) {
        this.b5br2s2 = b5br2s2;
    }

    public String getB5br2s2lainnya() {
        return b5br2s2lainnya;
    }

    public void setB5br2s2lainnya(String b5br2s2lainnya) {
        this.b5br2s2lainnya = b5br2s2lainnya;
    }

    public String getB5br2s3() {
        return b5br2s3;
    }

    public void setB5br2s3(String b5br2s3) {
        this.b5br2s3 = b5br2s3;
    }

    public String getB5br2s4() {
        return b5br2s4;
    }

    public void setB5br2s4(String b5br2s4) {
        this.b5br2s4 = b5br2s4;
    }

    public String getB5br2s4lainnya() {
        return b5br2s4lainnya;
    }

    public void setB5br2s4lainnya(String b5br2s4lainnya) {
        this.b5br2s4lainnya = b5br2s4lainnya;
    }

    public Double getB5br2s5() {
        return b5br2s5;
    }

    public void setB5br2s5(Double b5br2s5) {
        this.b5br2s5 = b5br2s5;
    }

    public Double getB5br2s6() {
        return b5br2s6;
    }

    public void setB5br2s6(Double b5br2s6) {
        this.b5br2s6 = b5br2s6;
    }

    public String getB5br3s1() {
        return b5br3s1;
    }

    public void setB5br3s1(String b5br3s1) {
        this.b5br3s1 = b5br3s1;
    }

    public String getB5br3s2() {
        return b5br3s2;
    }

    public void setB5br3s2(String b5br3s2) {
        this.b5br3s2 = b5br3s2;
    }

    public String getB5br3s2lainnya() {
        return b5br3s2lainnya;
    }

    public void setB5br3s2lainnya(String b5br3s2lainnya) {
        this.b5br3s2lainnya = b5br3s2lainnya;
    }

    public String getB5br3s3() {
        return b5br3s3;
    }

    public void setB5br3s3(String b5br3s3) {
        this.b5br3s3 = b5br3s3;
    }

    public String getB5br3s4() {
        return b5br3s4;
    }

    public void setB5br3s4(String b5br3s4) {
        this.b5br3s4 = b5br3s4;
    }

    public String getB5br3s4lainnya() {
        return b5br3s4lainnya;
    }

    public void setB5br3s4lainnya(String b5br3s4lainnya) {
        this.b5br3s4lainnya = b5br3s4lainnya;
    }

    public Double getB5br3s5() {
        return b5br3s5;
    }

    public void setB5br3s5(Double b5br3s5) {
        this.b5br3s5 = b5br3s5;
    }

    public Double getB5br3s6() {
        return b5br3s6;
    }

    public void setB5br3s6(Double b5br3s6) {
        this.b5br3s6 = b5br3s6;
    }

    public String getB5br4s1() {
        return b5br4s1;
    }

    public void setB5br4s1(String b5br4s1) {
        this.b5br4s1 = b5br4s1;
    }

    public String getB5br4s2() {
        return b5br4s2;
    }

    public void setB5br4s2(String b5br4s2) {
        this.b5br4s2 = b5br4s2;
    }

    public String getB5br4s2lainnya() {
        return b5br4s2lainnya;
    }

    public void setB5br4s2lainnya(String b5br4s2lainnya) {
        this.b5br4s2lainnya = b5br4s2lainnya;
    }

    public Double getB5br4s3() {
        return b5br4s3;
    }

    public void setB5br4s3(Double b5br4s3) {
        this.b5br4s3 = b5br4s3;
    }

    public Double getB5br4s4() {
        return b5br4s4;
    }

    public void setB5br4s4(Double b5br4s4) {
        this.b5br4s4 = b5br4s4;
    }

    public String getB5br5s1() {
        return b5br5s1;
    }

    public void setB5br5s1(String b5br5s1) {
        this.b5br5s1 = b5br5s1;
    }

    public String getB5br5s2() {
        return b5br5s2;
    }

    public void setB5br5s2(String b5br5s2) {
        this.b5br5s2 = b5br5s2;
    }

    public String getB5br5s3() {
        return b5br5s3;
    }

    public void setB5br5s3(String b5br5s3) {
        this.b5br5s3 = b5br5s3;
    }

    public Double getB5br5s4() {
        return b5br5s4;
    }

    public void setB5br5s4(Double b5br5s4) {
        this.b5br5s4 = b5br5s4;
    }

    public String getB5br5s5() {
        return b5br5s5;
    }

    public void setB5br5s5(String b5br5s5) {
        this.b5br5s5 = b5br5s5;
    }

    public String getB5br5s6() {
        return b5br5s6;
    }

    public void setB5br5s6(String b5br5s6) {
        this.b5br5s6 = b5br5s6;
    }

    public String getB5br5s6lainnya() {
        return b5br5s6lainnya;
    }

    public void setB5br5s6lainnya(String b5br5s6lainnya) {
        this.b5br5s6lainnya = b5br5s6lainnya;
    }

    public String getB5br6s1() {
        return b5br6s1;
    }

    public void setB5br6s1(String b5br6s1) {
        this.b5br6s1 = b5br6s1;
    }

    public String getB5br6s2() {
        return b5br6s2;
    }

    public void setB5br6s2(String b5br6s2) {
        this.b5br6s2 = b5br6s2;
    }

    public String getB5br6s2lainnya() {
        return b5br6s2lainnya;
    }

    public void setB5br6s2lainnya(String b5br6s2lainnya) {
        this.b5br6s2lainnya = b5br6s2lainnya;
    }

    public String getB5br7s1() {
        return b5br7s1;
    }

    public void setB5br7s1(String b5br7s1) {
        this.b5br7s1 = b5br7s1;
    }

    public Integer getB5br7s2d1() {
        return b5br7s2d1;
    }

    public void setB5br7s2d1(Integer b5br7s2d1) {
        this.b5br7s2d1 = b5br7s2d1;
    }

    public Integer getB5br7s2d2() {
        return b5br7s2d2;
    }

    public void setB5br7s2d2(Integer b5br7s2d2) {
        this.b5br7s2d2 = b5br7s2d2;
    }

    public Integer getB5br7s2d3() {
        return b5br7s2d3;
    }

    public void setB5br7s2d3(Integer b5br7s2d3) {
        this.b5br7s2d3 = b5br7s2d3;
    }

    public Integer getB5br7s2d4() {
        return b5br7s2d4;
    }

    public void setB5br7s2d4(Integer b5br7s2d4) {
        this.b5br7s2d4 = b5br7s2d4;
    }

    public Integer getB5br7s2d5() {
        return b5br7s2d5;
    }

    public void setB5br7s2d5(Integer b5br7s2d5) {
        this.b5br7s2d5 = b5br7s2d5;
    }

    public String getB5br7s2d5lainnya() {
        return b5br7s2d5lainnya;
    }

    public void setB5br7s2d5lainnya(String b5br7s2d5lainnya) {
        this.b5br7s2d5lainnya = b5br7s2d5lainnya;
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
        if (!(object instanceof B5)) {
            return false;
        }
        B5 other = (B5) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.B5[ nks=" + nks + " ]";
    }
    
}
