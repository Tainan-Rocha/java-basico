package edu.tainan.oop.pilares_opp;

// Definindo uma classe abstrata
public abstract class Veiculo {

        // Atributo
        private String chassi;
        
        // Getter
        public String getChassi() {
            return chassi;
        }

        // Setter
        public void setChassi(String chassi) {
            this.chassi = chassi;
        }

        // Definindo um metodo abstrato. Basicamente obriga as classes que herdam declararem esse metodo.
        public abstract void ligar();
}
