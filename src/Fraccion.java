public class Fraccion {
  int numerator = 0;
  int denominator = 0;

  public Fraccion(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public void setDenominator(int denominator) {
    this.denominator = numerator;
  }

  public int getNumerator() {
    return this.numerator;
  }

  public int getDenominator() {
    return this.denominator;
  }

  public void add(Fraccion fraccion) {
    this.numerator = this.numerator * fraccion.denominator + fraccion.numerator * this.denominator;
    this.denominator *= fraccion.denominator;
    this.simplify();
  }

  public void substract(Fraccion fraccion) {
    this.numerator = this.numerator * fraccion.denominator - fraccion.numerator * this.denominator;
    this.denominator *= fraccion.denominator;
    this.simplify();
  }

  public void multiply(Fraccion fraccion) {
    this.numerator *= fraccion.numerator;
    this.denominator *= fraccion.denominator;
    this.simplify();
  }

  public void divide(Fraccion fraccion) {
    this.numerator *= fraccion.denominator;
    this.denominator *= fraccion.numerator;
    this.simplify();
  }

  public int mcd() {
    int numerator = Math.abs(this.numerator);
    int denominator = Math.abs(this.denominator);
    int resto =0;
    if (denominator == 0) {
      return numerator;
    }
    while (denominator != 0) {
      resto = numerator % denominator;
      numerator = denominator;
      denominator = resto;

    }
    return numerator;
  }

  public void simplify() {
    int divisor = this.mcd();

    this.numerator = this.getNumerator() / divisor;
    this.denominator = this.getDenominator()/ divisor;


  }

  public void printFraction() {
    System.out.println(this.getNumerator() + "/" + this.getDenominator());
  }


}
