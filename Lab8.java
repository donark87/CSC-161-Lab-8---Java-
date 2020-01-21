//Donark Patel
//Lab 8
//Car, speed

import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.io.*;

public class Lab8
{

int yearOfCar;
String makeOfCar;
int speedOfCar;

public Lab8(int y, String m, int s)
{
	yearOfCar=y;
	makeOfCar=m;
	speedOfCar=s;
	}


public Lab8()
{
	yearOfCar=2006;
	speedOfCar=0;
	makeOfCar= "";
	}

public void setyearOfCar(int y)

{
	yearOfCar=2006;
	}
public void setmakeOfCar(String m)
{
	makeOfCar=m;
	}
public void setspeedOfCar(int s)
{
	speedOfCar=s;
	}

public int getyearOfCar()
{
	return yearOfCar;
	}
public String getmakeOfCar()
{
	return makeOfCar;
	}
public int getspeedOfCar()
{
	return speedOfCar;
	}
public int accelarate(int s)
{
	speedOfCar=s+1;
	return speedOfCar;
	}
public int brake(int s)
{
	speedOfCar=s-1;
	return speedOfCar;
	}


}//end of class