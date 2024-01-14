package Exercicios.Exe2;

public class Processos {
        private int id;
        private String titulo;

        public Processos(int id,String titulo){
            setId(id);
            setTitulo(titulo);
        }
        
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
}
