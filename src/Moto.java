public class Moto extends Veiculo {

    public Moto(int id, String marca, String modelo, int ano, String problema) {
        super(id, marca, modelo, ano, problema);
    }

    @Override
    public String emitirSom() {
        return "BRUM BRUUM";
    }
}
