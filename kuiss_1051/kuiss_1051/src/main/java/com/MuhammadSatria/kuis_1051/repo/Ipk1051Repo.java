/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.repo;
import com.MuhammadSatria.kuis_1051.entity.Ipk1051;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Mahasiswa
 */
public interface Ipk1051Repo extends CrudRepository<Ipk1051, Long> {
    @Query("select ip from Ipk1051 ip")
    public List<Ipk1051> findAllIpk1051();
}
