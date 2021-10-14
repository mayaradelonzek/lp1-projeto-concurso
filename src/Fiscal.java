import java.util.ArrayList;
import java.util.List;

public class Fiscal extends Pessoa {
    private String agencia;
    private String conta;
    private String pix;

    public Fiscal(String nome, int idade, String cpf, String email, String agencia, String conta) {
        super(nome, idade, cpf, email);
        this.agencia = agencia;
        this.conta = conta;
        validarConta();
        validar();
    }

    public Fiscal(String nome, int idade, String cpf, String email, String pix) {
        super(nome, idade, cpf, email);
        this.pix = pix;
        validarPix();
        validar();
    }

    @Override
    protected void validar() {
        List<String> mensagens = new ArrayList<>();
        super.validar();

        if (!mensagens.isEmpty()) {
            throw new IllegalArgumentException(mensagens.toString());
        }
    }

    private void validarConta() {
        if (agencia == null || agencia.isBlank()) {
            mensagens.add("Informe uma agencia.");
        }
        if (conta == null || conta.isBlank()) {
            mensagens.add("Informe uma conta.");
        }
    }

    private void validarPix() {
        if (pix == null || pix.isBlank()) {
            mensagens.add("Informe um pix.");
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public String getPix() {
        return pix;
    }
}
