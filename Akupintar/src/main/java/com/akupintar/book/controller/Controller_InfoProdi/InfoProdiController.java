package com.akupintar.book.controller.Controller_InfoProdi;

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

import com.akupintar.book.entity.Info_prodi.InfoProdi;
import com.akupintar.book.service.Service_InfoProdi.InfoProdiService;



@RestController
public class InfoProdiController {

    @Autowired
    InfoProdiService infoprodiService;

    
    //save 
    @PostMapping("/prodi")
    public InfoProdi saveProdi(
        @Validated @RequestBody InfoProdi infoprodi)
        {
            return infoprodiService.saveInfo(infoprodi);
        }

    //read
    @GetMapping("/prodi")
    public List<InfoProdi> fetchInfoList()
    {
        return infoprodiService.fetchInfoList();
    }

    //update
    @PutMapping("/prodi{id}")
    public InfoProdi updateInfo(
        @RequestBody InfoProdi infoprodi,
        @PathVariable ("id") Long id
    )
    {
        return infoprodiService.updateInfo(infoprodi, id);
    }


    //delete
    @DeleteMapping("/prodi{id}")
    public String deleteInfo(
        @PathVariable ("id")
        Long id
    )
    {
        infoprodiService.deleteInfo(id);
        return "Delete Success";
    }


}
