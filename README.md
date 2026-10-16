# Projeto Sistema de Animais - Herança e Polimorfismo em Java
## Atividade da matéria de Programação de App
## DS-SENAI/BA

Este projeto demonstra os conceitos práticos de **Herança** e **Polimorfismo** em Java através de uma hierarquia de classes representando diferentes tipos de animais (`Cachorro`, `Gato`, `Passaro`) que herdam de uma classe base `Animal`.

## Tecnologias Utilizadas
- **Linguagem:** Java
- **IDE:** IntelliJ IDEA
- **Controlo de Versão:** Git & GitHub

## Conceitos de POO Aplicados
- **Herança (`extends`):** As subclasses `Cachorro`, `Gato` e `Passaro` herdam atributos e comportamentos da classe pai `Animal`.
- **Polimorfismo / Sobrescrita (`@Override`):** O método `emitirSom()` é sobrescrito em cada subclasse para responder de forma específica ao tipo de animal.
- **Reutilização de Construtores (`super`):** Chamada ao construtor da superclasse para inicialização do atributo `nome`.
- **Percorrimento Polimórfico:** Utilização de um array do tipo genérico `Animal[]` para iterar e invocar comportamentos específicos de cada objeto em tempo de execução.

## Como Executar
1. Clona este repositório: https://github.com/matheusvm10/Java-poo-animais-heranca.git
2. Abre o projeto no IntelliJ IDEA.
3. Executa a classe `Main.java`.
