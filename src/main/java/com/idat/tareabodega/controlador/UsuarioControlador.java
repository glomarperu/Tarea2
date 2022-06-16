package com.idat.tareabodega.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.tareabodega.dto.UsuarioRequestDTO;
import com.idat.tareabodega.dto.UsuarioResponseDTO;
import com.idat.tareabodega.seguridad.JwtUtil;
import com.idat.tareabodega.seguridad.UserDetailService;
@RestController
public class UsuarioControlador {

	@Autowired
	private JwtUtil util;
	
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioRequestDTO dto){
		
		UserDetails details = service.loadUserByUsername(dto.getUsuario());
		
		return ResponseEntity.ok(new UsuarioResponseDTO(util.generateToken(details.getUsername())));
	}
}
