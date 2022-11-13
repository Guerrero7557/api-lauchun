package pe.idat.edu.Lauchun.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="DistritoEntity")
@Table(name="distrito")
public class DistritoEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="IDdistrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddistrito;
    
    @Column(name="distrito")
    private String distrito;
    
    @Column(name="Estado")
    private boolean estado;
}
