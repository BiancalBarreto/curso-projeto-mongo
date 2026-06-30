package com.nelioalves.workshopmongo.dto;

import java.io.Serializable;

import com.nelioalves.workshopmongo.domain.User;


/*
Ele serve para transportar dados entre camadas da aplicação ou entre a API e o cliente, Principais motivos para usar DTO
Segurança - Evita expor dados sensíveis.
Controle do que a API retorna - Você escolhe quais campos enviar.
Separação entre banco e API - Sua entidade pode mudar no banco sem quebrar o frontend.
Melhor performance -Você envia menos dados na resposta.
*/

public class UserDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;        
    private String email;

    public UserDTO() {
    }

    //construtor para instanciar a partir do objeto entitie correspondete 
    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
