/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.entity;

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
@Table(name = "uploaddata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uploaddata.findAll", query = "SELECT u FROM Uploaddata u"),
    @NamedQuery(name = "Uploaddata.findByDate", query = "SELECT u FROM Uploaddata u WHERE u.date = :date"),
    @NamedQuery(name = "Uploaddata.findByTime", query = "SELECT u FROM Uploaddata u WHERE u.time = :time"),
    @NamedQuery(name = "Uploaddata.findByJenisUpload", query = "SELECT u FROM Uploaddata u WHERE u.jenisUpload = :jenisUpload"),
    @NamedQuery(name = "Uploaddata.findByStatus", query = "SELECT u FROM Uploaddata u WHERE u.status = :status"),
    @NamedQuery(name = "Uploaddata.findByDateTime", query = "SELECT u FROM Uploaddata u WHERE u.dateTime = :dateTime")})
public class Uploaddata implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Basic(optional = false)
    @Column(name = "jenisUpload")
    private String jenisUpload;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Id
    @Basic(optional = false)
    @Column(name = "dateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @JoinColumn(name = "nks", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private B1 nks;
    @JoinColumn(name = "nim", referencedColumnName = "nim")
    @ManyToOne(optional = false)
    private Mahasiswa nim;

    public Uploaddata() {
    }

    public Uploaddata(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Uploaddata(Date dateTime, Date date, Date time, String jenisUpload, String status) {
        this.dateTime = dateTime;
        this.date = date;
        this.time = time;
        this.jenisUpload = jenisUpload;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getJenisUpload() {
        return jenisUpload;
    }

    public void setJenisUpload(String jenisUpload) {
        this.jenisUpload = jenisUpload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public B1 getNks() {
        return nks;
    }

    public void setNks(B1 nks) {
        this.nks = nks;
    }

    public Mahasiswa getNim() {
        return nim;
    }

    public void setNim(Mahasiswa nim) {
        this.nim = nim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dateTime != null ? dateTime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uploaddata)) {
            return false;
        }
        Uploaddata other = (Uploaddata) object;
        if ((this.dateTime == null && other.dateTime != null) || (this.dateTime != null && !this.dateTime.equals(other.dateTime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.Uploaddata[ dateTime=" + dateTime + " ]";
    }
    
}
