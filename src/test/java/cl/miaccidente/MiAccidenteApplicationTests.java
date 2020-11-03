package cl.miaccidente;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.miaccidente.entity.Usuarios;
import cl.miaccidente.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class MiAccidenteApplicationTests {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void crearUsuario() {
		
		Usuarios usuario = new Usuarios();
		usuario.setUsuario("cliente");
		usuario.setClave("1234");
		
		Usuarios retorno = usuarioRepository.save(usuario);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(usuario.getClave()));
	}

}
