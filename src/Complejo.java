public class Complejo {
    float real = 0;
    float imaginario = 0;
    public Complejo(float real, float imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public float getReal() {
        return real;
    }

    public float getImaginario() {
        return imaginario;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public void setImaginario (float imaginario) {
        this.imaginario = imaginario;
    }

    public void printComplejo(){
        System.out.println(real + " + " + "i" + imaginario);
    }

    public void suma(Complejo complejo) {
        real = real + complejo.real;
        imaginario = imaginario + complejo.imaginario;

    }
     public void resta(Complejo complejo){
        this.real = this.real - complejo.real;
        this.imaginario = this.imaginario - complejo.imaginario;
    }

    public float modulo() {
        return (float)Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginario,2) );
    }

    public float fase() {
        return (float)Math.atan(this.imaginario / this.real)
    }

    public float conjugado() {
        return this.real - this.imaginario;
    }

    public void multiplicar(Complejo complejo) {
        //float multiplicacion;
        //multiplicacion = this.real*(complejo.real + complejo.imaginario)
        return;
    }
    
}
