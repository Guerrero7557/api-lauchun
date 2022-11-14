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
import pe.idat.edu.Lauchun.entity.DetalleComprasEntity;
import pe.idat.edu.Lauchun.service.DetalleComprasServicio;

@RestController
@RequestMapping("/detallecompra")
public class DetalleComprasController {
    
    @Autowired
    private DetalleComprasServicio DetCompServ;
    
    @GetMapping
    public List<DetalleComprasEntity>findAll(){
        return DetCompServ.findAll();
    }
    /*
    @GetMapping("custom")
    public List<DetalleComprasEntity>findAllCustom(){
        return DetCompServ.findAllCustom();
    }
    */
    
    @GetMapping("/{id}")
    public Optional<DetalleComprasEntity>findById(@PathVariable Long id ){
        return DetCompServ.findById(id);
    }
    
    @PostMapping
    public DetalleComprasEntity add(@RequestBody DetalleComprasEntity d){
        return DetCompServ.add(d);
    }
    
    @PutMapping("/{id}")
    public DetalleComprasEntity update(@PathVariable long id, @RequestBody DetalleComprasEntity d){
        d.setIDdetalleCompra(id);
        return DetCompServ.update(d);
    }
    
    
    
}
