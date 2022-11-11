package pe.idat.edu.Lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Lauchun.entity.ProductoEntity;


public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{
    @Query("select c from ProductoEntity c where c.Estado='Disponible'")
    List<ProductoEntity>findAllCustom();
}