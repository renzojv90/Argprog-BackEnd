/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.ViglioneRenzo.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author renzo
 */
public class LoginUsuario {
    @NotBlank
    private String loginUsuario;
    @NotBlank
    private String password;
    
    //geter y setter

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getNombreUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
