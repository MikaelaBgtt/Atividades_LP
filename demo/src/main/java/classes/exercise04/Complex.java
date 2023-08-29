package classes.exercise04;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real){
        this.real = real;
        this.imaginary = 0;
    }
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getModule(){
        return Math.sqrt(this.real*this.real+this.imaginary*this.imaginary);
    }

    public int getArgument(){
       return (int) Math.round(Math.toDegrees(Math.atan2(imaginary,real)));

    }

    public String getInverseAdd(){
        double realInverso = -real;
        double imagInverso =  -imaginary;
        return realInverso + " " + imagInverso;                                                                                                                                                                                                                
    }

    public double getDivisao(double z2){
        
        return getModule()/z2;
    }


    public double getMult(double z2){

        return getModule()*z2;
    }

    public double getAdc(double z2){
        return getModule()+z2;
    }

    public double getSub(double z2){
        return getModule()-z2;
    }

    public String toString(){

        String st1 = Double.toString(this.real);
        String st2 = Double.toString(this.imaginary);

        return st1+" + "+st2+"i";

    }

}
