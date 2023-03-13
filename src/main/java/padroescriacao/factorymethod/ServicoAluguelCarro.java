package padroescriacao.factorymethod;

public class ServicoAluguelCarro implements IServico {

    public String executar() {
        return "Aluguel efetivado";
    }

    public String cancelar() {
        return "Aluguel cancelado";
    }
}
