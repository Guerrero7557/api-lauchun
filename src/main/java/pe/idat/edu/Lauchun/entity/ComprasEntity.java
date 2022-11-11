package pe.idat.edu.Lauchun.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder  //Genera la clase
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
@Data               //genera getters and setters
@Entity(name = "ComprasEntity")  //define la entidad con la que se va a trabajar
@Table(name = "compras")
public class ComprasEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    
    @Id
    @Column(name = "IDCompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long IDCompra;
    
    @Column(name= "Fecha_de_Compras")
    private Date Fecha_de_Compras;
    
    @Column(name= "Numero_Comprobante")
    private String  Numero_Comprobante;
    
    @Column(name= "Estado")
    private String Estado;
    
    @ManyToOne
    @JoinColumn(name="IDProveedor", nullable = false)
    private ProveedorEntity IDProveedor;
    
}
