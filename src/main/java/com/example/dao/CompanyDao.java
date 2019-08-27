package com.example.dao;


import com.example.company.model.CompanyModel;
import com.example.repository.Final_Repository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// Service annotation
@Service
@Transactional
public class CompanyDao {
    
//Connection to the repository
@Autowired
Final_Repository final_repository;

    
    /*Get ALL*/
    public List<CompanyModel> FindAll(){
        return (List<CompanyModel>) final_repository.findAll();
    }

    public Iterable findAll() {
        return final_repository.findAll();
    }
    
    /*
    public void deleteAll() {
        final_repository.deleteAll();
    }

    public void deleteAll(Iterable itrbl) {
        final_repository.deleteAll(itrbl);
    }

    public void delete(Object t) {
        final_repository.delete(t);
    }

    public void deleteById(Object id) {
        final_repository.deleteById(id);
    }

    public long count() {
        return final_repository.count();
    }

    public Iterable findAllById(Iterable itrbl) {
        return final_repository.findAllById(itrbl);
    }


    public boolean existsById(Object id) {
        return final_repository.existsById(id);
    }

    public Optional findById(Object id) {
        return final_repository.findById(id);
    }

    public Iterable saveAll(Iterable itrbl) {
        return final_repository.saveAll(itrbl);
    }

    public Object save(Object s) {
        return final_repository.save(s);
    }

        */



}
