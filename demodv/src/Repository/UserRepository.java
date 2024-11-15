package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.Users;




@Repository
public interface UserRepository  extends JpaRepository<Users, Long >{

}
