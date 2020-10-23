package ru.mirea.canh.pr10.task1;

public class Complex {
    private int real;
    private int image;

    public Complex(){}
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Complex addComplex(Complex c) {
        return new Complex(real + c.real, image + c.image);
    }

    public Complex subComplex(Complex c) {
        return new Complex(real - c.real, image - c.image);
    }

    public Complex multiComplex(Complex c) {
        return new Complex(real * c.real - image * c.image, real * c.image + image * c.real);
    }

    public Complex divisionComplex(Complex c) {
        int de = c.real * c.real + c.image * c.image;
        return new Complex((real * c.real + image * c.image)/de, -(real * c.image - image * c.real)/de);
    }

    @Override
    public String toString() {
        return "[Complex: " + real + " + " + image + "i]";
    }
}
