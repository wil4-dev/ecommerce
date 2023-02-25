package com.ecommerce.service;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Usuario;


@Service
public class UserDetailServiceImplement implements UserDetailsService {

	private Logger log = LoggerFactory.getLogger(UserDetailServiceImplement.class);
	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	HttpSession session;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> optionalUser = usuarioService.findByEmail(username);
		// Si encuentra el usuario y contraseña de la bd
		if(optionalUser.isPresent()) {
			log.info("Esto es el id del Usuario", optionalUser.get().getId());
			session.setAttribute("idusuario", optionalUser.get().getId()); //pasamos la session usuario
			Usuario usuario = optionalUser.get();
			return User.builder().username(usuario.getNombre()).password(usuario.getPassword()).roles(usuario.getTipo()).build();
		} else {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
	}

}
