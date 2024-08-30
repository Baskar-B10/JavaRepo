package com.program.basic;// Java program to construct the complex number

class ComplexNumber {

	// variables to hold real and imaginary part of complex
	// number
	int real, image;

	// Constructor which will be used while creating complex
	// number
	public ComplexNumber(int r, int i)
	{
		this.real = r;
		this.image = i;
	}

	// function to print real number
	public void showC()
	{
		System.out.println(this.real + " +i " + this.image);
	}

    // we will implement this function for addition
    public static  ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res = new ComplexNumber(0,0); //creating blank complex number

		// adding real parts of both complex numbers
		res.real = n1.real + n2.real;

		// adding imaginary parts
		res.image = n1.image + n2.image;

		// returning result
		return res;

	}

	public static void main(String[] args) {
		ComplexNumber n1= new ComplexNumber(5,5);
		ComplexNumber n2= new ComplexNumber(5,5);
		add(n1,n2).showC();
	}
}
