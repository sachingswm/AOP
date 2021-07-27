package com.example.aop.controller;

import com.example.aop.entity.Homosepien;
import com.example.aop.service.HomosepienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    private HomosepienService homosepienService;
    @PostMapping("/saveHomosepien")
    public void saveHomosepien(@RequestBody Homosepien homosepien)
    {
        homosepienService.saveHomosepien(homosepien);
    }
    @DeleteMapping("deleteHomosepien/{id}")
    public void deleteHomosepien(@PathVariable int id)
    {
        homosepienService.deleteHomosepien(id);
    }
}
