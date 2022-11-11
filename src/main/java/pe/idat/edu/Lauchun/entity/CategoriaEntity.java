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
@Entity(name = "CategoriaEntity")  //define la entidad con la que se va a trabajar
@Table(name = "categoria")
public class CategoriaEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "IDCategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IDCategoria;
    
    @Column(name = "Nombre_Categoria")
    private String Nombre_Categoria;
    
    @Column(name = "Estado")
    private String Estado;
    
    
}
