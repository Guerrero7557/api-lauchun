package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;

import pe.idat.edu.Lauchun.entity.RolEntity;

public interface RolService {
    
    public List<RolEntity> findAll();
    
    public List<RolEntity> findAllCustom();
    
    public Optional<RolEntity> findbyId(long id);
    
    public RolEntity add(RolEntity r);
    
    public RolEntity update(RolEntity r);
    
    public RolEntity delete(RolEntity r);
}
