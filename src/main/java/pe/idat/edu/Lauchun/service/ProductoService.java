package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Lauchun.entity.ProductoEntity;


public interface ProductoService {
    // funcion que te permita mostrar todos los datos    
    List<ProductoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ProductoEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ProductoEntity> findById(Long id);
    
    //funcion para registrar datos
    ProductoEntity add(ProductoEntity c);
    
    //funcion para actualizar datos
    ProductoEntity update(ProductoEntity c);
    
    //funcion para eliminar datos
    ProductoEntity delete(ProductoEntity c);
}
