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
@Table(name = "b4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B4.findAll", query = "SELECT b FROM B4 b")})
public class B4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "b4ar1s1")
    private Integer b4ar1s1;
    @Column(name = "b4ar1s2")
    private String b4ar1s2;
    @Column(name = "b4ar1s3")
    private String b4ar1s3;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "b4ar2s1")
    private Double b4ar2s1;
    @Column(name = "b4ar2s2")
    private Double b4ar2s2;
    @Column(name = "b4ar3")
    private Double b4ar3;
    @Column(name = "b4ar4")
    private Double b4ar4;
    @Column(name = "b4ar5")
    private String b4ar5;
    @Column(name = "b4ar5lainnya")
    private String b4ar5lainnya;
    @Column(name = "b4ar6")
    private String b4ar6;
    @Column(name = "b4ar7")
    private Integer b4ar7;
    @Column(name = "b4ar8s1")
    private Integer b4ar8s1;
    @Column(name = "b4ar8s2")
    private Integer b4ar8s2;
    @Column(name = "b4br9s1d1t1")
    private Integer b4br9s1d1t1;
    @Column(name = "b4br9s1d1t2")
    private Integer b4br9s1d1t2;
    @Column(name = "b4br9s1d1t3")
    private Integer b4br9s1d1t3;
    @Column(name = "b4br9s1d2")
    private Integer b4br9s1d2;
    @Column(name = "b4br9s1d3")
    private Integer b4br9s1d3;
    @Column(name = "b4br9s2d1t1")
    private Integer b4br9s2d1t1;
    @Column(name = "b4br9s2d1t2")
    private Integer b4br9s2d1t2;
    @Column(name = "b4br9s2d1t3")
    private Integer b4br9s2d1t3;
    @Column(name = "b4br9s2d2")
    private Integer b4br9s2d2;
    @Column(name = "b4br9s2d3")
    private Integer b4br9s2d3;
    @Column(name = "b4br9s3d1t1")
    private Integer b4br9s3d1t1;
    @Column(name = "b4br9s3d1t2")
    private Integer b4br9s3d1t2;
    @Column(name = "b4br9s3d1t3")
    private Integer b4br9s3d1t3;
    @Column(name = "b4br9s3d2")
    private Integer b4br9s3d2;
    @Column(name = "b4br9s3d3")
    private Integer b4br9s3d3;
    @Column(name = "b4br9s4d1t1")
    private Integer b4br9s4d1t1;
    @Column(name = "b4br9s4d1t2")
    private Integer b4br9s4d1t2;
    @Column(name = "b4br9s4d1t3")
    private Integer b4br9s4d1t3;
    @Column(name = "b4br9s4d2")
    private Integer b4br9s4d2;
    @Column(name = "b4br9s4d3")
    private Integer b4br9s4d3;
    @Column(name = "b4br9s5d1t1")
    private Integer b4br9s5d1t1;
    @Column(name = "b4br9s5d1t2")
    private Integer b4br9s5d1t2;
    @Column(name = "b4br9s5d1t3")
    private Integer b4br9s5d1t3;
    @Column(name = "b4br9s5d2")
    private Integer b4br9s5d2;
    @Column(name = "b4br9s5d3")
    private Integer b4br9s5d3;
    @Column(name = "b4br9s6d1t1")
    private Integer b4br9s6d1t1;
    @Column(name = "b4br9s6d1t2")
    private Integer b4br9s6d1t2;
    @Column(name = "b4br9s6d1t3")
    private Integer b4br9s6d1t3;
    @Column(name = "b4br9s6d2")
    private Integer b4br9s6d2;
    @Column(name = "b4br9s6d3")
    private Integer b4br9s6d3;
    @Column(name = "b4br9s7d1t1")
    private Integer b4br9s7d1t1;
    @Column(name = "b4br9s7d1t2")
    private Integer b4br9s7d1t2;
    @Column(name = "b4br9s7d1t3")
    private Integer b4br9s7d1t3;
    @Column(name = "b4br9s7d2")
    private Integer b4br9s7d2;
    @Column(name = "b4br9s7d3")
    private Integer b4br9s7d3;
    @Column(name = "b4br9s8d1t1")
    private Integer b4br9s8d1t1;
    @Column(name = "b4br9s8d1t2")
    private Integer b4br9s8d1t2;
    @Column(name = "b4br9s8d1t3")
    private Integer b4br9s8d1t3;
    @Column(name = "b4br9s8d2")
    private Integer b4br9s8d2;
    @Column(name = "b4br9s8d3")
    private Integer b4br9s8d3;
    @Column(name = "b4br9s9d1t1")
    private Integer b4br9s9d1t1;
    @Column(name = "b4br9s9d1t2")
    private Integer b4br9s9d1t2;
    @Column(name = "b4br9s9d1t3")
    private Integer b4br9s9d1t3;
    @Column(name = "b4br9s9d2")
    private Integer b4br9s9d2;
    @Column(name = "b4br9s9d3")
    private Integer b4br9s9d3;
    @Column(name = "b4br9s10d1t1")
    private Integer b4br9s10d1t1;
    @Column(name = "b4br9s10d1t2")
    private Integer b4br9s10d1t2;
    @Column(name = "b4br9s10d1t3")
    private Integer b4br9s10d1t3;
    @Column(name = "b4br9s10d2")
    private Integer b4br9s10d2;
    @Column(name = "b4br9s10d3")
    private Integer b4br9s10d3;
    @Column(name = "b4br9s10lainnya")
    private String b4br9s10lainnya;
    @Column(name = "b4br10s1")
    private String b4br10s1;
    @Column(name = "b4br10s2")
    private String b4br10s2;
    @Column(name = "b4br10s3")
    private String b4br10s3;
    @Column(name = "b4br10s4")
    private String b4br10s4;
    @Column(name = "b4br10s5")
    private String b4br10s5;
    @Column(name = "b4br10s6")
    private String b4br10s6;
    @Column(name = "b4br10s7")
    private String b4br10s7;
    @Column(name = "b4br10s8")
    private String b4br10s8;
    @Column(name = "b4br10s8lainnya")
    private String b4br10s8lainnya;
    @Column(name = "b4br11s1")
    private String b4br11s1;
    @Column(name = "b4br11s2")
    private Integer b4br11s2;
    @Column(name = "b4cr12")
    private Integer b4cr12;
    @Column(name = "b4cr13s1d1")
    private String b4cr13s1d1;
    @Column(name = "b4cr13s1d2")
    private Double b4cr13s1d2;
    @Column(name = "b4cr13s1d3")
    private Integer b4cr13s1d3;
    @Column(name = "b4cr13s2d1")
    private String b4cr13s2d1;
    @Column(name = "b4cr13s2d2")
    private Double b4cr13s2d2;
    @Column(name = "b4cr13s2d3")
    private Integer b4cr13s2d3;
    @Column(name = "b4cr13s3d1")
    private String b4cr13s3d1;
    @Column(name = "b4cr13s3d2")
    private Double b4cr13s3d2;
    @Column(name = "b4cr13s3d3")
    private Integer b4cr13s3d3;
    @Column(name = "b4cr13s4d1")
    private String b4cr13s4d1;
    @Column(name = "b4cr13s4d2")
    private Double b4cr13s4d2;
    @Column(name = "b4cr13s4d3")
    private Integer b4cr13s4d3;
    @Column(name = "b4cr13s5d1")
    private String b4cr13s5d1;
    @Column(name = "b4cr13s5d2")
    private Double b4cr13s5d2;
    @Column(name = "b4cr13s5d3")
    private Integer b4cr13s5d3;
    @Column(name = "b4cr13s6d2")
    private Double b4cr13s6d2;
    @Column(name = "b4cr13s6d3")
    private Integer b4cr13s6d3;
    @Column(name = "b4cr13s7d2")
    private Double b4cr13s7d2;
    @Column(name = "b4cr13s7d3")
    private Integer b4cr13s7d3;
    @Column(name = "b4dr14")
    private String b4dr14;
    @Column(name = "b4dr15s1")
    private Double b4dr15s1;
    @Column(name = "b4dr15s2")
    private Double b4dr15s2;
    @Column(name = "b4dr15s3")
    private Double b4dr15s3;
    @Column(name = "b4dr15s4")
    private Double b4dr15s4;
    @Column(name = "b4dr15s5")
    private Double b4dr15s5;
    @Column(name = "b4dr15jumlah")
    private Double b4dr15jumlah;
    @Column(name = "b4dr16")
    private String b4dr16;
    @Column(name = "b4dr16lainnya")
    private String b4dr16lainnya;
    @Column(name = "b4dr17s1")
    private String b4dr17s1;
    @Column(name = "b4dr17s2")
    private String b4dr17s2;
    @Column(name = "b4dr17s2lainnya")
    private String b4dr17s2lainnya;
    @Column(name = "b4er18s1d1t1")
    private Integer b4er18s1d1t1;
    @Column(name = "b4er18s1d1t2")
    private Integer b4er18s1d1t2;
    @Column(name = "b4er18s1d2t1")
    private Integer b4er18s1d2t1;
    @Column(name = "b4er18s1d2t2")
    private Integer b4er18s1d2t2;
    @Column(name = "b4er18s2d1t1")
    private Integer b4er18s2d1t1;
    @Column(name = "b4er18s2d1t2")
    private Integer b4er18s2d1t2;
    @Column(name = "b4er18s2d2t1")
    private Integer b4er18s2d2t1;
    @Column(name = "b4er18s2d2t2")
    private Integer b4er18s2d2t2;
    @Column(name = "b4er19as1d1t1")
    private Double b4er19as1d1t1;
    @Column(name = "b4er19as1d1t2")
    private Double b4er19as1d1t2;
    @Column(name = "b4er19as1d1t3")
    private Double b4er19as1d1t3;
    @Column(name = "b4er19as1d2")
    private Integer b4er19as1d2;
    @Column(name = "b4er19as2d1t1")
    private Double b4er19as2d1t1;
    @Column(name = "b4er19as2d1t2")
    private Double b4er19as2d1t2;
    @Column(name = "b4er19as2d1t3")
    private Double b4er19as2d1t3;
    @Column(name = "b4er19as2d2")
    private Integer b4er19as2d2;
    @Column(name = "b4er19as3d1t1")
    private Double b4er19as3d1t1;
    @Column(name = "b4er19as3d1t2")
    private Double b4er19as3d1t2;
    @Column(name = "b4er19as3d1t3")
    private Double b4er19as3d1t3;
    @Column(name = "b4er19as3d2")
    private Integer b4er19as3d2;
    @Column(name = "b4er19as4d1t1")
    private Double b4er19as4d1t1;
    @Column(name = "b4er19as4d1t2")
    private Double b4er19as4d1t2;
    @Column(name = "b4er19as4d1t3")
    private Double b4er19as4d1t3;
    @Column(name = "b4er19as4d2")
    private Integer b4er19as4d2;
    @Column(name = "b4er19as5d1t1")
    private Double b4er19as5d1t1;
    @Column(name = "b4er19as5d1t2")
    private Double b4er19as5d1t2;
    @Column(name = "b4er19as5d1t3")
    private Double b4er19as5d1t3;
    @Column(name = "b4er19as5d2")
    private Integer b4er19as5d2;
    @Column(name = "b4er19as6d1t1")
    private Double b4er19as6d1t1;
    @Column(name = "b4er19as6d1t2")
    private Double b4er19as6d1t2;
    @Column(name = "b4er19as6d1t3")
    private Double b4er19as6d1t3;
    @Column(name = "b4er19as6d2")
    private Integer b4er19as6d2;
    @Column(name = "b4er19as7d1t1")
    private Double b4er19as7d1t1;
    @Column(name = "b4er19as7d1t2")
    private Double b4er19as7d1t2;
    @Column(name = "b4er19as7d1t3")
    private Double b4er19as7d1t3;
    @Column(name = "b4er19as7d2")
    private Integer b4er19as7d2;
    @Column(name = "b4er19as8d2")
    private Integer b4er19as8d2;
    @Column(name = "b4er19as9d2")
    private Integer b4er19as9d2;
    @Column(name = "b4er19as10d2")
    private Integer b4er19as10d2;
    @Column(name = "b4er19as11d2")
    private Integer b4er19as11d2;
    @Column(name = "b4er19as12d2")
    private Integer b4er19as12d2;
    @Column(name = "b4er19as13d2")
    private Integer b4er19as13d2;
    @Column(name = "b4er19as14d2")
    private Integer b4er19as14d2;
    @Column(name = "b4er19as15d2")
    private Integer b4er19as15d2;
    @Column(name = "b4er19as16d2")
    private Integer b4er19as16d2;
    @Column(name = "b4er19as17d2")
    private Integer b4er19as17d2;
    @Column(name = "b4er19as18d2")
    private Integer b4er19as18d2;
    @Column(name = "b4er19as18d2lainnya")
    private String b4er19as18d2lainnya;
    @Column(name = "b4er19ajumlah")
    private Integer b4er19ajumlah;
    @Column(name = "b4er19bs1d2")
    private Integer b4er19bs1d2;
    @Column(name = "b4er19bs2d2")
    private Integer b4er19bs2d2;
    @Column(name = "b4er19bs3d2")
    private Integer b4er19bs3d2;
    @Column(name = "b4er19bs4d2")
    private Integer b4er19bs4d2;
    @Column(name = "b4er19bs4d2lainnya")
    private String b4er19bs4d2lainnya;
    @Column(name = "b4er19bjumlah")
    private Integer b4er19bjumlah;
    @Column(name = "b4er19bs5d2")
    private Integer b4er19bs5d2;
    @Id
    @Basic(optional = false)
    @Column(name = "nksKapal")
    private String nksKapal;
    @JoinColumn(name = "nks_b1", referencedColumnName = "nks")
    @ManyToOne(optional = false)
    private B1 nksB1;

    public B4() {
    }

    public B4(String nksKapal) {
        this.nksKapal = nksKapal;
    }

    public Integer getB4ar1s1() {
        return b4ar1s1;
    }

    public void setB4ar1s1(Integer b4ar1s1) {
        this.b4ar1s1 = b4ar1s1;
    }

    public String getB4ar1s2() {
        return b4ar1s2;
    }

    public void setB4ar1s2(String b4ar1s2) {
        this.b4ar1s2 = b4ar1s2;
    }

    public String getB4ar1s3() {
        return b4ar1s3;
    }

    public void setB4ar1s3(String b4ar1s3) {
        this.b4ar1s3 = b4ar1s3;
    }

    public Double getB4ar2s1() {
        return b4ar2s1;
    }

    public void setB4ar2s1(Double b4ar2s1) {
        this.b4ar2s1 = b4ar2s1;
    }

    public Double getB4ar2s2() {
        return b4ar2s2;
    }

    public void setB4ar2s2(Double b4ar2s2) {
        this.b4ar2s2 = b4ar2s2;
    }

    public Double getB4ar3() {
        return b4ar3;
    }

    public void setB4ar3(Double b4ar3) {
        this.b4ar3 = b4ar3;
    }

    public Double getB4ar4() {
        return b4ar4;
    }

    public void setB4ar4(Double b4ar4) {
        this.b4ar4 = b4ar4;
    }

    public String getB4ar5() {
        return b4ar5;
    }

    public void setB4ar5(String b4ar5) {
        this.b4ar5 = b4ar5;
    }

    public String getB4ar5lainnya() {
        return b4ar5lainnya;
    }

    public void setB4ar5lainnya(String b4ar5lainnya) {
        this.b4ar5lainnya = b4ar5lainnya;
    }

    public String getB4ar6() {
        return b4ar6;
    }

    public void setB4ar6(String b4ar6) {
        this.b4ar6 = b4ar6;
    }

    public Integer getB4ar7() {
        return b4ar7;
    }

    public void setB4ar7(Integer b4ar7) {
        this.b4ar7 = b4ar7;
    }

    public Integer getB4ar8s1() {
        return b4ar8s1;
    }

    public void setB4ar8s1(Integer b4ar8s1) {
        this.b4ar8s1 = b4ar8s1;
    }

    public Integer getB4ar8s2() {
        return b4ar8s2;
    }

    public void setB4ar8s2(Integer b4ar8s2) {
        this.b4ar8s2 = b4ar8s2;
    }

    public Integer getB4br9s1d1t1() {
        return b4br9s1d1t1;
    }

    public void setB4br9s1d1t1(Integer b4br9s1d1t1) {
        this.b4br9s1d1t1 = b4br9s1d1t1;
    }

    public Integer getB4br9s1d1t2() {
        return b4br9s1d1t2;
    }

    public void setB4br9s1d1t2(Integer b4br9s1d1t2) {
        this.b4br9s1d1t2 = b4br9s1d1t2;
    }

    public Integer getB4br9s1d1t3() {
        return b4br9s1d1t3;
    }

    public void setB4br9s1d1t3(Integer b4br9s1d1t3) {
        this.b4br9s1d1t3 = b4br9s1d1t3;
    }

    public Integer getB4br9s1d2() {
        return b4br9s1d2;
    }

    public void setB4br9s1d2(Integer b4br9s1d2) {
        this.b4br9s1d2 = b4br9s1d2;
    }

    public Integer getB4br9s1d3() {
        return b4br9s1d3;
    }

    public void setB4br9s1d3(Integer b4br9s1d3) {
        this.b4br9s1d3 = b4br9s1d3;
    }

    public Integer getB4br9s2d1t1() {
        return b4br9s2d1t1;
    }

    public void setB4br9s2d1t1(Integer b4br9s2d1t1) {
        this.b4br9s2d1t1 = b4br9s2d1t1;
    }

    public Integer getB4br9s2d1t2() {
        return b4br9s2d1t2;
    }

    public void setB4br9s2d1t2(Integer b4br9s2d1t2) {
        this.b4br9s2d1t2 = b4br9s2d1t2;
    }

    public Integer getB4br9s2d1t3() {
        return b4br9s2d1t3;
    }

    public void setB4br9s2d1t3(Integer b4br9s2d1t3) {
        this.b4br9s2d1t3 = b4br9s2d1t3;
    }

    public Integer getB4br9s2d2() {
        return b4br9s2d2;
    }

    public void setB4br9s2d2(Integer b4br9s2d2) {
        this.b4br9s2d2 = b4br9s2d2;
    }

    public Integer getB4br9s2d3() {
        return b4br9s2d3;
    }

    public void setB4br9s2d3(Integer b4br9s2d3) {
        this.b4br9s2d3 = b4br9s2d3;
    }

    public Integer getB4br9s3d1t1() {
        return b4br9s3d1t1;
    }

    public void setB4br9s3d1t1(Integer b4br9s3d1t1) {
        this.b4br9s3d1t1 = b4br9s3d1t1;
    }

    public Integer getB4br9s3d1t2() {
        return b4br9s3d1t2;
    }

    public void setB4br9s3d1t2(Integer b4br9s3d1t2) {
        this.b4br9s3d1t2 = b4br9s3d1t2;
    }

    public Integer getB4br9s3d1t3() {
        return b4br9s3d1t3;
    }

    public void setB4br9s3d1t3(Integer b4br9s3d1t3) {
        this.b4br9s3d1t3 = b4br9s3d1t3;
    }

    public Integer getB4br9s3d2() {
        return b4br9s3d2;
    }

    public void setB4br9s3d2(Integer b4br9s3d2) {
        this.b4br9s3d2 = b4br9s3d2;
    }

    public Integer getB4br9s3d3() {
        return b4br9s3d3;
    }

    public void setB4br9s3d3(Integer b4br9s3d3) {
        this.b4br9s3d3 = b4br9s3d3;
    }

    public Integer getB4br9s4d1t1() {
        return b4br9s4d1t1;
    }

    public void setB4br9s4d1t1(Integer b4br9s4d1t1) {
        this.b4br9s4d1t1 = b4br9s4d1t1;
    }

    public Integer getB4br9s4d1t2() {
        return b4br9s4d1t2;
    }

    public void setB4br9s4d1t2(Integer b4br9s4d1t2) {
        this.b4br9s4d1t2 = b4br9s4d1t2;
    }

    public Integer getB4br9s4d1t3() {
        return b4br9s4d1t3;
    }

    public void setB4br9s4d1t3(Integer b4br9s4d1t3) {
        this.b4br9s4d1t3 = b4br9s4d1t3;
    }

    public Integer getB4br9s4d2() {
        return b4br9s4d2;
    }

    public void setB4br9s4d2(Integer b4br9s4d2) {
        this.b4br9s4d2 = b4br9s4d2;
    }

    public Integer getB4br9s4d3() {
        return b4br9s4d3;
    }

    public void setB4br9s4d3(Integer b4br9s4d3) {
        this.b4br9s4d3 = b4br9s4d3;
    }

    public Integer getB4br9s5d1t1() {
        return b4br9s5d1t1;
    }

    public void setB4br9s5d1t1(Integer b4br9s5d1t1) {
        this.b4br9s5d1t1 = b4br9s5d1t1;
    }

    public Integer getB4br9s5d1t2() {
        return b4br9s5d1t2;
    }

    public void setB4br9s5d1t2(Integer b4br9s5d1t2) {
        this.b4br9s5d1t2 = b4br9s5d1t2;
    }

    public Integer getB4br9s5d1t3() {
        return b4br9s5d1t3;
    }

    public void setB4br9s5d1t3(Integer b4br9s5d1t3) {
        this.b4br9s5d1t3 = b4br9s5d1t3;
    }

    public Integer getB4br9s5d2() {
        return b4br9s5d2;
    }

    public void setB4br9s5d2(Integer b4br9s5d2) {
        this.b4br9s5d2 = b4br9s5d2;
    }

    public Integer getB4br9s5d3() {
        return b4br9s5d3;
    }

    public void setB4br9s5d3(Integer b4br9s5d3) {
        this.b4br9s5d3 = b4br9s5d3;
    }

    public Integer getB4br9s6d1t1() {
        return b4br9s6d1t1;
    }

    public void setB4br9s6d1t1(Integer b4br9s6d1t1) {
        this.b4br9s6d1t1 = b4br9s6d1t1;
    }

    public Integer getB4br9s6d1t2() {
        return b4br9s6d1t2;
    }

    public void setB4br9s6d1t2(Integer b4br9s6d1t2) {
        this.b4br9s6d1t2 = b4br9s6d1t2;
    }

    public Integer getB4br9s6d1t3() {
        return b4br9s6d1t3;
    }

    public void setB4br9s6d1t3(Integer b4br9s6d1t3) {
        this.b4br9s6d1t3 = b4br9s6d1t3;
    }

    public Integer getB4br9s6d2() {
        return b4br9s6d2;
    }

    public void setB4br9s6d2(Integer b4br9s6d2) {
        this.b4br9s6d2 = b4br9s6d2;
    }

    public Integer getB4br9s6d3() {
        return b4br9s6d3;
    }

    public void setB4br9s6d3(Integer b4br9s6d3) {
        this.b4br9s6d3 = b4br9s6d3;
    }

    public Integer getB4br9s7d1t1() {
        return b4br9s7d1t1;
    }

    public void setB4br9s7d1t1(Integer b4br9s7d1t1) {
        this.b4br9s7d1t1 = b4br9s7d1t1;
    }

    public Integer getB4br9s7d1t2() {
        return b4br9s7d1t2;
    }

    public void setB4br9s7d1t2(Integer b4br9s7d1t2) {
        this.b4br9s7d1t2 = b4br9s7d1t2;
    }

    public Integer getB4br9s7d1t3() {
        return b4br9s7d1t3;
    }

    public void setB4br9s7d1t3(Integer b4br9s7d1t3) {
        this.b4br9s7d1t3 = b4br9s7d1t3;
    }

    public Integer getB4br9s7d2() {
        return b4br9s7d2;
    }

    public void setB4br9s7d2(Integer b4br9s7d2) {
        this.b4br9s7d2 = b4br9s7d2;
    }

    public Integer getB4br9s7d3() {
        return b4br9s7d3;
    }

    public void setB4br9s7d3(Integer b4br9s7d3) {
        this.b4br9s7d3 = b4br9s7d3;
    }

    public Integer getB4br9s8d1t1() {
        return b4br9s8d1t1;
    }

    public void setB4br9s8d1t1(Integer b4br9s8d1t1) {
        this.b4br9s8d1t1 = b4br9s8d1t1;
    }

    public Integer getB4br9s8d1t2() {
        return b4br9s8d1t2;
    }

    public void setB4br9s8d1t2(Integer b4br9s8d1t2) {
        this.b4br9s8d1t2 = b4br9s8d1t2;
    }

    public Integer getB4br9s8d1t3() {
        return b4br9s8d1t3;
    }

    public void setB4br9s8d1t3(Integer b4br9s8d1t3) {
        this.b4br9s8d1t3 = b4br9s8d1t3;
    }

    public Integer getB4br9s8d2() {
        return b4br9s8d2;
    }

    public void setB4br9s8d2(Integer b4br9s8d2) {
        this.b4br9s8d2 = b4br9s8d2;
    }

    public Integer getB4br9s8d3() {
        return b4br9s8d3;
    }

    public void setB4br9s8d3(Integer b4br9s8d3) {
        this.b4br9s8d3 = b4br9s8d3;
    }

    public Integer getB4br9s9d1t1() {
        return b4br9s9d1t1;
    }

    public void setB4br9s9d1t1(Integer b4br9s9d1t1) {
        this.b4br9s9d1t1 = b4br9s9d1t1;
    }

    public Integer getB4br9s9d1t2() {
        return b4br9s9d1t2;
    }

    public void setB4br9s9d1t2(Integer b4br9s9d1t2) {
        this.b4br9s9d1t2 = b4br9s9d1t2;
    }

    public Integer getB4br9s9d1t3() {
        return b4br9s9d1t3;
    }

    public void setB4br9s9d1t3(Integer b4br9s9d1t3) {
        this.b4br9s9d1t3 = b4br9s9d1t3;
    }

    public Integer getB4br9s9d2() {
        return b4br9s9d2;
    }

    public void setB4br9s9d2(Integer b4br9s9d2) {
        this.b4br9s9d2 = b4br9s9d2;
    }

    public Integer getB4br9s9d3() {
        return b4br9s9d3;
    }

    public void setB4br9s9d3(Integer b4br9s9d3) {
        this.b4br9s9d3 = b4br9s9d3;
    }

    public Integer getB4br9s10d1t1() {
        return b4br9s10d1t1;
    }

    public void setB4br9s10d1t1(Integer b4br9s10d1t1) {
        this.b4br9s10d1t1 = b4br9s10d1t1;
    }

    public Integer getB4br9s10d1t2() {
        return b4br9s10d1t2;
    }

    public void setB4br9s10d1t2(Integer b4br9s10d1t2) {
        this.b4br9s10d1t2 = b4br9s10d1t2;
    }

    public Integer getB4br9s10d1t3() {
        return b4br9s10d1t3;
    }

    public void setB4br9s10d1t3(Integer b4br9s10d1t3) {
        this.b4br9s10d1t3 = b4br9s10d1t3;
    }

    public Integer getB4br9s10d2() {
        return b4br9s10d2;
    }

    public void setB4br9s10d2(Integer b4br9s10d2) {
        this.b4br9s10d2 = b4br9s10d2;
    }

    public Integer getB4br9s10d3() {
        return b4br9s10d3;
    }

    public void setB4br9s10d3(Integer b4br9s10d3) {
        this.b4br9s10d3 = b4br9s10d3;
    }

    public String getB4br9s10lainnya() {
        return b4br9s10lainnya;
    }

    public void setB4br9s10lainnya(String b4br9s10lainnya) {
        this.b4br9s10lainnya = b4br9s10lainnya;
    }

    public String getB4br10s1() {
        return b4br10s1;
    }

    public void setB4br10s1(String b4br10s1) {
        this.b4br10s1 = b4br10s1;
    }

    public String getB4br10s2() {
        return b4br10s2;
    }

    public void setB4br10s2(String b4br10s2) {
        this.b4br10s2 = b4br10s2;
    }

    public String getB4br10s3() {
        return b4br10s3;
    }

    public void setB4br10s3(String b4br10s3) {
        this.b4br10s3 = b4br10s3;
    }

    public String getB4br10s4() {
        return b4br10s4;
    }

    public void setB4br10s4(String b4br10s4) {
        this.b4br10s4 = b4br10s4;
    }

    public String getB4br10s5() {
        return b4br10s5;
    }

    public void setB4br10s5(String b4br10s5) {
        this.b4br10s5 = b4br10s5;
    }

    public String getB4br10s6() {
        return b4br10s6;
    }

    public void setB4br10s6(String b4br10s6) {
        this.b4br10s6 = b4br10s6;
    }

    public String getB4br10s7() {
        return b4br10s7;
    }

    public void setB4br10s7(String b4br10s7) {
        this.b4br10s7 = b4br10s7;
    }

    public String getB4br10s8() {
        return b4br10s8;
    }

    public void setB4br10s8(String b4br10s8) {
        this.b4br10s8 = b4br10s8;
    }

    public String getB4br10s8lainnya() {
        return b4br10s8lainnya;
    }

    public void setB4br10s8lainnya(String b4br10s8lainnya) {
        this.b4br10s8lainnya = b4br10s8lainnya;
    }

    public String getB4br11s1() {
        return b4br11s1;
    }

    public void setB4br11s1(String b4br11s1) {
        this.b4br11s1 = b4br11s1;
    }

    public Integer getB4br11s2() {
        return b4br11s2;
    }

    public void setB4br11s2(Integer b4br11s2) {
        this.b4br11s2 = b4br11s2;
    }

    public Integer getB4cr12() {
        return b4cr12;
    }

    public void setB4cr12(Integer b4cr12) {
        this.b4cr12 = b4cr12;
    }

    public String getB4cr13s1d1() {
        return b4cr13s1d1;
    }

    public void setB4cr13s1d1(String b4cr13s1d1) {
        this.b4cr13s1d1 = b4cr13s1d1;
    }

    public Double getB4cr13s1d2() {
        return b4cr13s1d2;
    }

    public void setB4cr13s1d2(Double b4cr13s1d2) {
        this.b4cr13s1d2 = b4cr13s1d2;
    }

    public Integer getB4cr13s1d3() {
        return b4cr13s1d3;
    }

    public void setB4cr13s1d3(Integer b4cr13s1d3) {
        this.b4cr13s1d3 = b4cr13s1d3;
    }

    public String getB4cr13s2d1() {
        return b4cr13s2d1;
    }

    public void setB4cr13s2d1(String b4cr13s2d1) {
        this.b4cr13s2d1 = b4cr13s2d1;
    }

    public Double getB4cr13s2d2() {
        return b4cr13s2d2;
    }

    public void setB4cr13s2d2(Double b4cr13s2d2) {
        this.b4cr13s2d2 = b4cr13s2d2;
    }

    public Integer getB4cr13s2d3() {
        return b4cr13s2d3;
    }

    public void setB4cr13s2d3(Integer b4cr13s2d3) {
        this.b4cr13s2d3 = b4cr13s2d3;
    }

    public String getB4cr13s3d1() {
        return b4cr13s3d1;
    }

    public void setB4cr13s3d1(String b4cr13s3d1) {
        this.b4cr13s3d1 = b4cr13s3d1;
    }

    public Double getB4cr13s3d2() {
        return b4cr13s3d2;
    }

    public void setB4cr13s3d2(Double b4cr13s3d2) {
        this.b4cr13s3d2 = b4cr13s3d2;
    }

    public Integer getB4cr13s3d3() {
        return b4cr13s3d3;
    }

    public void setB4cr13s3d3(Integer b4cr13s3d3) {
        this.b4cr13s3d3 = b4cr13s3d3;
    }

    public String getB4cr13s4d1() {
        return b4cr13s4d1;
    }

    public void setB4cr13s4d1(String b4cr13s4d1) {
        this.b4cr13s4d1 = b4cr13s4d1;
    }

    public Double getB4cr13s4d2() {
        return b4cr13s4d2;
    }

    public void setB4cr13s4d2(Double b4cr13s4d2) {
        this.b4cr13s4d2 = b4cr13s4d2;
    }

    public Integer getB4cr13s4d3() {
        return b4cr13s4d3;
    }

    public void setB4cr13s4d3(Integer b4cr13s4d3) {
        this.b4cr13s4d3 = b4cr13s4d3;
    }

    public String getB4cr13s5d1() {
        return b4cr13s5d1;
    }

    public void setB4cr13s5d1(String b4cr13s5d1) {
        this.b4cr13s5d1 = b4cr13s5d1;
    }

    public Double getB4cr13s5d2() {
        return b4cr13s5d2;
    }

    public void setB4cr13s5d2(Double b4cr13s5d2) {
        this.b4cr13s5d2 = b4cr13s5d2;
    }

    public Integer getB4cr13s5d3() {
        return b4cr13s5d3;
    }

    public void setB4cr13s5d3(Integer b4cr13s5d3) {
        this.b4cr13s5d3 = b4cr13s5d3;
    }

    public Double getB4cr13s6d2() {
        return b4cr13s6d2;
    }

    public void setB4cr13s6d2(Double b4cr13s6d2) {
        this.b4cr13s6d2 = b4cr13s6d2;
    }

    public Integer getB4cr13s6d3() {
        return b4cr13s6d3;
    }

    public void setB4cr13s6d3(Integer b4cr13s6d3) {
        this.b4cr13s6d3 = b4cr13s6d3;
    }

    public Double getB4cr13s7d2() {
        return b4cr13s7d2;
    }

    public void setB4cr13s7d2(Double b4cr13s7d2) {
        this.b4cr13s7d2 = b4cr13s7d2;
    }

    public Integer getB4cr13s7d3() {
        return b4cr13s7d3;
    }

    public void setB4cr13s7d3(Integer b4cr13s7d3) {
        this.b4cr13s7d3 = b4cr13s7d3;
    }

    public String getB4dr14() {
        return b4dr14;
    }

    public void setB4dr14(String b4dr14) {
        this.b4dr14 = b4dr14;
    }

    public Double getB4dr15s1() {
        return b4dr15s1;
    }

    public void setB4dr15s1(Double b4dr15s1) {
        this.b4dr15s1 = b4dr15s1;
    }

    public Double getB4dr15s2() {
        return b4dr15s2;
    }

    public void setB4dr15s2(Double b4dr15s2) {
        this.b4dr15s2 = b4dr15s2;
    }

    public Double getB4dr15s3() {
        return b4dr15s3;
    }

    public void setB4dr15s3(Double b4dr15s3) {
        this.b4dr15s3 = b4dr15s3;
    }

    public Double getB4dr15s4() {
        return b4dr15s4;
    }

    public void setB4dr15s4(Double b4dr15s4) {
        this.b4dr15s4 = b4dr15s4;
    }

    public Double getB4dr15s5() {
        return b4dr15s5;
    }

    public void setB4dr15s5(Double b4dr15s5) {
        this.b4dr15s5 = b4dr15s5;
    }

    public Double getB4dr15jumlah() {
        return b4dr15jumlah;
    }

    public void setB4dr15jumlah(Double b4dr15jumlah) {
        this.b4dr15jumlah = b4dr15jumlah;
    }

    public String getB4dr16() {
        return b4dr16;
    }

    public void setB4dr16(String b4dr16) {
        this.b4dr16 = b4dr16;
    }

    public String getB4dr16lainnya() {
        return b4dr16lainnya;
    }

    public void setB4dr16lainnya(String b4dr16lainnya) {
        this.b4dr16lainnya = b4dr16lainnya;
    }

    public String getB4dr17s1() {
        return b4dr17s1;
    }

    public void setB4dr17s1(String b4dr17s1) {
        this.b4dr17s1 = b4dr17s1;
    }

    public String getB4dr17s2() {
        return b4dr17s2;
    }

    public void setB4dr17s2(String b4dr17s2) {
        this.b4dr17s2 = b4dr17s2;
    }

    public String getB4dr17s2lainnya() {
        return b4dr17s2lainnya;
    }

    public void setB4dr17s2lainnya(String b4dr17s2lainnya) {
        this.b4dr17s2lainnya = b4dr17s2lainnya;
    }

    public Integer getB4er18s1d1t1() {
        return b4er18s1d1t1;
    }

    public void setB4er18s1d1t1(Integer b4er18s1d1t1) {
        this.b4er18s1d1t1 = b4er18s1d1t1;
    }

    public Integer getB4er18s1d1t2() {
        return b4er18s1d1t2;
    }

    public void setB4er18s1d1t2(Integer b4er18s1d1t2) {
        this.b4er18s1d1t2 = b4er18s1d1t2;
    }

    public Integer getB4er18s1d2t1() {
        return b4er18s1d2t1;
    }

    public void setB4er18s1d2t1(Integer b4er18s1d2t1) {
        this.b4er18s1d2t1 = b4er18s1d2t1;
    }

    public Integer getB4er18s1d2t2() {
        return b4er18s1d2t2;
    }

    public void setB4er18s1d2t2(Integer b4er18s1d2t2) {
        this.b4er18s1d2t2 = b4er18s1d2t2;
    }

    public Integer getB4er18s2d1t1() {
        return b4er18s2d1t1;
    }

    public void setB4er18s2d1t1(Integer b4er18s2d1t1) {
        this.b4er18s2d1t1 = b4er18s2d1t1;
    }

    public Integer getB4er18s2d1t2() {
        return b4er18s2d1t2;
    }

    public void setB4er18s2d1t2(Integer b4er18s2d1t2) {
        this.b4er18s2d1t2 = b4er18s2d1t2;
    }

    public Integer getB4er18s2d2t1() {
        return b4er18s2d2t1;
    }

    public void setB4er18s2d2t1(Integer b4er18s2d2t1) {
        this.b4er18s2d2t1 = b4er18s2d2t1;
    }

    public Integer getB4er18s2d2t2() {
        return b4er18s2d2t2;
    }

    public void setB4er18s2d2t2(Integer b4er18s2d2t2) {
        this.b4er18s2d2t2 = b4er18s2d2t2;
    }

    public Double getB4er19as1d1t1() {
        return b4er19as1d1t1;
    }

    public void setB4er19as1d1t1(Double b4er19as1d1t1) {
        this.b4er19as1d1t1 = b4er19as1d1t1;
    }

    public Double getB4er19as1d1t2() {
        return b4er19as1d1t2;
    }

    public void setB4er19as1d1t2(Double b4er19as1d1t2) {
        this.b4er19as1d1t2 = b4er19as1d1t2;
    }

    public Double getB4er19as1d1t3() {
        return b4er19as1d1t3;
    }

    public void setB4er19as1d1t3(Double b4er19as1d1t3) {
        this.b4er19as1d1t3 = b4er19as1d1t3;
    }

    public Integer getB4er19as1d2() {
        return b4er19as1d2;
    }

    public void setB4er19as1d2(Integer b4er19as1d2) {
        this.b4er19as1d2 = b4er19as1d2;
    }

    public Double getB4er19as2d1t1() {
        return b4er19as2d1t1;
    }

    public void setB4er19as2d1t1(Double b4er19as2d1t1) {
        this.b4er19as2d1t1 = b4er19as2d1t1;
    }

    public Double getB4er19as2d1t2() {
        return b4er19as2d1t2;
    }

    public void setB4er19as2d1t2(Double b4er19as2d1t2) {
        this.b4er19as2d1t2 = b4er19as2d1t2;
    }

    public Double getB4er19as2d1t3() {
        return b4er19as2d1t3;
    }

    public void setB4er19as2d1t3(Double b4er19as2d1t3) {
        this.b4er19as2d1t3 = b4er19as2d1t3;
    }

    public Integer getB4er19as2d2() {
        return b4er19as2d2;
    }

    public void setB4er19as2d2(Integer b4er19as2d2) {
        this.b4er19as2d2 = b4er19as2d2;
    }

    public Double getB4er19as3d1t1() {
        return b4er19as3d1t1;
    }

    public void setB4er19as3d1t1(Double b4er19as3d1t1) {
        this.b4er19as3d1t1 = b4er19as3d1t1;
    }

    public Double getB4er19as3d1t2() {
        return b4er19as3d1t2;
    }

    public void setB4er19as3d1t2(Double b4er19as3d1t2) {
        this.b4er19as3d1t2 = b4er19as3d1t2;
    }

    public Double getB4er19as3d1t3() {
        return b4er19as3d1t3;
    }

    public void setB4er19as3d1t3(Double b4er19as3d1t3) {
        this.b4er19as3d1t3 = b4er19as3d1t3;
    }

    public Integer getB4er19as3d2() {
        return b4er19as3d2;
    }

    public void setB4er19as3d2(Integer b4er19as3d2) {
        this.b4er19as3d2 = b4er19as3d2;
    }

    public Double getB4er19as4d1t1() {
        return b4er19as4d1t1;
    }

    public void setB4er19as4d1t1(Double b4er19as4d1t1) {
        this.b4er19as4d1t1 = b4er19as4d1t1;
    }

    public Double getB4er19as4d1t2() {
        return b4er19as4d1t2;
    }

    public void setB4er19as4d1t2(Double b4er19as4d1t2) {
        this.b4er19as4d1t2 = b4er19as4d1t2;
    }

    public Double getB4er19as4d1t3() {
        return b4er19as4d1t3;
    }

    public void setB4er19as4d1t3(Double b4er19as4d1t3) {
        this.b4er19as4d1t3 = b4er19as4d1t3;
    }

    public Integer getB4er19as4d2() {
        return b4er19as4d2;
    }

    public void setB4er19as4d2(Integer b4er19as4d2) {
        this.b4er19as4d2 = b4er19as4d2;
    }

    public Double getB4er19as5d1t1() {
        return b4er19as5d1t1;
    }

    public void setB4er19as5d1t1(Double b4er19as5d1t1) {
        this.b4er19as5d1t1 = b4er19as5d1t1;
    }

    public Double getB4er19as5d1t2() {
        return b4er19as5d1t2;
    }

    public void setB4er19as5d1t2(Double b4er19as5d1t2) {
        this.b4er19as5d1t2 = b4er19as5d1t2;
    }

    public Double getB4er19as5d1t3() {
        return b4er19as5d1t3;
    }

    public void setB4er19as5d1t3(Double b4er19as5d1t3) {
        this.b4er19as5d1t3 = b4er19as5d1t3;
    }

    public Integer getB4er19as5d2() {
        return b4er19as5d2;
    }

    public void setB4er19as5d2(Integer b4er19as5d2) {
        this.b4er19as5d2 = b4er19as5d2;
    }

    public Double getB4er19as6d1t1() {
        return b4er19as6d1t1;
    }

    public void setB4er19as6d1t1(Double b4er19as6d1t1) {
        this.b4er19as6d1t1 = b4er19as6d1t1;
    }

    public Double getB4er19as6d1t2() {
        return b4er19as6d1t2;
    }

    public void setB4er19as6d1t2(Double b4er19as6d1t2) {
        this.b4er19as6d1t2 = b4er19as6d1t2;
    }

    public Double getB4er19as6d1t3() {
        return b4er19as6d1t3;
    }

    public void setB4er19as6d1t3(Double b4er19as6d1t3) {
        this.b4er19as6d1t3 = b4er19as6d1t3;
    }

    public Integer getB4er19as6d2() {
        return b4er19as6d2;
    }

    public void setB4er19as6d2(Integer b4er19as6d2) {
        this.b4er19as6d2 = b4er19as6d2;
    }

    public Double getB4er19as7d1t1() {
        return b4er19as7d1t1;
    }

    public void setB4er19as7d1t1(Double b4er19as7d1t1) {
        this.b4er19as7d1t1 = b4er19as7d1t1;
    }

    public Double getB4er19as7d1t2() {
        return b4er19as7d1t2;
    }

    public void setB4er19as7d1t2(Double b4er19as7d1t2) {
        this.b4er19as7d1t2 = b4er19as7d1t2;
    }

    public Double getB4er19as7d1t3() {
        return b4er19as7d1t3;
    }

    public void setB4er19as7d1t3(Double b4er19as7d1t3) {
        this.b4er19as7d1t3 = b4er19as7d1t3;
    }

    public Integer getB4er19as7d2() {
        return b4er19as7d2;
    }

    public void setB4er19as7d2(Integer b4er19as7d2) {
        this.b4er19as7d2 = b4er19as7d2;
    }

    public Integer getB4er19as8d2() {
        return b4er19as8d2;
    }

    public void setB4er19as8d2(Integer b4er19as8d2) {
        this.b4er19as8d2 = b4er19as8d2;
    }

    public Integer getB4er19as9d2() {
        return b4er19as9d2;
    }

    public void setB4er19as9d2(Integer b4er19as9d2) {
        this.b4er19as9d2 = b4er19as9d2;
    }

    public Integer getB4er19as10d2() {
        return b4er19as10d2;
    }

    public void setB4er19as10d2(Integer b4er19as10d2) {
        this.b4er19as10d2 = b4er19as10d2;
    }

    public Integer getB4er19as11d2() {
        return b4er19as11d2;
    }

    public void setB4er19as11d2(Integer b4er19as11d2) {
        this.b4er19as11d2 = b4er19as11d2;
    }

    public Integer getB4er19as12d2() {
        return b4er19as12d2;
    }

    public void setB4er19as12d2(Integer b4er19as12d2) {
        this.b4er19as12d2 = b4er19as12d2;
    }

    public Integer getB4er19as13d2() {
        return b4er19as13d2;
    }

    public void setB4er19as13d2(Integer b4er19as13d2) {
        this.b4er19as13d2 = b4er19as13d2;
    }

    public Integer getB4er19as14d2() {
        return b4er19as14d2;
    }

    public void setB4er19as14d2(Integer b4er19as14d2) {
        this.b4er19as14d2 = b4er19as14d2;
    }

    public Integer getB4er19as15d2() {
        return b4er19as15d2;
    }

    public void setB4er19as15d2(Integer b4er19as15d2) {
        this.b4er19as15d2 = b4er19as15d2;
    }

    public Integer getB4er19as16d2() {
        return b4er19as16d2;
    }

    public void setB4er19as16d2(Integer b4er19as16d2) {
        this.b4er19as16d2 = b4er19as16d2;
    }

    public Integer getB4er19as17d2() {
        return b4er19as17d2;
    }

    public void setB4er19as17d2(Integer b4er19as17d2) {
        this.b4er19as17d2 = b4er19as17d2;
    }

    public Integer getB4er19as18d2() {
        return b4er19as18d2;
    }

    public void setB4er19as18d2(Integer b4er19as18d2) {
        this.b4er19as18d2 = b4er19as18d2;
    }

    public String getB4er19as18d2lainnya() {
        return b4er19as18d2lainnya;
    }

    public void setB4er19as18d2lainnya(String b4er19as18d2lainnya) {
        this.b4er19as18d2lainnya = b4er19as18d2lainnya;
    }

    public Integer getB4er19ajumlah() {
        return b4er19ajumlah;
    }

    public void setB4er19ajumlah(Integer b4er19ajumlah) {
        this.b4er19ajumlah = b4er19ajumlah;
    }

    public Integer getB4er19bs1d2() {
        return b4er19bs1d2;
    }

    public void setB4er19bs1d2(Integer b4er19bs1d2) {
        this.b4er19bs1d2 = b4er19bs1d2;
    }

    public Integer getB4er19bs2d2() {
        return b4er19bs2d2;
    }

    public void setB4er19bs2d2(Integer b4er19bs2d2) {
        this.b4er19bs2d2 = b4er19bs2d2;
    }

    public Integer getB4er19bs3d2() {
        return b4er19bs3d2;
    }

    public void setB4er19bs3d2(Integer b4er19bs3d2) {
        this.b4er19bs3d2 = b4er19bs3d2;
    }

    public Integer getB4er19bs4d2() {
        return b4er19bs4d2;
    }

    public void setB4er19bs4d2(Integer b4er19bs4d2) {
        this.b4er19bs4d2 = b4er19bs4d2;
    }

    public String getB4er19bs4d2lainnya() {
        return b4er19bs4d2lainnya;
    }

    public void setB4er19bs4d2lainnya(String b4er19bs4d2lainnya) {
        this.b4er19bs4d2lainnya = b4er19bs4d2lainnya;
    }

    public Integer getB4er19bjumlah() {
        return b4er19bjumlah;
    }

    public void setB4er19bjumlah(Integer b4er19bjumlah) {
        this.b4er19bjumlah = b4er19bjumlah;
    }

    public Integer getB4er19bs5d2() {
        return b4er19bs5d2;
    }

    public void setB4er19bs5d2(Integer b4er19bs5d2) {
        this.b4er19bs5d2 = b4er19bs5d2;
    }

    public String getNksKapal() {
        return nksKapal;
    }

    public void setNksKapal(String nksKapal) {
        this.nksKapal = nksKapal;
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
        hash += (nksKapal != null ? nksKapal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B4)) {
            return false;
        }
        B4 other = (B4) object;
        if ((this.nksKapal == null && other.nksKapal != null) || (this.nksKapal != null && !this.nksKapal.equals(other.nksKapal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl54.entity.B4[ nksKapal=" + nksKapal + " ]";
    }
    
}
