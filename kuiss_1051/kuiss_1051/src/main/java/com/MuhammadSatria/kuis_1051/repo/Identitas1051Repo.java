/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.repo;
import com.MuhammadSatria.kuis_1051.entity.Identitas1051;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Mahasiswa
 */
public interface Identitas1051Repo extends CrudRepository<Identitas1051, Long> {
    
        @Query("select i from Identitas1051 i")
    public List<Identitas1051> findAllIdentitas1051();
}
