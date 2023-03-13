package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCheckoutTest {

    @Test
    void executarCheckout() {
        IServico servico = ServicoFactory.obterServico("Checkout");
        assertEquals("Checkout efetivado", servico.executar());
    }

    @Test
    void cancelarCheckout() {
        IServico servico = ServicoFactory.obterServico("Checkout");
        assertEquals("Checkout cancelado", servico.cancelar());
    }

}