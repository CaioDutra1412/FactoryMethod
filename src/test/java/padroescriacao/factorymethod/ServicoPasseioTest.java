package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPasseioTest {

    @Test
    void executarPasseio() {
        IServico servico = ServicoFactory.obterServico("PacotePasseio");
        assertEquals("Passeio contratado", servico.executar());
    }

    @Test
    void cancelarPasseio() {
        IServico servico = ServicoFactory.obterServico("PacotePasseio");
        assertEquals("Passeio cancelado", servico.cancelar());
    }

}