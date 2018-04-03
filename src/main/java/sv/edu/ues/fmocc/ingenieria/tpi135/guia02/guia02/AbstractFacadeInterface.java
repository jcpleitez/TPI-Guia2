/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fmocc.ingenieria.tpi135.guia02.guia02;

import java.util.List;

/**
 *
 * @author ale
 */
public interface AbstractFacadeInterface <T> {
    
    void create(T entity);

    void edit(T entity);

    void remove(T entity);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    int count();
    
    
    
}
