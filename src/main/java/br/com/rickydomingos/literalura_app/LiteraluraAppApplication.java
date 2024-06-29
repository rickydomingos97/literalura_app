package br.com.rickydomingos.literalura_app;

import br.com.rickydomingos.literalura_app.principal.Principal;
import br.com.rickydomingos.literalura_app.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraAppApplication implements CommandLineRunner {

	@Autowired
	private LivroService livroService;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal p = new Principal(livroService);
		p.exibeMenu();
	}
}