// Classe que representa um veículo
public class Veiculo {

    private int id;        // Identificador
    private String marca;  // Marca
    private String modelo; // Modelo
    private int ano;       // Ano

    // Construtor
    public Veiculo(int id, String marca, String modelo, int ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Gets
    public int getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    // Sets
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAno(int ano) { this.ano = ano; }

    // Som do veículo
    public String emitirSom() {
        return "BIIH BIHH";
    }

    // Exibição do objeto
    @Override
    public String toString() {
        return "ID: " + id + " | " + marca + " " + modelo + " (" + ano + ")";
    }
}
