import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class ConcursadoTest {
    @Test
    public void deveCriarUmConcursadoComSucesso() throws IllegalArgumentException {
        Concurso detran = new Concurso(123, "Porto Alegre", "Detran", LocalDateTime.now(), "regras");
        SituacaoConcurso situacaoConcurso = new SituacaoConcurso(detran);
        Concursado joao = new Concursado("Joao da Silva", 42, "12345678910", "joao@debarro.com", situacaoConcurso);

        Assert.assertEquals("Joao da Silva", joao.getNome());
        Assert.assertEquals("12345678910", joao.getCpf());
        Assert.assertEquals(42, joao.getIdade());
        Assert.assertEquals("joao@debarro.com", joao.getEmail());
    }
//
//    @Test
//    public void deveValidarCpfDoConcursado() {
//        try {
//            Concursado joao = new Concursado();
//            joao.setCpf("1234567");
//        } catch (Exception exception) {
//            Assert.assertEquals("Informe um CPF valido.", exception.getMessage());
//        }
//    }
//
//    @Test
//    public void deveValidarEmailDoConcursado() {
//        try {
//            Concursado joao = new Concursado();
//            joao.setEmail("joao@gmail.com");
//        } catch (Exception exception) {
//            Assert.assertEquals("Informe um e-mail valido:", exception.getMessage());
//        }
//    }
//
//    @Test
//    public void deveValidarNotaDoConcursado() {
//        try {
//            Concursado joao = new Concursado();
//            joao.setNota(8);
//        } catch (Exception exception) {
//            Assert.assertEquals("Informe uma nota valida:", exception.getMessage());
//        }
//    }
}