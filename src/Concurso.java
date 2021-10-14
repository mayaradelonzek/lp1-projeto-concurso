import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private int identificador;
    private String local;
    private String empresa;
    private LocalDateTime dataHora;
    private String regras;
    private List<Concursado> participantes = new ArrayList<Concursado>();

    public Concurso(int identificador, String local, String empresa, LocalDateTime dataHora, String regras) {
        this.identificador = identificador;
        this.local = local;
        this.empresa = empresa;
        this.dataHora = dataHora;
        this.regras = regras;
        validar();
    }

    public void inscreverConcursado(Concursado novoParticipante) {
        for (Concursado inscrito : participantes) {
            if (inscrito.getCpf().equals(novoParticipante.getCpf())) {
                throw new IllegalArgumentException("Participante já cadastrado.");
            }
        }
        this.participantes.add(novoParticipante);
    }

    protected void validar() {
        List<String> erros = new ArrayList<>();
        if (empresa == null || empresa.isBlank()) {
            erros.add("Informe uma empresa");
        }
        if (regras == null || regras.isBlank()) {
            erros.add("Informe uma regra");
        }
        if (local == null || local.isBlank()) {
            erros.add("Informe um local");
        }
        if (dataHora == null || dataHora.isBefore(LocalDateTime.now())) {
            erros.add("Informe uma data futura");
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getLocal() {
        return local;
    }

    public String getEmpresa() {
        return empresa;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getRegras() {
        return regras;
    }

    public List<Concursado> getParticipantes() {
        return participantes;
    }
}
