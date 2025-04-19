package tudelft.Autentificador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AutentificadorTest {
    private final Autentificador autentificador = new Autentificador();
    @Test
    public void Prueba1(){
        assertFalse(autentificador.autenticar(null, "1234"));
    }
    @Test
    public void Prueba2(){
        assertFalse(autentificador.autenticar("Miguel", "1234"));
    }
    @Test
    public void Prueba3(){
        assertTrue(autentificador.autenticar("usuario", "1234"));
    }
    @Test
    public void Prueba4(){
        assertFalse(autentificador.autenticar(null, null));
    }
    @Test
    public void Prueba5(){
        assertFalse(autentificador.autenticar("usuario", null));
    }
    @Test
    public void Prueba6(){
        assertFalse(autentificador.autenticar("usuario", "12"));
    }
}
