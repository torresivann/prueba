package com.CRUD.prueba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.CRUD.prueba.entity.Usuario;
import com.CRUD.prueba.interfaces.UsuarioRepository;

public class UserController {
	
	@Autowired
	private UsuarioRepository repo;
	
	@PostMapping("/add")
	public Usuario add(@RequestBody Usuario val) {
		return repo.save(val);
	}
	
	@GetMapping("/views")
	public List<Usuario> views(){
		return repo.findAll();
	}
	
	@GetMapping("/views/{val}")
	public Optional<Usuario> views(@PathVariable Integer val){
		return repo.findById(val);
	}
	
	@PutMapping("/update")
	public Usuario views(@RequestBody Usuario val){
		return repo.save(val);
	}
	
	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val){
	   repo.deleteById(val);
	   return "Id : " +val+ " delete";
	}

}