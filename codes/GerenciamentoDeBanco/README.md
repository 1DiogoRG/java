# 🏦 Bank System v3.0

Sistema bancário modular com persistência de dados em disco e validação de regras de negócio.

## 🛠️ Tecnologias e Conceitos
- **Java Serialization:** Persistência de objetos em arquivos binários (`.dat`).
- **Data Access Object (DAO):** Padrão simplificado para gerenciamento de dados.
- **Error Handling:** Validação robusta de tipos e regras (InputMismatch e Business Rules).

## 🚀 Como testar a "Realidade"
1. Execute o programa e cadastre um cliente.
2. Feche o Eclipse completamente.
3. Abra e execute novamente.
4. Selecione a opção **Listar**. Seus dados estarão lá. 

## 📂 Estrutura
- `Conta.java`: Objeto de domínio.
- `BancoDados.java`: Lógica de I/O (Entrada/Saída).
- `AppBanco.java`: Ponto de entrada do sistema.