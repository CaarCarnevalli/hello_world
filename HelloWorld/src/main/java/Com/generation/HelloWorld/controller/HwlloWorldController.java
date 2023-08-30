package Com.generation.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HwlloWorldController {

	@GetMapping

	public String helloWorld() {
		return "hello World!!!";
	}

	
	@GetMapping("/bsm")
	public String Listabsm() {
		return ("Mentalidade de Crescimento" + "\npersistencia" + "\nResponsabilidade pessoal"
				+ "\norientação ao futuro" + "\norientação ao detalhe" + "\nproatividade" + "\ntrabalho em equipe"
				+ "\ncomunicação");
	}

	
	@GetMapping("/obj")
	public String obj() {
		return ("Aprender Spring" + "\nAvançar etapas do PI" + "\ntrabalhar soft Skills");
	}
}
