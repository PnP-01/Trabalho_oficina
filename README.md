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

---

## 🗂️ Persistência de Dados

Todos os veículos cadastrados são armazenados em:

bancodedados.txt

Formato utilizado (cada linha representa um veículo):

ID; TIPO; MARCA; MODELO; ANO; PROBLEMA

Exemplo:

1;Carro; Toyota; Corolla;2015; Barulho na suspensão

2;Moto; Honda; CG 160; 2020; Falha na aceleração

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
## ✏️ Autores
<div style="display: flex; justify-content: center; align-items: center; gap: 40px;">
  <a href="https://github.com/PnP-01" style="text-decoration: none; color: inherit;">
    <div style="text-align: center;">
      <img src="https://github.com/PnP-01.png?size=75" 
           alt="Perfil PnP-01" 
           width="75" 
           height="75"
           style="border-radius: 50%;">
      <br>
      <b>@PnP-01</b>
</div>
