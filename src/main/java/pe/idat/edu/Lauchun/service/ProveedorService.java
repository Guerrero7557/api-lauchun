package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Lauchun.entity.ProveedorEntity;


public interface ProveedorService {
    // funcion que te permita mostrar todos los datos    
    List<ProveedorEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ProveedorEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ProveedorEntity> findById(Long id);
    
    //funcion para registrar datos
    ProveedorEntity add(ProveedorEntity c);
    
    //funcion para actualizar datos
    ProveedorEntity update(ProveedorEntity c);
    
    //funcion para eliminar datos
    ProveedorEntity delete(ProveedorEntity c);
}
