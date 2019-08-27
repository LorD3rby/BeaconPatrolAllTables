package com.example.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;



//Repository annotation
@NoRepositoryBean
public interface Final_Repository extends CrudRepository{

    @Override
    public void deleteAll();

    @Override
    public void deleteAll(Iterable itrbl);

    @Override
    public void delete(Object t);

    @Override
    public void deleteById(Object id);

    @Override
    public long count();

    @Override
    public Iterable findAllById(Iterable itrbl);

    @Override
    public Iterable findAll();

    @Override
    public boolean existsById(Object id);

    @Override
    public Optional findById(Object id);

    @Override
    public Iterable saveAll(Iterable itrbl);

    @Override
    public Object save(Object s);

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);

    @Override
    public int hashCode();
    
    
    
}
