package pe.idat.edu.Lauchun.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.Lauchun.entity.ProductoEntity;
import pe.idat.edu.Lauchun.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService prodservice;
    
    @GetMapping
    public List<ProductoEntity>findAll(){
        return prodservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<ProductoEntity>findAllCustom(){
        return prodservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductoEntity>findById(@PathVariable Long id ){
        return prodservice.findById(id);
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity c){
        return prodservice.add(c);
    }
    
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable long id, @RequestBody ProductoEntity c){
        c.setIDproducto(id);
        return prodservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable long id){
        ProductoEntity objprod = new ProductoEntity();
        String Inactivo = "Inactivo";
        objprod.setEstado(Inactivo);
        return prodservice.delete(ProductoEntity.builder().IDproducto(id).build());
    }
    
}
