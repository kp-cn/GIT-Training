package a;

import java.io.*;
public class ParCon
{
	String name;
	int id;
	 
	ParCon(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
public static void main(String [] args)
{
	ParCon p= new ParCon("reshu",954);
	System.out.println("name:" +p.name + "" +  "\n" + "id:" +p.id);
}
}
