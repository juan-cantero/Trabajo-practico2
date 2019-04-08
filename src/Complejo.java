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
}
