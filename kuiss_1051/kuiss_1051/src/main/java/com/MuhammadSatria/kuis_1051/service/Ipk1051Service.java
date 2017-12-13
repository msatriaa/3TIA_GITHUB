/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.service;
import com.MuhammadSatria.kuis_1051.entity.Ipk1051;
import com.MuhammadSatria.kuis_1051.repo.Ipk1051Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Mahasiswa
 */
@Service("ipk1051Service")
@Transactional
public class Ipk1051Service {

    @Autowired
    private Ipk1051Repo repo;

    public Ipk1051 insert(Ipk1051 ipk1051) {
        return repo.save(ipk1051);
    }
    
    public Ipk1051 update(Ipk1051 ipk1051) {
        return repo.save(ipk1051);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Ipk1051 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Ipk1051> getAll(){
        return repo.findAllIpk1051();
    }
}