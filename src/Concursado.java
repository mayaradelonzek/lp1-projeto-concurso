import java.util.ArrayList;
import java.util.List;

public class Concursado extends Pessoa {

    private List<SituacaoConcurso> concursos;

    public Concursado(String nome, int idade, String cpf, String email, SituacaoConcurso concurso) {
        super(nome, idade, cpf, email);
        this.concursos = new ArrayList<SituacaoConcurso>();
        addConcurso(concurso);
        validar();
    }

    public void addConcurso(SituacaoConcurso concurso) {
        this.concursos.add(concurso);
    }

    public void aprovaConcurso(int concursoId, int nota) {
        for (SituacaoConcurso situacaoConcurso: concursos) {
            if (situacaoConcurso.getConcurso().getIdentificador() == concursoId) {
                situacaoConcurso.avaliar(nota);
            }
        }
    }

    public void pagarInscricao(int concursoId) {
        for (SituacaoConcurso situacaoConcurso: concursos) {

        }
    }

    @Override
    protected void validar() {
        super.validar();
        if (!mensagens.isEmpty()) {
            throw new IllegalArgumentException(mensagens.toString());
        }
    }

    public List<SituacaoConcurso> getConcursos() {
        return concursos;
    }
}
