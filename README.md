# Projeto: Cálculo de Média Ponderada para Universidades

Este projeto em Java calcula a média ponderada das notas do ENEM para diferentes universidades, com base nos pesos especificados por cada instituição e compara as médias com as notas de corte para vagas de PCD (Pessoas com Deficiência). Ele auxilia estudantes a identificarem suas melhores opções de universidades com base em suas notas.

## Funcionalidades

- Calcula a média ponderada das notas do ENEM com base nos pesos de cada universidade.
- Compara a média calculada com as notas de corte para vagas PCD.
- Exibe informações detalhadas sobre as médias e notas de corte de cada universidade.
- Indica se o estudante está acima ou abaixo da nota de corte.

## Estrutura do Projeto

### Arquivos Principais

- `Main.java`: Implementação do cálculo das médias ponderadas e exibição das melhores opções.
- `PrimeiroDia.java`: Extensão do projeto que inclui a comparação com as notas de corte para PCD.

### Entrada de Dados

- Notas do ENEM:

  - Redação: `920.00`
  - Natureza: `639.80`
  - Humanas: `701.90`
  - Linguagens: `635.40`
  - Matemática: `691.80`

- Pesos por universidade: Um mapa contendo os pesos associados a cada área para diferentes universidades.

- Notas de corte para vagas PCD: Um mapa com as notas de corte de cada universidade.

### Sáida de Dados

Para cada universidade, o programa exibe:

- Nome da universidade.
- Média ponderada calculada.
- Nota de corte para vagas PCD.
- Mensagem indicando se a nota está acima ou abaixo da nota de corte.

## Exemplo de Saída

```
Universidade: UFAL MACEIO
Média Ponderada: 717.60
Nota de Corte PCD: 736.52
Você está abaixo da nota de corte.

Universidade: UFAM AMAZONAS
Média Ponderada: 725.45
Nota de Corte PCD: 739.30
Você está abaixo da nota de corte.

Universidade: UFOB BARREIRAS
Média Ponderada: 750.89
Nota de Corte PCD: 748.10
Você está acima da nota de corte!
```

## Como Executar o Projeto

### Requisitos

- Java JDK 8 ou superior.

### Passos para Execução

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Compile os arquivos Java:

   ```bash
   javac Main.java PrimeiroDia.java SegundoDia.java
   ```

3. Execute os programas:

   ```bash
   java Main
   java PrimeiroDia
   java SegundoDia
   ```

## Personalização

Você pode personalizar:

- As notas do ENEM alterando os valores das variáveis `redacao`, `natureza`, `humanas`, `linguagens` e `matematica`.
- Os pesos de cada universidade no mapa `universidades`.
- As notas de corte no mapa `universidadesNotasCortePCD`.

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções ou novas funcionalidades:

1. Crie um fork do repositório.
2. Crie uma branch para sua modificação:
   ```bash
   git checkout -b minha-modificacao
   ```
3. Realize suas modificações e envie um pull request.

## Licença


---

**Autor:** Gabriela da Silva\
**Contato:** [https://www.linkedin.com/in/gabrielajuniordeveloper/](https://www.linkedin.com/in/gabrielajuniordeveloper/)

