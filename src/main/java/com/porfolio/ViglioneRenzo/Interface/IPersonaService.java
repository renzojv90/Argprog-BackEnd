
package com.porfolio.ViglioneRenzo.Interface;

import com.porfolio.ViglioneRenzo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una persona por Id
    public Persona findPersona(Long id);
}
