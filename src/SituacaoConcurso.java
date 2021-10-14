public class SituacaoConcurso {
    private Concurso concurso;
    private SituacaoEnum situacao;
    private int nota;
    private StatusPagamentoEnum statusPagamento;

    public SituacaoConcurso(Concurso concurso) {
        this.concurso = concurso;
        this.situacao = SituacaoEnum.EM_AVALIACAO;
        this.nota = 0;
        this.statusPagamento = StatusPagamentoEnum.PENDENTE;
        validar();
    }

    public void avaliar(int nota) {
        if (this.statusPagamento.equals(StatusPagamentoEnum.PENDENTE)) {
            throw new IllegalArgumentException("Nao pode avaliar pois o pagamento esta pendente");
        }

        this.nota = nota;
        if (nota <= 7) {
            this.situacao = SituacaoEnum.REPROVADO;
        } else {
            this.situacao = SituacaoEnum.APROVADO;
        }
    }

    public void pagar() {
        this.statusPagamento = StatusPagamentoEnum.PAGO;
    }

    public void validar() {
        if (situacao == null) {
            throw new IllegalArgumentException("A situacao é obrigatória.");
        }
    }

    public Concurso getConcurso() {
        return concurso;
    }

    public SituacaoEnum getSituacao() {
        return situacao;
    }

    public int getNota() {
        return nota;
    }

    public StatusPagamentoEnum getStatusPagamento() {
        return statusPagamento;
    }
}
