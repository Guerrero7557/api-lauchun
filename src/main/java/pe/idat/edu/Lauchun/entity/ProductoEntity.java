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
@Entity(name = "ProductoEntity")  //define la entidad con la que se va a trabajar
@Table(name = "productos")
public class ProductoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "IDproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IDproducto;
    
    @Column(name= "nombproducto")
    private String NombreProduc;
    
    @Column(name= "Precio")
    private double Precio;
    
    @Column(name= "Unidad")
    private String Unidad;
    
    @Column(name= "Stock")
    private int Stock;
    
    @Column(name= "Descripcion")
    private String Descripcion;
    
    @Column(name= "Estado")
    private String Estado;
    
    @Column(name= "Marca")
    private String Marca;
    
    @Column(name= "Imagen")
    private String Imagen;   
    
    
    @ManyToOne
    @JoinColumn(name="IDCategoria", nullable = false)
    private CategoriaEntity IDCategoria;
    
    @ManyToOne
    @JoinColumn(name="codigo", nullable = false)
    private DetalleComprasEntity IDdetalleCompra;
    
    
}
