package br.com.tabela;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definição da anotação Tabela
@Retention(RetentionPolicy.RUNTIME) // A anotação será mantida em tempo de execução
@Target(ElementType.TYPE) // A anotação pode ser aplicada a classes ou interfaces
public @interface Tabela {
    String valor(); // O nome da tabela será um atributo de String
}


