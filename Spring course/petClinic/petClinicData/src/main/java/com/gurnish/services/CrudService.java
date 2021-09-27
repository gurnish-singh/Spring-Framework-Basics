package com.gurnish.services;

import java.util.Set;
/////just made a common Service for other Services to use
public interface CrudService <T,ID>{
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}
