package br.com.example.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.Ecommerce.model.Usuarios;
import br.com.example.Ecommerce.repository.UsuariosRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuariosController {
	@Autowired
	public UsuariosRepository usuariosRepository;
	
	@GetMapping
	public ResponseEntity<List<Usuarios>> GetAll() {
		return ResponseEntity.ok(usuariosRepository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Usuarios>> GetByNome(@PathVariable String nome) {
		return ResponseEntity.ok(usuariosRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Usuarios> Post(@RequestBody Usuarios usuarios){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuariosRepository.save(usuarios));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id) {
		usuariosRepository.deleteById(id);
	}
}
