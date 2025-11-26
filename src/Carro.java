public class Carro extends Veiculo {

    public Carro(int id, String marca, String modelo, int ano, String problema) {
        super(id, marca, modelo, ano, problema);
    }

    @Override
    public String emitirSom() {
        return "VRUM VRUM";
    }
}
