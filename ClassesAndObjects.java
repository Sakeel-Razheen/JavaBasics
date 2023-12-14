package com.Javacourse;

public class ClassesAndObjects {

	public static void main(String[] args) {
		Bajaj Pulsar1=new Bajaj("Ns","Black",200,2023);
		System.out.println("Pulsar1 -");
		System.out.println(Pulsar1.Model);
		System.out.println(Pulsar1.Colour);
		System.out.println(Pulsar1.Cc);
		System.out.println(Pulsar1.Year);
		
		Bajaj Pulsar2=new Bajaj("As","Red",200,2021);
		System.out.println();
		System.out.println("Pulsar2 -");
		System.out.println(Pulsar2.Model);
		System.out.println(Pulsar2.Colour);
		System.out.println(Pulsar2.Cc);
		System.out.println(Pulsar2.Year);
		
		Bajaj Pulsar3=new Bajaj("Rs","Yellow",200,2022);
		System.out.println();
		System.out.println("Pulsar3 -");
		System.out.println(Pulsar3.Model);
		System.out.println(Pulsar3.Colour);
		System.out.println(Pulsar3.Cc);
		System.out.println(Pulsar3.Year);
		
		Bajaj random=new Bajaj();
		System.out.println(random.Model);
	}
	static class Bajaj{
		String Model;
		String Colour;
		int Cc;
		int Year;
		
		Bajaj(){
			this("Default","Default",0,0000);
		}
		
     Bajaj(String Model,String Colour,int Cc,int Year){
    	 this.Model=Model;
    	 this.Colour=Colour;
    	 this.Cc=Cc;
    	 this.Year=Year;
     }
	}
}
