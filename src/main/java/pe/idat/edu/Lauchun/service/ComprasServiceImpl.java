package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Lauchun.entity.ComprasEntity;
import pe.idat.edu.Lauchun.repository.ComprasRepository;

@Service
public class ComprasServiceImpl implements ComprasService{

    @Autowired
    private ComprasRepository comprasRepo;
    
    @Override
    public List<ComprasEntity> findAll() {
         return comprasRepo.findAll();
    }

    @Override
    public List<ComprasEntity> findAllCustom() {
        return comprasRepo.findAllCustom();
    }

    @Override
    public Optional<ComprasEntity> findById(Long id) {
        return comprasRepo.findById(id);
    }

    @Override
    public ComprasEntity add(ComprasEntity c) {
        return comprasRepo.save(c);
    }

    @Override
    public ComprasEntity update(ComprasEntity c) {
        ComprasEntity objcompras = comprasRepo.getById(c.getIDCompra());
        BeanUtils.copyProperties(c, objcompras);
        return comprasRepo.save(objcompras);
    }

    @Override
    public ComprasEntity delete(ComprasEntity c) {
        ComprasEntity objcompras = comprasRepo.getById(c.getIDCompra());
        String cancelada = "Cancelada";
        objcompras.setEstado(cancelada);
        return comprasRepo.save(objcompras);
    }
    
}
