# Projeto Final de Programação II (ProjetoFinalProgII)

[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen.svg)]()

## Sobre o Projeto
Este repositório contém a implementação do **Projeto Final da disciplina de Programação II**. O objetivo principal do projeto é aplicar na prática os conceitos fundamentais da **Programação Orientada a Objetos (POO)** e técnicas de estruturação de código em **Java**, criando uma aplicação robusta, organizada e escalável.

---
## Funcionalidades Principais
- **Cadastro e Gerenciamento**: Permite cadastrar, listar e manipular as entidades do sistema.

- **Validação de Dados**: Verificação das entradas do usuário para evitar inconsistências.

- **Listagem / Relatórios**: Exibição organizada dos dados processados pela aplicação.

- **Menu Interativo (Console/Interface)**: Navegação fluida para acionar os recursos disponíveis.

---

## Tecnologias e Ferramentas Utilizadas
* **Linguagem:** Java (JDK 8 ou superior)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Controle de Versão:** Git & GitHub
* **Ambiente de Desenvolvimento (IDE):** Eclipse / VS Code / IntelliJ IDEA

---

##  Conceitos de Programação Aplicados
Durante o desenvolvimento do código presente na pasta `src/`, foram explorados os seguintes pilares de desenvolvimento:

1. **Abstração e Encapsulamento:** Utilização de classes de domínio com atributos privados, métodos seletores (`getters`) e modificadores (`setters`) para proteção de dados.
2. **Herança e Polimorfismo:** Reuso de código e especialização de classes para representação fiel das regras de negócio do sistema.
3. **Coleções e Manipulação de Dados:** Uso de coleções (como `ArrayList`, `List` ou `Map`) para armazenamento em memória e gerenciamento eficiente de objetos.
4. **Tratamento de Exceções (`Try-Catch`):** Controle e mitigação de erros em tempo de execução para garantir a estabilidade e usabilidade do sistema.
5. **Estrutura Modular:** Organização do código fonte na pasta `src/` dividindo responsabilidades entre regras de negócio, dados e interface com o usuário.

---

##  Estrutura de Pastas (`src/`)

```text
src/
 ├── [Imovel, Pessoa]   # Classes de modelo / entidades do sistema 
 ├── [Transacao]        # Classes com regras de negócio ou gerenciadores de dados
 └── Main.java          # Classe principal contendo o método main() e execução do sistema
