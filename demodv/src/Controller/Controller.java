package com.example.demo.controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modelo.Users;
import com.example.demo.Server.UserServico;

@RestController
@RequestMapping("/users")
public class Controller {
	
	private final UserServico userServico;
	
	 @Autowired
	    public Controller(UserServico userServico) {  
	        this.userServico = userServico;
	    }

	   
	    @GetMapping("/{id}")
	    public ResponseEntity<Users> buscarUsuario(@PathVariable Long id) {
	        Optional<Users> usuario = userServico.buscarUsuarioPorId(id);
	        return usuario.map(ResponseEntity::ok)  
	                      .orElseGet(() -> ResponseEntity.notFound().build());  
	    }

	   
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> excluirUsuario(@PathVariable Long id) {
	        userServico.excluirUsuario(id);  
	        return ResponseEntity.noContent().build(); 
	    }
}


