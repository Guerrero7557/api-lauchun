package pe.idat.edu.Lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.idat.edu.Lauchun.entity.DetalleComprasEntity;

public interface DetallleComprasRepository extends JpaRepository<DetalleComprasEntity, Long>{
    @Query("select c from DetalleComprasEntity c where c.IDCompra=1")
    List<DetalleComprasEntity>findAllCustom();
    
}
