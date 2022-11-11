package pe.idat.edu.Lauchun.entity;

import java.io.Serializable;
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
@Entity(name = "DetalleComprasEntity")  //define la entidad con la que se va a trabajar
@Table(name = "detalle_de_compra")
public class DetalleComprasEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "IDdetalleCompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long IDdetalleCompra;
    
    @Column(name= "Precio_Compra")
    private double Precio_Compra;
    
    @Column(name= "Cantidad")
    private int Cantidad;
    
    @Column(name= "IGV")
    private double IGV;
    
    @ManyToOne
    @JoinColumn(name="IDCompra", nullable = false)
    private ComprasEntity IDCompra;
    
}
