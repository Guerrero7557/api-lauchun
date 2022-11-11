
package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Lauchun.entity.ProductoEntity;
import pe.idat.edu.Lauchun.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository prodRep;
    
    @Override
    public List<ProductoEntity> findAll() {
        return prodRep.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return prodRep.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return prodRep.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity c) {
        return prodRep.save(c);
    }

    @Override
    public ProductoEntity update(ProductoEntity c) {
        ProductoEntity objproducto = prodRep.getById(c.getIDproducto());
        BeanUtils.copyProperties(c, objproducto);
        return prodRep.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity c) {
        ProductoEntity objproducto = prodRep.getById(c.getIDproducto());
        String Agotado = "Agotado";
        objproducto.setEstado(Agotado);
        return prodRep.save(objproducto);
    }
    
}
