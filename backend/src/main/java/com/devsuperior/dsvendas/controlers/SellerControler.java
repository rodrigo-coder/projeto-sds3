package com.devsuperior.dsvendas.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerControler {
	
	@Autowired
	private SellerService service;
	
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findall() {
	List<SellerDTO> list = service.findall();
	return ResponseEntity.ok(list);
	}
}
