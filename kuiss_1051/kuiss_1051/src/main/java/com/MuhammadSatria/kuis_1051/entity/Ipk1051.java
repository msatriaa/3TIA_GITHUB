/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa
 */
@Entity

@Table(name = "tbl_ipk1051")
public class Ipk1051 implements Serializable {    
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_mahasiswa;
    @Column(length = 255, nullable = true)
    private String nilai;
    @Column(length = 255, nullable = true)
    private String alamat;
    @ManyToOne
    private Identitas1051 identitas1051;

    
   
    

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNamaMahasiswa() {
            return nama_mahasiswa;
    }

    /**
     * @param namamahasiswa the name to set
     */
    public void setNamaMahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    /**
     * @param nilai the description to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the description
     */
    public String getNilai() {
        return nilai;
    }
    
    

}
