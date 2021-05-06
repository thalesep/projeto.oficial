package com.devsuperior.dsvendas.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.config.service.SellerService;
import com.devsuperior.dsvendas.dto.SellerDTO;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> FindAll(){
		List<SellerDTO> list = service.findALL();
		return ResponseEntity.ok(list);
	}
}
