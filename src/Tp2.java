public class Tp2 {
    public static void main(String [] args) {
        Complejo c1 = new Complejo(5,4);
        Complejo c2 = new Complejo(5,4);
        c1.suma(c2);
        System.out.println(c1.getImaginario());

        Fraccion a = new Fraccion(5,4);
        Fraccion b = new Fraccion(20, 5);


        a.add(b);
        a.printFraction();



    }
}
