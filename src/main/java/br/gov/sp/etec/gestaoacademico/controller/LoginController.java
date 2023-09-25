package br.gov.sp.etec.gestaoacademico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gov.sp.etec.gestaoacademico.model.Login;
import br.gov.sp.etec.gestaoacademico.repository.LoginRepository;

@Controller
public class LoginController {
	
	@Autowired
	LoginRepository repository;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/logar")
	public String logar(String user, String password) {
		if(user.equals("admin") && password.equals("123")) {
			return "logado-sucesso";
		}
		else {
			return "erro";
		}
		
	}
	
	@GetMapping("/cadastro")
	public String abrirCadastroLogin() {
		return "cadastro-login";
	}

	@PostMapping("/cadastrar")
	public String salvarLogin(Login login ){
		
		repository.save(login);
		
		return "redirect:/";
	}
}