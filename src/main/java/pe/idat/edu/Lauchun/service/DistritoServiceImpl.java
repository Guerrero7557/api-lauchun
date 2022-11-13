package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Lauchun.entity.DistritoEntity;
import pe.idat.edu.Lauchun.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{
    
    @Autowired
    private DistritoRepository repositorio;

    @Override
    public List<DistritoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> findbyId(long id) {
        return repositorio.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return repositorio.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito = repositorio.getById(d.getIddistrito());
        BeanUtils.copyProperties(d, objdistrito);
        return repositorio.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objdistrito = repositorio.getById(d.getIddistrito());
        objdistrito.setEstado(false);
        return repositorio.save(objdistrito);
    }
    
}
