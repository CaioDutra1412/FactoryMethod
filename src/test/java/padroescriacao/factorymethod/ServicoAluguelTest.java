package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAluguelTest {

    @Test
    void executarAluguel() {
        IServico servico = ServicoFactory.obterServico("AluguelCarro");
        assertEquals("Aluguel efetivado", servico.executar());
    }

    @Test
    void cancelarAluguel() {
        IServico servico = ServicoFactory.obterServico("AluguelCarro");
        assertEquals("Aluguel cancelado", servico.cancelar());
    }

}