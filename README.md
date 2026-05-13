# 📚 Pretty Little Shelf

O **Pretty Little Shelf** é um sistema de gerenciamento de coleções de mídias pessoais (músicas, livros, jogos, etc.). Este projeto nasceu da necessidade de organizar itens culturais de forma eficiente, aplicando os conceitos de **Arquitetura Limpa (Clean Architecture)** e as funcionalidades modernas do **Java 21**.

## 🏗️ Arquitetura do Projeto

O sistema é desenhado seguindo a separação de camadas para garantir testabilidade, independência de frameworks e facilidade de manutenção.

### 1. Camada de Domínio (`core.domain`)
É o coração do sistema, onde residem as regras de negócio puras.
*   **Entidades**: Utilização de **Java Records** para garantir imutabilidade dos dados.
*   **Identificadores Únicos**: Implementação de `EntityId` com prefixos semânticos (ex: `sng_` para músicas), facilitando a observabilidade e o monitoramento em logs.
*   **Polimorfismo**: Uso de interfaces (ex: `Media`) para permitir que diferentes tipos de mídia sejam tratados de forma uniforme pelo sistema.

### 2. Camada de Aplicação (`core.application`)
Contém os casos de uso (**Use Cases**) que orquestram o fluxo de dados entre o domínio e as interfaces externas.

### 3. Camada de Infraestrutura (`infrastructure`)
Onde ficam os detalhes técnicos, como persistência em memória (ou futuramente em banco de dados SQL) e integrações de rede.

## 🛠️ Tecnologias Utilizadas

*   **Java 21 (LTS)**: Versão estável mais recente do Java, utilizando Records e preparado para Virtual Threads.
*   **Maven**: Automação de compilação e gerenciamento de dependências.
*   **Spring Boot 3**: Framework para facilitar a criação de APIs e injeção de dependência.

## 🚀 Como Executar

O projeto utiliza o **Maven Wrapper**, dispensando a instalação manual do Maven no sistema.

```bash
# Compilar e instalar dependências
./mvnw clean install

# Executar a aplicação
./mvnw spring-boot:run