/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.ViglioneRenzo.Security.Repository;


import com.porfolio.ViglioneRenzo.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByRolUsuario(String rolUsuarios);
    
    boolean existByNombreUsuario(String nombreUsuarios);
    boolean existByEmail(String email);
}
