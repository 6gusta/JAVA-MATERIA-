package com.example.demo.Server;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelo.Users;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServico {
	private final UserRepository userRepository ;
	
	@Autowired
	public UserServico(UserRepository  userRepository ) {
		
		this.userRepository = userRepository ;
		
	}
	
	public Users salvarUsuario(Users user) {
		
		return userRepository.save(user);
		
	}
	
	
	public void excluirUsuario(Long id_users) {
		userRepository.deleteById(id_users);
	}

	public Optional<Users> buscarUsuarioPorId(Long id) {
        return userRepository.findById(id); 
    }
	
	

}

