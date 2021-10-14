//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BancoDados {
//    private List<Concursado> concursados = new ArrayList<>();
//    private List<Concurso> concursos = new ArrayList<>();
//
//    public List<Concursado> getConcursados() {
//        return concursados;
//    }
//
//    public void setConcursados(List<Concursado> concursados) {
//        this.concursados = concursados;
//    }
//
//    public List<Concurso> getConcursos() {
//        return concursos;
//    }
//
//    public void setConcursos(List<Concurso> concursos) {
//        this.concursos = concursos;
//    }
//
//    public List<Concurso> filtrarConcursoPorCidade(String cidade) {
//        List<Concurso> concursosFiltrados = new ArrayList<Concurso>();
//        for (Concurso concursoJaSalvo : concursos) {
//            if (concursoJaSalvo.getLocal().contains(cidade)) {
//                concursosFiltrados.add(concursoJaSalvo);
//            }
//        }
//        return concursosFiltrados;
//    }
//
//    public List<Concurso> filtrarConcursoPorNumeroDeParticipantes(int numeroParticipantes) {
//        List<Concurso> concursosFiltrados = new ArrayList<Concurso>();
//        for (Concurso concursoSalvo : concursos) {
//            if (concursoSalvo.getParticipantes().size() == numeroParticipantes) {
//                concursosFiltrados.add(concursoSalvo);
//            }
//        }
//        return concursosFiltrados;
//    }
//
//    public List<Concurso> filtrarConcursoPorEmpresa(String empresa) {
//        List<Concurso> concursosFiltrados = new ArrayList<Concurso>();
//        for (Concurso concursoJaSalvo : concursos) {
//            if (concursoJaSalvo.getEmpresa().equals(empresa)) {
//                concursosFiltrados.add(concursoJaSalvo);
//            }
//        }
//        return concursosFiltrados;
//    }
//
//    public List<Concursado> filtrarConcursadosReprovados() {
//        List<Concursado> concursadosReprovados = new ArrayList<Concursado>();
//        for (Concurso concursoJaSalvo : concursos) {
//            List<Concursado> participantes = concursoJaSalvo.getParticipantes();
//            for (Concursado concursadoJaSalvo : participantes) {
//                if (concursadoJaSalvo.getNota() < 7) {
//                    concursadosReprovados.add(concursadoJaSalvo);
//                }
//            }
//        }
//        return concursadosReprovados;
//    }
//
//    public List<Concurso> filtrarPorPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal) {
//        List<Concurso> concursosFiltrados = new ArrayList<Concurso>();
//        for (Concurso concursoJaSalvo : concursos) {
//            if (concursoJaSalvo.getDataHora().isAfter(dataInicial) && concursoJaSalvo.getDataHora().isBefore(dataFinal)) {
//                concursosFiltrados.add(concursoJaSalvo);
//            }
//        }
//        return concursosFiltrados;
//    }
//
//    public void salvarConcursado(Concursado concursado) {
//        for (Concursado concursadoCadastrado: concursados) {
//            if (concursado.getCpf().equals(concursadoCadastrado.getCpf())) {
//                throw new IllegalArgumentException("Concursado já cadastrado");
//            }
//        }
//        this.concursados.add(concursado);
//    }
//
//    public void salvarConcurso(Concurso concurso) {
//        for (Concurso concursinho : concursos) {
//            if (concurso.getIdentificador() == concursinho.getIdentificador()) {
//                throw new IllegalArgumentException("Concurso ja cadastrado.");
//            }
//        }
//        this.concursos.add(concurso);
//    }
//}
