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
import pe.idat.edu.Lauchun.entity.ProveedorEntity;
import pe.idat.edu.Lauchun.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
    
    @Autowired
    private ProveedorService provservice;
    
    @GetMapping
    public List<ProveedorEntity>findAll(){
        return provservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<ProveedorEntity>findAllCustom(){
        return provservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProveedorEntity>findById(@PathVariable Long id ){
        return provservice.findById(id);
    }
    
    @PostMapping
    public ProveedorEntity add(@RequestBody ProveedorEntity c){
        return provservice.add(c);
    }
    
    @PutMapping("/{id}")
    public ProveedorEntity update(@PathVariable long id, @RequestBody ProveedorEntity c){
        c.setIDProveedor(id);
        return provservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ProveedorEntity delete(@PathVariable long id){
        ProveedorEntity objproveedor = new ProveedorEntity();
        String Inactivo = "Inactivo";
        objproveedor.setEstado(Inactivo);
        return provservice.delete(ProveedorEntity.builder().IDProveedor(id).build());
    }
    
    
}
