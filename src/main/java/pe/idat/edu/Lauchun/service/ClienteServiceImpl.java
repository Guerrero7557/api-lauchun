
package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Lauchun.entity.ClienteEntity;
import pe.idat.edu.Lauchun.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repositorio;
    
    @Override
    public List<ClienteEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<ClienteEntity> findbyId(long id) {
        return repositorio.findById(id);
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return repositorio.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente = repositorio.getById(c.getIdusuario());
        BeanUtils.copyProperties(c, objcliente);
        return repositorio.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente = repositorio.getById(c.getIdusuario());
        objcliente.setEstado(false);
        return repositorio.save(objcliente);
    }
    
}

