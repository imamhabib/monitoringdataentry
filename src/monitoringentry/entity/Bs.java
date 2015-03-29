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
@Table(name = "bs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bs.findAll", query = "SELECT b FROM Bs b")})
public class Bs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KODEBS")
    private String kodebs;
    @Column(name = "KODEDESA")
    private String kodedesa;
    @Column(name = "KODETIM")
    private String kodetim;
    @Column(name = "NBS")
    private String nbs;

    public Bs() {
    }

    public Bs(String kodebs) {
        this.kodebs = kodebs;
    }

    public String getKodebs() {
        return kodebs;
    }

    public void setKodebs(String kodebs) {
        this.kodebs = kodebs;
    }

    public String getKodedesa() {
        return kodedesa;
    }

    public void setKodedesa(String kodedesa) {
        this.kodedesa = kodedesa;
    }

    public String getKodetim() {
        return kodetim;
    }

    public void setKodetim(String kodetim) {
        this.kodetim = kodetim;
    }

    public String getNbs() {
        return nbs;
    }

    public void setNbs(String nbs) {
        this.nbs = nbs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodebs != null ? kodebs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bs)) {
            return false;
        }
        Bs other = (Bs) object;
        if ((this.kodebs == null && other.kodebs != null) || (this.kodebs != null && !this.kodebs.equals(other.kodebs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return kodebs;
    }
    
}
