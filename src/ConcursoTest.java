//import org.junit.Assert;
//import org.junit.Test;
//
//import java.time.LocalDateTime;
//
//public class ConcursoTest {
//
//    @Test
//    public void deveCriarUmConcursoValido() {
//        Concurso procergs = new Concurso();
//        LocalDateTime dataConcurso = LocalDateTime.now().plusMonths(1);
//        procergs.setDataHora(dataConcurso);
//        procergs.setEmpresa("Procergs");
//        procergs.setIdentificador(1);
//        procergs.setLocal("Av. Ipiranga");
//        procergs.setRegras("Nao chorar no papel da prova");
//
//        Assert.assertEquals("Procergs", procergs.getEmpresa());
//        Assert.assertEquals(1, procergs.getIdentificador());
//        Assert.assertEquals("Av. Ipiranga", procergs.getLocal());
//        Assert.assertEquals("Nao chorar no papel da prova", procergs.getRegras());
//        Assert.assertEquals(dataConcurso, procergs.getDataHora());
//    }
//
//    @Test
//    public void deveValidarDataEHoraDoConcurso() {
//        try {
//            Concurso procergs = new Concurso();
//            LocalDateTime dataConcurso = LocalDateTime.now().minusMonths(1);
//            procergs.setDataHora(dataConcurso);
//
//        } catch (Exception e) {
//            Assert.assertEquals("Data indisponivel! Informe uma data valida.", e.getMessage());
//        }
//    }
//
//    @Test
//    public void deveValidarIdentificadorValido() {
//        try {
//            Concurso procergs = new Concurso();
//            procergs.setIdentificador(-1772);
//
//        } catch (Exception e) {
//            Assert.assertEquals("Identificador invalido.", e.getMessage());
//        }
//    }
//
//    @Test
//    public void deveInscreverConcursadoNoConcurso() {
//        Concursado joaoJose = new Concursado();
//        joaoJose.setCpf("02555648221");
//        joaoJose.setEmail("cara@car.com");
//        joaoJose.setIdade(32);
//        joaoJose.setNome("Joao Jose");
//        joaoJose.setNota(8);
//
//        Concursado joseJoao = new Concursado();
//        joseJoao.setCpf("02555648251");
//        joseJoao.setEmail("cara@cara.com");
//        joseJoao.setIdade(32);
//        joseJoao.setNome("Joao Jose");
//        joseJoao.setNota(8);
//
//        Concurso procergs = new Concurso();
//        procergs.inscreverConcursado(joseJoao);
//        procergs.inscreverConcursado(joaoJose);
//
//        Assert.assertEquals(2, procergs.getParticipantes().size());
//    }
//
//    @Test
//    public void deveValidarInscricaoDeCandidatoJaInscrito() {
//        Concursado joaoJose = new Concursado();
//        joaoJose.setCpf("02555648221");
//        joaoJose.setEmail("cara@cara.com");
//        joaoJose.setIdade(32);
//        joaoJose.setNome("Joao Jose");
//        joaoJose.setNota(8);
//
//        Concursado joseJoao = new Concursado();
//        joseJoao.setCpf("02555648222");
//        joseJoao.setEmail("cara@car.com");
//        joseJoao.setIdade(32);
//        joseJoao.setNome("Joao Jose");
//        joseJoao.setNota(8);
//
//        Concurso procergs = new Concurso();
//        procergs.inscreverConcursado(joseJoao);
//        procergs.inscreverConcursado(joaoJose);
//
//        try {
//            procergs.inscreverConcursado(joaoJose);
//        } catch (Exception e) {
//            Assert.assertEquals("Participante já cadastrado.", e.getMessage());
//        }
//    }
//}
