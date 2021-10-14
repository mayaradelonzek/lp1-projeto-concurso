import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    protected List<String> mensagens = new ArrayList<>();
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        validar();
    }

    public Pessoa() { }

    protected void validar() {
        if (nome == null || nome.isBlank()) {
            mensagens.add("Informe um nome.");
        }
        if (idade <= 0 ) {
            mensagens.add("Informe uma idade valida.");
        }
        if (cpf == null || cpf.isBlank()) {
            mensagens.add("Informe um CPF.");
        } else if (cpf.length() !=11) {
            mensagens.add("Informe um CPF valido.");
        }
        if (email == null || email.isBlank()) {
            mensagens.add("Informe email.");
        } else if (!email.contains("@")) {
            mensagens.add("informe um email valido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
