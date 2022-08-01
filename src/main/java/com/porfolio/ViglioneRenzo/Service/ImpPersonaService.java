
package com.porfolio.ViglioneRenzo.Service;

import com.porfolio.ViglioneRenzo.Entity.Persona;
import com.porfolio.ViglioneRenzo.Interface.IPersonaService;
import com.porfolio.ViglioneRenzo.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersoanaRepository;
    
    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersoanaRepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersoanaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersoanaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersoanaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
