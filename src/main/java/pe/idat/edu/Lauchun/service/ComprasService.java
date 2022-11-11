/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Lauchun.entity.ComprasEntity;


/**
 *
 * @author Harvey
 */
public interface ComprasService {
     // funcion que te permita mostrar todos los datos    
    List<ComprasEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ComprasEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ComprasEntity> findById(Long id);
    
    //funcion para registrar datos
    ComprasEntity add(ComprasEntity c);
    
    //funcion para actualizar datos
    ComprasEntity update(ComprasEntity c);
    
    //funcion para eliminar datos
    ComprasEntity delete(ComprasEntity c);
}
