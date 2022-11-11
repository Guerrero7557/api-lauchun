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
import pe.idat.edu.Lauchun.entity.ComprasEntity;
import pe.idat.edu.Lauchun.service.ComprasService;

@RestController
@RequestMapping("/compras")
public class ComprasController {
    
    @Autowired
    private ComprasService Compservice;
    
    @GetMapping
    public List<ComprasEntity>findAll(){
        return Compservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<ComprasEntity>findAllCustom(){
        return Compservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ComprasEntity>findById(@PathVariable Long id ){
        return Compservice.findById(id);
    }
    
    @PostMapping
    public ComprasEntity add(@RequestBody ComprasEntity c){
        return Compservice.add(c);
    }
    
    @PutMapping("/{id}")
    public ComprasEntity update(@PathVariable long id, @RequestBody ComprasEntity c){
        c.setIDCompra(id);
        return Compservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ComprasEntity delete(@PathVariable long id){
        ComprasEntity objcompras = new ComprasEntity();
        String Inactivo = "Inactivo";
        objcompras.setEstado(Inactivo);
        return Compservice.delete(ComprasEntity.builder().IDCompra(id).build());
    }
    
}
