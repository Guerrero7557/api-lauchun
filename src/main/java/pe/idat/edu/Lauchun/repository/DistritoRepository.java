package pe.idat.edu.Lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Lauchun.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long>{
    @Query("select d from DistritoEntity d where d.estado = '1'")
    List<DistritoEntity> findAllCustom();
}
