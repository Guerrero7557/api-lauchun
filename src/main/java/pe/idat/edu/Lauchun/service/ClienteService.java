
package pe.idat.edu.Lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Lauchun.entity.ClienteEntity;

public interface ClienteService {
    
    public List<ClienteEntity> findAll();
    
    public List<ClienteEntity> findAllCustom();
    
    public Optional<ClienteEntity> findbyId(long id);
    
    public ClienteEntity add(ClienteEntity c);
    
    public ClienteEntity update(ClienteEntity c);
    
    public ClienteEntity delete(ClienteEntity c);
}
