package pe.idat.edu.Lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Lauchun.entity.CategoriaEntity;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long>{
    @Query("select c from CategoriaEntity c where c.Estado='Activos'")
    List<CategoriaEntity>findAllCustom();
}
