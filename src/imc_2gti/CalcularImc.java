
package imc_2gti;

public class CalcularImc {
    // variaveis de instancia
    private double peso;
    private double altura;
    private char sexo;
    private double imc;
    private String classificacao;
    
    // construtor
    public void CalcularImc() {
        this.peso = 0;
        this.altura = 0;
        this.sexo = 'F';
        this.imc = 0;
        this.classificacao = "";
    }
    
    // metodos modificadores/acessores
    // metodos set's / get's
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public double getImc() {
        return this.imc;
    }
    
    public String getClassificacao() {
        return this.classificacao;
    }
    
    private void calcularImc() {
        this.imc = this.peso / Math.pow(altura, 2);
    }
    
    private void verificarImc(){
        if (this.sexo == 'F') {
            // solução para sexo feminino
            if (this.imc < 19.1) {
                this.classificacao = "ABAIXO DO PESO";
            } else if (this.imc < 25.8) {
                this.classificacao = "PESO IDEAL";
            } else if (this.imc < 27.3) {
                this.classificacao = "POUCO ACIMA DO PESO";
            } else if (this.imc < 32.3) {
                this.classificacao = "ACIMA DO PESO";
            } else {
                this.classificacao = "OBESIDADE";
            }
        }
        else if (this.sexo == 'M') {
            // solução para sexo masculino
            // -------------------------------
            if (this.imc < 20.7) {
                this.classificacao = "ABAIXO DO PESO";
            } else if (this.imc < 26.4) {
                this.classificacao = "PESO IDEAL";
            } else if (this.imc < 27.8) {
                this.classificacao = "POUCO ACIMA DO PESO";
            } else if (this.imc < 31.1) {
                this.classificacao = "ACIMA DO PESO";
            } else {
                this.classificacao = "OBESIDADE";
            }
            
            // -------------------------------
            
            
        } else {
            this.classificacao = "Sexo INVALIDO";
        }
    }
    
    public void calcularEverificarImc() {
        calcularImc();
        verificarImc();
    }
}
