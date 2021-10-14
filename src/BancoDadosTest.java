//import org.junit.Assert;
//import org.junit.Test;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public class BancoDadosTest {
//
//    @Test
//    public void deveCadastrarUmConcursadoComSucesso() {
//        Concursado jose = new Concursado();
//        jose.setCpf("12345678912");
//        jose.setEmail("jose@gmail.com");
//        jose.setNome("Jose da Silva");
//
//        Concursado maria = new Concursado();
//        maria.setCpf("12345458912");
//        maria.setEmail("maria@gmail.com");
//        maria.setNome("Maria da Silva");
//
//        BancoDados bancoDados = new BancoDados();
//        bancoDados.salvarConcursado(jose);
//        bancoDados.salvarConcursado(maria);
//        Assert.assertEquals(2, bancoDados.getConcursados().size());
//    }
//
//    @Test
//    public void deveValidarAExistenciaDeUmConcursadoJaCadastrado() {
//        BancoDados bancoDados = new BancoDados();
//        Concursado jose = new Concursado();
//        jose.setCpf("12345678912");
//        jose.setEmail("jose@gmail.com");
//        jose.setNome("Jose da Silva");
//
//        bancoDados.salvarConcursado(jose);
//
//        try {
//            bancoDados.salvarConcursado(jose);
//        } catch (Exception exception) {
//            Assert.assertEquals("Concursado já cadastrado", exception.getMessage());
//        }
//    }
//
//    @Test
//    public void deveCadastrarConcursoComSucesso() {
//        LocalDateTime dataConcurso = LocalDateTime.now().plusMonths(1);
//        BancoDados banquinho = new BancoDados();
//        Concurso concurso = new Concurso();
//        concurso.setIdentificador(1);
//        concurso.setRegras("Proibido usar giz de cera");
//        concurso.setLocal("Casarao do ze");
//        concurso.setEmpresa("empresa");
//        concurso.setDataHora(dataConcurso);
//
//        banquinho.salvarConcurso(concurso);
//        Assert.assertEquals(1, banquinho.getConcursos().size());
//    }
//
//    @Test
//    public void deveValidarAExistenciaDeUmConcursoJaCadastrado() {
//        BancoDados banquinho = new BancoDados();
//        Concurso concursinho = new Concurso();
//        concursinho.setIdentificador(1);
//        banquinho.salvarConcurso(concursinho);
//
//        try {
//            Concurso concursao = new Concurso();
//            concursao.setIdentificador(1);
//            banquinho.salvarConcurso(concursao);
//        } catch (Exception exception) {
//            Assert.assertEquals("Concurso ja cadastrado.", exception.getMessage());
//        }
//    }
//
//    @Test
//    public void deveEncontrarConcursosParaUmaCidade() {
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setDataHora(LocalDateTime.now().plusMonths(1));
//        procergs.setLocal("Avenida Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta.");
//        procergs.setIdentificador(1);
//
//        Concurso bombeiros = new Concurso();
//        bombeiros.setEmpresa("Bombeiros");
//        bombeiros.setDataHora(LocalDateTime.now().plusMonths(1));
//        bombeiros.setLocal("Avenida Ipiranga - Porto Alegre");
//        bombeiros.setRegras("Levar caneta preta.");
//        bombeiros.setIdentificador(2);
//
//        Concurso pf = new Concurso();
//        pf.setEmpresa("PF");
//        pf.setDataHora(LocalDateTime.now().plusMonths(1));
//        pf.setLocal("São Paulo");
//        pf.setRegras("Levar caneta preta.");
//        pf.setIdentificador(3);
//
//        BancoDados banquinho = new BancoDados();
//        banquinho.salvarConcurso(procergs);
//        banquinho.salvarConcurso(bombeiros);
//        banquinho.salvarConcurso(pf);
//
//        List<Concurso> concursos = banquinho.filtrarConcursoPorCidade("Porto");
//        Assert.assertEquals(2, concursos.size());
//    }
//
//    @Test
//    public void naoDeveEncontrarConcursosParaUmaCidade() {
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setDataHora(LocalDateTime.now().plusMonths(1));
//        procergs.setLocal("Avenida Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta.");
//        procergs.setIdentificador(1);
//
//        Concurso bombeiros = new Concurso();
//        bombeiros.setEmpresa("Bombeiros");
//        bombeiros.setDataHora(LocalDateTime.now().plusMonths(1));
//        bombeiros.setLocal("Avenida Ipiranga - Porto Alegre");
//        bombeiros.setRegras("Levar caneta preta.");
//        bombeiros.setIdentificador(2);
//
//        Concurso pf = new Concurso();
//        pf.setEmpresa("PF");
//        pf.setDataHora(LocalDateTime.now().plusMonths(1));
//        pf.setLocal("São Paulo");
//        pf.setRegras("Levar caneta preta.");
//        pf.setIdentificador(3);
//
//        BancoDados banquinho = new BancoDados();
//        banquinho.salvarConcurso(procergs);
//        banquinho.salvarConcurso(bombeiros);
//        banquinho.salvarConcurso(pf);
//
//        List<Concurso> concursos = banquinho.filtrarConcursoPorCidade("Toledo");
//        Assert.assertEquals(0, concursos.size());
//    }
//
//    @Test
//    public void deveEncontrarConcursosNoPeriodo() {
//        Concurso procergs = new Concurso();
//        procergs.setDataHora(LocalDateTime.of(2021, 9, 20, 15, 30));
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//
//        Concurso procempa = new Concurso();
//        procempa.setDataHora(LocalDateTime.of(2021, 10, 20, 15, 30));
//        procempa.setEmpresa("Procempa");
//        procempa.setIdentificador(2);
//        procempa.setLocal("Av Ipiranga - Porto Alegre");
//        procempa.setRegras("Levar caneta preta");
//
//        Concurso brigadaMilitar = new Concurso();
//        brigadaMilitar.setDataHora(LocalDateTime.of(2021, 8, 2, 15, 30));
//        brigadaMilitar.setEmpresa("Brigada Militar");
//        brigadaMilitar.setIdentificador(3);
//        brigadaMilitar.setLocal("Av Ipiranga - Porto Alegre");
//        brigadaMilitar.setRegras("Levar caneta preta");
//
//        Concurso eptc = new Concurso();
//        eptc.setDataHora(LocalDateTime.of(2021, 6, 25, 15, 30));
//        eptc.setEmpresa("EPTC");
//        eptc.setIdentificador(4);
//        eptc.setLocal("Av Ipiranga - Porto Alegre");
//        eptc.setRegras("Levar caneta preta");
//
//        BancoDados banquinho = new BancoDados();
//        banquinho.salvarConcurso(procergs);
//        banquinho.salvarConcurso(procempa);
//        banquinho.salvarConcurso(brigadaMilitar);
//        banquinho.salvarConcurso(eptc);
//
//        LocalDateTime dataInicial = LocalDateTime.of(2021, 9, 1, 00, 00);
//        LocalDateTime dataFinal = LocalDateTime.of(2021,9, 30, 23, 59);
//        List<Concurso> concursosDeSetembro = banquinho.filtrarPorPeriodo(dataInicial, dataFinal);
//        Assert.assertEquals(1, concursosDeSetembro.size());
//    }
//
//    @Test
//    public void naoDeveEncontrarConcursosNoPeriodo() {
//        Concurso procergs = new Concurso();
//        procergs.setDataHora(LocalDateTime.of(2021, 9, 20, 15, 30));
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//
//        Concurso procempa = new Concurso();
//        procempa.setDataHora(LocalDateTime.of(2021, 10, 20, 15, 30));
//        procempa.setEmpresa("Procempa");
//        procempa.setIdentificador(2);
//        procempa.setLocal("Av Ipiranga - Porto Alegre");
//        procempa.setRegras("Levar caneta preta");
//
//        Concurso brigadaMilitar = new Concurso();
//        brigadaMilitar.setDataHora(LocalDateTime.of(2021, 8, 2, 15, 30));
//        brigadaMilitar.setEmpresa("Brigada Militar");
//        brigadaMilitar.setIdentificador(3);
//        brigadaMilitar.setLocal("Av Ipiranga - Porto Alegre");
//        brigadaMilitar.setRegras("Levar caneta preta");
//
//        Concurso eptc = new Concurso();
//        eptc.setDataHora(LocalDateTime.of(2021, 6, 25, 15, 30));
//        eptc.setEmpresa("EPTC");
//        eptc.setIdentificador(4);
//        eptc.setLocal("Av Ipiranga - Porto Alegre");
//        eptc.setRegras("Levar caneta preta");
//
//        BancoDados banquinho = new BancoDados();
//        banquinho.salvarConcurso(procergs);
//        banquinho.salvarConcurso(procempa);
//        banquinho.salvarConcurso(brigadaMilitar);
//        banquinho.salvarConcurso(eptc);
//
//        LocalDateTime dataInicial = LocalDateTime.of(2022, 9, 1, 00, 00);
//        LocalDateTime dataFinal = LocalDateTime.of(2022,9, 30, 23, 59);
//        List<Concurso> concursosDeSetembro = banquinho.filtrarPorPeriodo(dataInicial, dataFinal);
//        Assert.assertEquals(0, concursosDeSetembro.size());
//    }
//
//    @Test
//    public void deveFiltrarConcursadosReprovados() {
//        BancoDados banquinho = new BancoDados();
//        Concursado jose = new Concursado();
//        jose.setCpf("12345678912");
//        jose.setEmail("jose@gmail.com");
//        jose.setNome("Jose da Silva");
//        jose.setNota(4);
//
//        Concursado maria = new Concursado();
//        maria.setCpf("12345458912");
//        maria.setEmail("maria@gmail.com");
//        maria.setNome("Maria da Silva");
//        maria.setNota(6);
//
//        Concursado joao = new Concursado();
//        joao.setCpf("12345678914");
//        joao.setEmail("joao@gmail.com");
//        joao.setNome("Joao da Silva");
//        joao.setNota(8);
//
//        Concursado pedro = new Concursado();
//        pedro.setCpf("12345458915");
//        pedro.setEmail("pedro@gmail.com");
//        pedro.setNome("Pedro da Silva");
//        pedro.setNota(10);
//
//        banquinho.salvarConcursado(maria);
//        banquinho.salvarConcursado(joao);
//        banquinho.salvarConcursado(jose);
//        banquinho.salvarConcursado(pedro);
//
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//
//        Concurso procempa = new Concurso();
//        procempa.setEmpresa("Procempa");
//        procempa.setIdentificador(2);
//        procempa.setLocal("Av Ipiranga - Porto Alegre");
//        procempa.setRegras("Levar caneta preta");
//
//        Concurso brigadaMilitar = new Concurso();
//        brigadaMilitar.setEmpresa("Brigada Militar");
//        brigadaMilitar.setIdentificador(3);
//        brigadaMilitar.setLocal("Av Ipiranga - Porto Alegre");
//        brigadaMilitar.setRegras("Levar caneta preta");
//
//        Concurso eptc = new Concurso();
//        eptc.setEmpresa("EPTC");
//        eptc.setIdentificador(4);
//        eptc.setLocal("Av Ipiranga - Porto Alegre");
//        eptc.setRegras("Levar caneta preta");
//
//        banquinho.salvarConcurso(procergs);
//        banquinho.salvarConcurso(procempa);
//        banquinho.salvarConcurso(brigadaMilitar);
//        banquinho.salvarConcurso(eptc);
//
//        eptc.inscreverConcursado(maria);
//        procempa.inscreverConcursado(joao);
//        procergs.inscreverConcursado(jose);
//        brigadaMilitar.inscreverConcursado(pedro);
//
//        Assert.assertEquals(2, banquinho.filtrarConcursadosReprovados().size());
//    }
//
//    @Test
//    public void naoDeveFiltrarConcursadosReprovados() {
//        BancoDados banquinho = new BancoDados();
//        Concursado jose = new Concursado();
//        jose.setCpf("12345678912");
//        jose.setEmail("jose@gmail.com");
//        jose.setNome("Jose da Silva");
//        jose.setNota(8.6);
//
//        Concursado maria = new Concursado();
//        maria.setCpf("12345458912");
//        maria.setEmail("maria@gmail.com");
//        maria.setNome("Maria da Silva");
//        maria.setNota(9.5);
//
//        Concursado joao = new Concursado();
//        joao.setCpf("12345678914");
//        joao.setEmail("joao@gmail.com");
//        joao.setNome("Joao da Silva");
//        joao.setNota(8);
//
//        Concursado pedro = new Concursado();
//        pedro.setCpf("12345458915");
//        pedro.setEmail("pedro@gmail.com");
//        pedro.setNome("Pedro da Silva");
//        pedro.setNota(10);
//
//        banquinho.salvarConcursado(maria);
//        banquinho.salvarConcursado(joao);
//        banquinho.salvarConcursado(jose);
//        banquinho.salvarConcursado(pedro);
//
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//
//        Concurso procempa = new Concurso();
//        procempa.setEmpresa("Procempa");
//        procempa.setIdentificador(2);
//        procempa.setLocal("Av Ipiranga - Porto Alegre");
//        procempa.setRegras("Levar caneta preta");
//
//        Concurso brigadaMilitar = new Concurso();
//        brigadaMilitar.setEmpresa("Brigada Militar");
//        brigadaMilitar.setIdentificador(3);
//        brigadaMilitar.setLocal("Av Ipiranga - Porto Alegre");
//        brigadaMilitar.setRegras("Levar caneta preta");
//
//        Concurso eptc = new Concurso();
//        eptc.setEmpresa("EPTC");
//        eptc.setIdentificador(4);
//        eptc.setLocal("Av Ipiranga - Porto Alegre");
//        eptc.setRegras("Levar caneta preta");
//
//        banquinho.salvarConcurso(procergs);
//        banquinho.salvarConcurso(procempa);
//        banquinho.salvarConcurso(brigadaMilitar);
//        banquinho.salvarConcurso(eptc);
//
//        eptc.inscreverConcursado(maria);
//        procempa.inscreverConcursado(joao);
//        procergs.inscreverConcursado(jose);
//        brigadaMilitar.inscreverConcursado(pedro);
//
//        Assert.assertEquals(0, banquinho.filtrarConcursadosReprovados().size());
//    }
//
//    @Test
//    public void deveFiltrarConcursoPorEmpresas() {
//        BancoDados banquinho = new BancoDados();
//
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//
//        procergs.setEmpresa("Procergs");
//        banquinho.salvarConcurso(procergs);
//
//        List<Concurso> concursos = banquinho.filtrarConcursoPorEmpresa("Procergs");
//        Assert.assertEquals(1, concursos.size());
//    }
//
//    @Test
//    public void naoDeveFiltrarConcursoPorEmpresas() {
//        BancoDados banquinho = new BancoDados();
//
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//
//        procergs.setEmpresa("Procergs");
//        banquinho.salvarConcurso(procergs);
//
//        List<Concurso> concursos = banquinho.filtrarConcursoPorEmpresa("Procempa");
//        Assert.assertEquals(0, concursos.size());
//    }
//
//    @Test
//    public void deveFiltrarConcursosPorNumeroDeParticipantes() {
//        BancoDados banquinho = new BancoDados();
//
//        Concursado maria = new Concursado();
//        maria.setCpf("12345458912");
//        maria.setEmail("maria@gmail.com");
//        maria.setNome("Maria da Silva");
//        maria.setNota(9.5);
//
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//        procergs.inscreverConcursado(maria);
//
//        banquinho.salvarConcurso(procergs);
//
//        Assert.assertEquals(1, banquinho.filtrarConcursoPorNumeroDeParticipantes(1).size());
//    }
//
//    @Test
//    public void naoDeveFiltrarConcursosPorNumeroDeParticipantes() {
//        BancoDados banquinho = new BancoDados();
//
//        Concursado maria = new Concursado();
//        maria.setCpf("12345458912");
//        maria.setEmail("maria@gmail.com");
//        maria.setNome("Maria da Silva");
//        maria.setNota(9.5);
//
//        Concurso procergs = new Concurso();
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av Ipiranga - Porto Alegre");
//        procergs.setRegras("Levar caneta preta");
//        procergs.inscreverConcursado(maria);
//
//        //banquinho.salvarConcurso(procergs);
//
//        Assert.assertEquals(0, banquinho.filtrarConcursoPorNumeroDeParticipantes(1).size());
//    }
//}