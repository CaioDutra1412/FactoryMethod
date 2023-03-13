package padroescriacao.factorymethod;

public class ServicoPacotePasseio implements IServico {

    public String executar() {
        return "Passeio contratado";
    }

    public String cancelar() {
        return "Passeio cancelado";
    }
}
