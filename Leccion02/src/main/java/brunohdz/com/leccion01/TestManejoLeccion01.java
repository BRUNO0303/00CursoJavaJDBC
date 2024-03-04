package brunohdz.com.leccion01;

import datos.PersonasDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author brusb
 */
public class TestManejoLeccion01 {

    public static void main(String[] args) {
        //CREAMOS LA CLASE PARA USAR QUERYS
        PersonasDAO personaDAO = new PersonasDAO();

        //INSERT
        Persona persona1 = new Persona("Carlos", "Esparza", "e@mail.com", "550545574");
        // Damos los valores al constructor para crear una persona
        personaDAO.insertar(persona1);
        
        //UPDATE
        Persona personaUpdate1 = new Persona(8, "Juan Carlos", "Perez", "jperez@mail.com", "5519458579");
        personaDAO.actualizar(personaUpdate1);
        
        //DELETE
        Persona personaEliminada1 = new Persona(11);
        personaDAO.eliminar(personaEliminada1);
        
        //SELECT
        List<Persona> personas = personaDAO.seleccionar();
        
        //IMPRESION
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
                //Operador Lamda (Imprimimos toda la persona)
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });

    }
}
