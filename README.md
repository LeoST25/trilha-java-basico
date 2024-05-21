## Anatomia de Classes

### Sintaxe de declaração de classe:


```public class MinhaClasse {
    
    // SEU CÓDIGO AQUI

}
Declaração de método:

public class MinhaClasse {
    
    // CORPO DA CLASSE

    public static void main (String [] args) {

        // CORPO DO MÉTODO main

    }

}
Padrão de Nomenclatura
camelCase
PascalCase
UPPERCASE

Onde usar:

camelCase - para variáveis
PascalCase - para nome de arquivo e classes; se caso for palavra composta, sempre a primeira letra começa sendo MAIÚSCULA.
UPPERCASE - para variáveis que nunca serão mudadas; isso serve mais para o próprio programador entender o código.
Declaração de variáveis
Estrutura:
Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

Indentação
Uma maneira de entender o código com facilidade

Exemplo:

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}

Organização de arquivos
Nome Simples: Nome do arquivo, exemplo ContaBanco.
Nome Qualificado: Nome do pacote + nome do arquivo, exemplo: com.suaempresa.ContaBanco.

Java Beans
Escrever algoritmos legíveis a nível de ser compreendidos por qualquer programador e até mesmo você. Exemplos:

*Não recomendado*

double salMedio = 1500.23;  // variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com"; // confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH"; // se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

*Recomendado*


double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String[] emails = {"aluno@escola.com", "professor@escola.com"};
String meuNome = "JOSEPH";
