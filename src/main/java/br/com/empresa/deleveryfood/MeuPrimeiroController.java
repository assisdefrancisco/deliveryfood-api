package br.com.empresa.deleveryfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // classe responsável por receber requisição web
public class MeuPrimeiroController {

	@GetMapping("/hello") // caminho para acessar a resposta
	@ResponseBody // indica que o retorno da requisiçãoe é o retorno do método hello.
	public String hello() {
		return "Hello!";
	}
}
