package pe.edu.upeu.encapsulamiento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*@Getter
@Setter*/
@Data
public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;
    private int numeroCam;

    @Override
    public String toString(){
        return "El jugadore tiene estas caracteristicas:\n" +
                "nombre:"+nombre+"\n"
                + "apellido:"+apellido+"\n"
                + "edad:"+edad+"\n"
                + "posicion:"+posicion+"\n"
                + "camiseta N°:"+numeroCam+"\n"
                ;
    }


}
