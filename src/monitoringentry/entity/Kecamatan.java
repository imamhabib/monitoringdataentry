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
@Table(name = "kecamatan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kecamatan.findAll", query = "SELECT k FROM Kecamatan k")})
public class Kecamatan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "id_kabupaten")
    private String idKabupaten;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;

    public Kecamatan() {
    }

    public Kecamatan(String id) {
        this.id = id;
    }

    public Kecamatan(String id, String idKabupaten, String nama) {
        this.id = id;
        this.idKabupaten = idKabupaten;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdKabupaten() {
        return idKabupaten;
    }

    public void setIdKabupaten(String idKabupaten) {
        this.idKabupaten = idKabupaten;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
        if (!(object instanceof Kecamatan)) {
            return false;
        }
        Kecamatan other = (Kecamatan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nama+"("+id+")";
    }
    
}
