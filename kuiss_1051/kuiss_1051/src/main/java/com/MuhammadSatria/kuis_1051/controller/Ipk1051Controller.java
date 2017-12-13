/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.controller;
import com.MuhammadSatria.kuis_1051.entity.Ipk1051;
import com.MuhammadSatria.kuis_1051.service.Ipk1051Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Mahasiswa
 */
@RestController
@RequestMapping("/ipk1051")
public class Ipk1051Controller {

    @Autowired
    private Ipk1051Service ipk1051Service;

    @RequestMapping(method = RequestMethod.POST)
    public Ipk1051 insert(@RequestBody Ipk1051 ipk1051) {
        return ipk1051Service.insert(ipk1051);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ipk1051 update(@RequestBody Ipk1051 ipk1051) {
        return ipk1051Service.update(ipk1051);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk1051Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Ipk1051 getById(@PathVariable("id") Long id){
        return ipk1051Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk1051> getAll(){
        return ipk1051Service.getAll();
    }
}
