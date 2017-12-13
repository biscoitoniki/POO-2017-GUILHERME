package exerciciopoo;

public class questao1 {
    //1º
    public class Empregado {
        
        private double salario = 500;
        
        public double getSalario() {
            return salario;
        }
        
        //A)
        public double calcSalario() {
            return getSalario();
            }
        }
    
    
    
    
        //B)
        public class Diarista extends Empregado {
            public double getSalario(){
                return getSalario()/30;
            }
        }
    
        //C)
        public class Horista extends Diarista {
            public double getSalario(){
                return getSalario()/24;
        }
    }
}

