/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuhammadSatria.kuis_1051.controller;
import com.MuhammadSatria.kuis_1051.entity.Identitas1051;
import com.MuhammadSatria.kuis_1051.service.Identitas1051Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/identitas1051")
public class Identitas1051Controller {

    @Autowired
    private Identitas1051Service identitas1051Service;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas1051 insert(@RequestBody Identitas1051 identitas1051) {
        return identitas1051Service.insert(identitas1051);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas1051 update(@RequestBody Identitas1051 identitas1051) {
        return identitas1051Service.update(identitas1051);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas1051Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas1051 getById(@PathVariable("id") Long id){
        return identitas1051Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas1051> getAll(){
        return identitas1051Service.getAll();
    }
}
