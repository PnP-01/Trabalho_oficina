// Classe base
public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String problema; // problema do veiculo

    public Veiculo(int id, String marca, String modelo, int ano, String problema) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.problema = problema;
    }

    public int getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public String getProblema() { return problema; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAno(int ano) { this.ano = ano; }
    public void setProblema(String problema) { this.problema = problema; }

    public String emitirSom() { return "BIIH BIHH"; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + marca + " " + modelo + " (" + ano + ") - Problema: " + problema;
    }
}
