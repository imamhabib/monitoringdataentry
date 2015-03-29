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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Habib
 */
@Entity
@Table(name = "errorlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Errorlist.findAll", query = "SELECT e FROM Errorlist e")})
public class Errorlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nks_b1")
    private String nksB1;
    @Lob
    @Column(name = "error")
    private String error;
    @Lob
    @Column(name = "perlakuan")
    private String perlakuan;

    public Errorlist() {
    }

    public Errorlist(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNksB1() {
        return nksB1;
    }

    public void setNksB1(String nksB1) {
        this.nksB1 = nksB1;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPerlakuan() {
        return perlakuan;
    }

    public void setPerlakuan(String perlakuan) {
        this.perlakuan = perlakuan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Errorlist)) {
            return false;
        }
        Errorlist other = (Errorlist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "monitoringentry.entity.Errorlist[ id=" + id + " ]";
    }
    
}
