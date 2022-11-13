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
import pe.idat.edu.Lauchun.entity.RolEntity;
import pe.idat.edu.Lauchun.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolService servicio;
    
    @GetMapping
    public List<RolEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<RolEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<RolEntity> findById(@PathVariable Long id){
        return servicio.findbyId(id);
    }
    
    @PostMapping
    public RolEntity add(@RequestBody RolEntity c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public RolEntity update(@PathVariable long id, @RequestBody RolEntity d){
        d.setIdrol(id);
        return servicio.update(d);
    }
    
    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable long id){
        RolEntity objCliente = new RolEntity();
        objCliente.setEstado(false);
        return servicio.delete(RolEntity.builder().idrol(id).build());
    }
}
