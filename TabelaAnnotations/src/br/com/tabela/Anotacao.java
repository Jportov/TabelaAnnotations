package br.com.tabela;

public class Anotacao {
    @Tabela(valor = "cliente")
    public class Cliente {
        private String nome;
        private String email;
        
        // Construtor, getters e setters
        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    }
}
