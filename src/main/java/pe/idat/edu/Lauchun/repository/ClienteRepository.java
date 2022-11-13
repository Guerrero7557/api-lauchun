

package pe.idat.edu.Lauchun.repository;

import java.util.List;
import pe.idat.edu.Lauchun.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{
    @Query("select c from ClienteEntity c where c.estado = '1'")
    List<ClienteEntity> findAllCustom();
}
