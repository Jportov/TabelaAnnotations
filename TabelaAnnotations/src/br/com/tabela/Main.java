package br.com.tabela;
import br.com.tabela.Anotacao.Cliente;

public class Main {
    public static void main(String[] args) {
        Class<Cliente> clienteClass = Cliente.class;

        // Verificar se a anotação está presente
        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            // Obter a anotação
            Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);

            // Imprimir o valor da anotação
            System.out.println("Nome da tabela: " + tabelaAnnotation.valor());
        } else {
            System.out.println("A anotação @Tabela não está presente na classe Cliente.");
        }
    }
}