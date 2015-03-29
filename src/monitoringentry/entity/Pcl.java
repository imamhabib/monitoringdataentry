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
@Table(name = "pcl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pcl.findAll", query = "SELECT p FROM Pcl p")})
public class Pcl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "KODEPCL")
    private String kodepcl;
    @Column(name = "NAMA")
    private String nama;
    @Column(name = "KODETIM")
    private String kodetim;
    @Column(name = "KODEKORTIM")
    private String kodekortim;
    @Basic(optional = false)
    @Column(name = "CAPI")
    private boolean capi;
    @Id
    @Basic(optional = false)
    @Column(name = "NIM")
    private String nim;

    public Pcl() {
    }

    public Pcl(String nim) {
        this.nim = nim;
    }

    public Pcl(String nim, String kodepcl, boolean capi) {
        this.nim = nim;
        this.kodepcl = kodepcl;
        this.capi = capi;
    }

    public String getKodepcl() {
        return kodepcl;
    }

    public void setKodepcl(String kodepcl) {
        this.kodepcl = kodepcl;
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

    public String getKodekortim() {
        return kodekortim;
    }

    public void setKodekortim(String kodekortim) {
        this.kodekortim = kodekortim;
    }

    public boolean getCapi() {
        return capi;
    }

    public void setCapi(boolean capi) {
        this.capi = capi;
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
        if (!(object instanceof Pcl)) {
            return false;
        }
        Pcl other = (Pcl) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.Pcl[ nim=" + nim + " ]";
    }
    
}
