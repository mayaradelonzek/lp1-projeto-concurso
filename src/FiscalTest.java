import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class FiscalTest {

    @Test
    public void deveCriarUmFiscalComContaAgencia() {
        Fiscal fiscal = new Fiscal("joao", 30, "12345678910", "joao@joao", "123", "123");

        Assert.assertEquals("joao", fiscal.getNome());
        Assert.assertEquals(30, fiscal.getIdade());
        Assert.assertEquals("12345678910", fiscal.getCpf());
        Assert.assertEquals("joao@joao", fiscal.getEmail());
        Assert.assertEquals("123", fiscal.getAgencia());
        Assert.assertEquals("123", fiscal.getConta());
    }

    @Test
    public void deveCriarUmFiscalComPix() {
        Fiscal fiscal = new Fiscal("joao", 30, "12345678910", "joao@joao", "123255365");

        Assert.assertEquals("joao", fiscal.getNome());
        Assert.assertEquals(30, fiscal.getIdade());
        Assert.assertEquals("12345678910", fiscal.getCpf());
        Assert.assertEquals("joao@joao", fiscal.getEmail());
        Assert.assertEquals("123255365", fiscal.getPix());
    }

    @Test
    public void deveValidarFiscalComCamposObrigatoriosEAgenciaEConta() {
        try {
            new Fiscal(null, 0, null, null, null);
            fail("Deveria ter quebrado");
        } catch (Exception e) {
            String mensagem = "[Informe um nome., Informe uma cpf., Informe um email., Informe uma agencia., Informe uma conta.]";
            Assert.assertEquals(mensagem, e.getMessage());
        }
    }
}
