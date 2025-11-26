# 🛠️ Sistema de Gerenciamento de Oficina  
### Projeto desenvolvido em Java com suporte a persistência em arquivo e interface gráfica básica.

---

## 📌 Sobre o Projeto

Este sistema foi desenvolvido para gerenciar veículos cadastrados em uma oficina mecânica.  
Possui uma estrutura totalmente orientada a objetos, com herança, interface gráfica simples e persistência de dados em arquivo `.txt`.

---

## 🚗 Funcionalidades

- Cadastro de **Carros** e **Motos**
- Registro do **problema** apresentado pelo veículo
- Listagem completa de todos os veículos cadastrados
- Exclusão de veículos por ID
- Emissão de som característico do veículo (polimorfismo)
- Salvamento automático em `bancodedados.txt`
- Carregamento automático ao iniciar o sistema
- Interface Gráfica básica feita em Swing

---

## 🧩 Estrutura de Classes
📦 src
│
├── Veiculo.java
├── Carro.java
├── Moto.java
├── OficinaMain.java
└── OficinaGUI.java


markdown
Copiar código

### 🔹 `Veiculo`  
Classe abstrata base com:
- ID  
- Marca  
- Modelo  
- Ano  
- Problema  
- Método abstrato `emitirSom()`

### 🔹 `Carro`  
Herdado de `Veiculo`, implementa:
- Som de carro  
- Construtor próprio

### 🔹 `Moto`  
Herdado de `Veiculo`, implementa:
- Som de moto  
- Construtor próprio

### 🔹 `OficinaMain`  
Contém:
- Menu de texto interativo  
- Cadastro  
- Exclusão  
- Leitura e gravação no arquivo  
- Carregamento inicial

### 🔹 `OficinaGUI`  
Interface gráfica básica utilizando Java Swing.

---

## 🗂️ Persistência de Dados

Todos os veículos cadastrados são armazenados em:

bancodedados.txt

java
Copiar código

Formato utilizado (cada linha representa um veículo):

ID;TIPO;MARCA;MODELO;ANO;PROBLEMA

makefile
Copiar código

Exemplo:

1;Carro;Toyota;Corolla;2015;Barulho na suspensão
2;Moto;Honda;CG 160;2020;Falha na aceleração

yaml
Copiar código

---

## 💻 Interface Gráfica (Swing)

O projeto inclui uma interface gráfica simples com:

- Lista de veículos
- Botão para cadastrar Carro
- Botão para cadastrar Moto
- Botão para excluir veículo selecionado

### 🖼️ Prévia da Interface (conceito)

┌─────────────────────────────────────┐
│ Sistema da Oficina │
│ ─────────────────────────────────── │
│ [ 1 - Carro Toyota Corolla 2015 ] │
│ [ 2 - Moto Honda CG 2020 ] │
│ │
│ (Cadastrar Carro) (Cadastrar Moto) │
│ (Excluir) │
└─────────────────────────────────────┘

yaml
Copiar código

---

## ▶️ Como Executar

1. Certifique-se de ter o **Java 8+** instalado.
2. Compile os arquivos:

javac *.java

markdown
Copiar código

3. Rode o programa principal:

java OficinaMain

kotlin
Copiar código

4. Caso queira abrir a interface gráfica:

java OficinaGUI

yaml
Copiar código

---

## 🏢 Perfil do Projeto

Este software foi estruturado seguindo boas práticas corporativas:

- Orientação a Objetos  
- Encapsulamento  
- Herança e polimorfismo  
- Persistência simples  
- Interface modular  
- Código padronizado  

---

## 📄 Licença

Este projeto é distribuído para fins educacionais e demonstrativos.  
Fique à vontade para modificar conforme suas necessidades.

---
