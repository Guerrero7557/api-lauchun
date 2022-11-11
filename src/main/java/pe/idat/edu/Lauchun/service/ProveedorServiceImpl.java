package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Lauchun.entity.ProveedorEntity;
import pe.idat.edu.Lauchun.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{
    
    @Autowired
    private ProveedorRepository ProveedorRepos;

    @Override
    public List<ProveedorEntity> findAll() {
        return ProveedorRepos.findAll();
    }

    @Override
    public List<ProveedorEntity> findAllCustom() {
        return ProveedorRepos.findAllCustom();
    }

    @Override
    public Optional<ProveedorEntity> findById(Long id) {
        return ProveedorRepos.findById(id);
    }

    @Override
    public ProveedorEntity add(ProveedorEntity c) {
        return ProveedorRepos.save(c);
    }

    @Override
    public ProveedorEntity update(ProveedorEntity c) {
        ProveedorEntity objprove = ProveedorRepos.getById(c.getIDProveedor());
        BeanUtils.copyProperties(c,objprove);
        return ProveedorRepos.save(objprove);
    }

    @Override
    public ProveedorEntity delete(ProveedorEntity c) {
        ProveedorEntity objprove = ProveedorRepos.getById(c.getIDProveedor());
        String Inactivo = "Inactivo";
        objprove.setEstado(Inactivo);
        return ProveedorRepos.save(objprove);
    }
    
}
