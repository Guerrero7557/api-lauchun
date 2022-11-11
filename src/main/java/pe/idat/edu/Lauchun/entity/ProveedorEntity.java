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


@Builder  //Genera la clase
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
@Data               //genera getters and setters
@Entity(name = "ProveedorEntity")  //define la entidad con la que se va a trabajar
@Table(name = "proveedor")
public class ProveedorEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "IDProveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IDProveedor;
    
    @Column(name= "Nombre")
    private String Nombre;
    
    @Column(name= "RUC")
    private String RUC;
    
    @Column(name= "Razon_Social")
    private String Razon_Social;
    
    @Column(name= "Direccion")
    private String Direccion;
    
    @Column(name= "Email")
    private String Email;
    
    @Column(name= "Telefono")
    private String Telefono;
    
    @Column(name= "Estado")
    private String Estado;    
}
