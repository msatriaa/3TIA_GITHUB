/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.service;
import com.MuhammadSatria.kuis_1051.entity.Identitas1051;
import com.MuhammadSatria.kuis_1051.repo.Identitas1051Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Mahasiswa
 */
@Service("identitas1051Service")
@Transactional
public class Identitas1051Service {

    @Autowired
    private Identitas1051Repo repo;

    public Identitas1051 insert(Identitas1051 identitas1051) {
        return repo.save(identitas1051);
    }
    
    public Identitas1051 update(Identitas1051 identitas1051) {
        return repo.save(identitas1051);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas1051 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas1051> getAll(){
        return repo.findAllIdentitas1051();
    }
}