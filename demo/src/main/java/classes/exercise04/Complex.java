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



    

}
