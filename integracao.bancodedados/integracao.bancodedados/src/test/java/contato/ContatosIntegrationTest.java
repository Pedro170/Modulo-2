package contato;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
//import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.integracao.bancodedados.integracao.bancodedados.repository.ContatoRepository;
@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosIntegrationTest {
	private Contato contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() {
		contato = new Contato(null, "Pedro", "011", "97027-7484");
	}
	
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	
	@Test
	public void salvarComTelNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O telefone deve ser preenchido!");
		
		contato.setTelefone(null);
		contatoRepository.saveAll(contato);
	}
	
	@Test
	public void SalvarComDddNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O DDD deve ser preenchido!");
		
		contato.setDdd(null);
		contatoRepository.saveAll(contato);
	}
	
	@Test
	public void SalvarComNomeNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O DDD deve ser preenchido!");
		
		contato.setNome(null);
		contatoRepository.saveAll(contato);
	}
}
