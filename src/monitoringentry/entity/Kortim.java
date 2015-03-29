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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Habib
 */
@Entity
@Table(name = "kortim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kortim.findAll", query = "SELECT k FROM Kortim k")})
public class Kortim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "KODEKORTIM")
    private String kodekortim;
    @Column(name = "NAMA")
    private String nama;
    @Column(name = "KODETIM")
    private String kodetim;
    @Column(name = "KODEKORWIL")
    private String kodekorwil;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;

    public Kortim() {
    }

    public Kortim(String nim) {
        this.nim = nim;
    }

    public Kortim(String nim, String kodekortim) {
        this.nim = nim;
        this.kodekortim = kodekortim;
    }

    public String getKodekortim() {
        return kodekortim;
    }

    public void setKodekortim(String kodekortim) {
        this.kodekortim = kodekortim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodetim() {
        return kodetim;
    }

    public void setKodetim(String kodetim) {
        this.kodetim = kodetim;
    }

    public String getKodekorwil() {
        return kodekorwil;
    }

    public void setKodekorwil(String kodekorwil) {
        this.kodekorwil = kodekorwil;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kortim)) {
            return false;
        }
        Kortim other = (Kortim) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.Kortim[ nim=" + nim + " ]";
    }
    
}
