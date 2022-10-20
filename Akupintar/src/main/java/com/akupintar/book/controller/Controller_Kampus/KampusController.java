package com.akupintar.book.controller.Controller_Kampus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akupintar.book.entity.Kampus.Kampus;
import com.akupintar.book.service.Service_Kampus.KampusService;

@RestController
// @GetMapping("/kampus")
public class KampusController {

    @Autowired
    KampusService kampusService;

    //save 
    @PostMapping("/kampus")
    public Kampus saveKampus(
        @Validated @RequestBody Kampus kampus)
        {
            return kampusService.saveKampus(kampus);
        }
   
    //read
    @GetMapping("/kampus")
    public List<Kampus> fetchKampusList()
    {
        return kampusService.fetchKampusList();
    }

    //update
    @PutMapping("/kampus{id}")
    public Kampus updateKampus(
        @RequestBody Kampus kampus, 
        @PathVariable ("id") Long id)
        {
            return kampusService.updateKampus(kampus, id);
        }
    
    //delete
    @DeleteMapping("/kampus{id}")
    public String deleteKampus(@PathVariable("id")
    Long id)
    {
        kampusService.deleteKampus(id);
        return "Delete successfully";
    }
     
}
