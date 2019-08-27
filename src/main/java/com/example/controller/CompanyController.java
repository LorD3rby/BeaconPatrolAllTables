package com.example.controller;

import com.example.dao.CompanyDao;
import com.example.company.model.CompanyModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller annotation
@Component
@RestController
public class CompanyController {
    
    
// Connecting CompanyDao package
@Autowired 
CompanyDao companydao;



/*GET everything in DataBase*/
@GetMapping(value="/api/all")
public List<CompanyModel> getAllCompany(){
    return (List<CompanyModel>) companydao.findAll();
}

}
