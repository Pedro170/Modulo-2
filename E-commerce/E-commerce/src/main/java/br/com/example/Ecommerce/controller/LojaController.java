package br.com.example.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.Ecommerce.model.Loja;
import br.com.example.Ecommerce.repository.LojaRepository;

@RestController
@RequestMapping("/loja")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LojaController {
	
	@Autowired
	public LojaRepository lojaRepository;
	
	@GetMapping
	public ResponseEntity<List<Loja>> GetAll() {
		return ResponseEntity.ok(lojaRepository.findAll());
	}
	
	@GetMapping("/nomeLoja/{nome}")
	public ResponseEntity<List<Loja>> GetByNome(@PathVariable String nome) {
		return ResponseEntity.ok(lojaRepository.findAllByNomeLojaContainingIgnoreCase(nome));
	}
	
	
	@PostMapping
	public ResponseEntity<Loja> Post(@RequestBody Loja loja) {
		return ResponseEntity.status(HttpStatus.CREATED).body(lojaRepository.save(loja));
	}
	
	@PutMapping
	public ResponseEntity<Loja> Put(@RequestBody Loja loja) {
		return ResponseEntity.status(HttpStatus.OK).body(lojaRepository.save(loja));
	}
}
