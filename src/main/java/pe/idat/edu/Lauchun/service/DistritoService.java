package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Lauchun.entity.DistritoEntity;

public interface DistritoService {
    
    public List<DistritoEntity> findAll();
    
    public List<DistritoEntity> findAllCustom();
    
    public Optional<DistritoEntity> findbyId(long id);
    
    public DistritoEntity add(DistritoEntity d);
    
    public DistritoEntity update(DistritoEntity d);
    
    public DistritoEntity delete(DistritoEntity d);
    
}
