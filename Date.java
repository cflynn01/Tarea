import java.util.Scanner;
public class Date{
	int day;
	int month;
	int year;
	
	boolean isSameYear(Date, other){
		if(this.year == other.getYear()){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	boolean isSameMonth(Date, other){
		if(this.month == other.getMonth()){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	boolean isSameDay(Date, other){
		if(this.day == other.getDay()){
			return true;
		}
		
		else{
			return false;
		}
	}
}

void setYear(int year){
	this.year = year;
}

void setMonth(int month){
	this.month = month;
}

void setDay(int day){
	this.day = day;
}
int getYear(){
	return this.year;
}

int getMonth(){
	return this.month;
}

int getDay(){
	return this.day;
}

public Date(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
}
public void checkMonth{
	
	int month = 0;
	String = monthString;
	Scanner input = new Scanner(System.in);
	month = input.nextInt();
	switch (month){
		case 1: monthString = "January";
				break;
				
		case 2: monthString = "February";
				break;
				
		case 3: monthString = "March";
				break;
				
		case 4: monthString = "April";
				break;
				
		case 5: monthString = "May";
				break;
				
		case 6: monthString = "June";
				break;
		
		case 7: monthString = "July";
				break;
				
		case 8: monthString = "August";
				break;
				
		case 9: monthString = "September";
				break;
				
		case 10: monthString = "October";
				break;
				
		case 11: monthString = "November";
				break;
				
		case 12: monthString = "December";
				break;
	}
	
	System.out.println(monthString);
}


public void checkDay{

	int month = 0;
	int day = 0;
	Scanner input = new Scanner(System.in);
	month = input.nextInt();
	day = input.nextInt();
	switch (month){
	
		case 1 3 5 7 8 10 12: if(day =< 31){
				System.out.println("Si, el dia es correcto")
				}
				
				else{
				System.out.println("El dia no es correcto");
				}
				
		case 2: if(day =< 29){
				System.out.println("Si, el dia es correcto")
				}
				
				else{
				System.out.println("El dia no es correcto");
				}
				
		case 4 6 9 11: if(day =< 30){
				System.out.println("Si, el dia es correcto")
				}
				
				else{
				System.out.println("El dia no es correcto");
				}
}


public void checkSeason{

	int month = 0;
	String = seasonString;
	Scanner input = new Scanner(System.in);
	month = input.nextInt();
	switch (month){
	
		case 2 3 4: seasonString = "Spring";
					break;
					
					
		case 5 6 7: seasonString = "Summer";
					break;
					
		case 8 9 10: seasonString = "Autumn";
					break;
					
		case 11 12 1: seasonString = "Winter";
					break;

}



public void monthsLeftInYear{
	
	int month = 0;
	int date = 0;
	int total = 0;
	Scanner input = new Scanner(System.in);
	
	date = input.nextInt();
	month = input.nextInt();
	
	for(month =< 12){
		total =  12 - month;
		System.out.println("Number of months left: " + total);
	}
}


public void printDate{
	
	int date = 0;
	int month = 0;
	int year = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce el dia: ");
	date = input.nextInt();
	System.out.println("Introduce el mes: ");
	month = input.nextInt();
	System.out.println("Introduce el anyo: ");
	year = input.nextInt();
	
	System.out.println(date + "/" + month + "/" + year);
	
}

public void displayDays{
	int date = 0;
	int month = 0;
	int year = 0;
	int remainder = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce el dia: ");
	date = input.nextInt();
	System.out.println("Introduce el mes: ");
	month = input.nextInt();
	System.out.println("Introduce el anyo: ");
	year = input.nextInt();
	
	for(month = 1; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 2; i < 1; i++){
		remainder = 28 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 3; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 4; i < 1; i++){
		remainder = 30 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 5; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 6; i < 1; i++){
		remainder = 30 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 7; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 8; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 9; i < 1; i++){
		remainder = 30 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 10; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
	
	for(month = 11; i < 1; i++){
		remainder = 30 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}

	for(month = 12; i < 1; i++){
		remainder = 31 - date;
		System.out.println("Numero de dias hasta el proximo mes: " + remainder);
	}
}


public void similarMonths{
	int date = 0;
	int month = 0;
	int year = 0;
	int i = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce el mes: ");
	month = input.nextInt();	
	
	for(month = 1; i < 1; i++){
		System.out.println("Meses similar: Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
	}
	
	for(month = 2; i < 1; i++){
		System.out.println("No hay meses similares");
	}
	
	for(month = 3; i < 1; i++){
		System.out.println("Meses similar: Enero, Mayo, Julio, Agosto, Octubre y Diciembre");
	}
	
	for(month = 4; i < 1; i++){
		System.out.println("Meses similar: Junio, Septiembre y Noviembre");
	}
	
	for(month = 5; i < 1; i++){
		System.out.println("Meses similar: Enero, Marzo, Julio, Agosto, Octubre y Diciembre");
	}
	
	for(month = 6; i < 1; i++){
		System.out.println("Meses similar: Abril, Septiembre y Noviembre");
	}
	
	for(month = 7; i < 1; i++){
		System.out.println("Meses similar: Enero, Marzo, Agosto, Octubre y Diciembre");
	}
	
	for(month = 8; i < 1; i++){
		System.out.println("Meses similar: Enero, Marzo, Julio, Octubre y Diciembre");
	}
	
	for(month = 9; i < 1; i++){
		System.out.println("Meses similar: Abril, Junio y Noviembre");
	}
	
	for(month = 10; i < 1; i++){
		System.out.println("Meses similar: Enero, Marzo, Mayo, Julio, Agosto y Diciembre");
	}
	
	for(month = 11; i < 1; i++){
		System.out.println("Meses similar: Abril, Junio y Septiembre");
	}

	for(month = 12; i < 1; i++){
		System.out.println("Meses similar: Enero, Marzo, Mayo, Julio, Agosto y Octubre");
	}
}

public void numOfDays{
	
	int date = 0;
	int month = 0;
	int total = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce el dia: ");
	date = input.nextInt();
	System.out.println("Introduce el mes: ");
	month = input.nextInt();
	
	for(month = 1; month <=12; month++){
		total = date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 2; month <=12; month++){
		total = 31 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 3; month <=12; month++){
		total = 59 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 4; month <=12; month++){
		total = 90 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 5; month <=12; month++){
		total = 120 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 6; month <=12; month++){
		total = 151 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 7; month <=12; month++){
		total = 181 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 8; month <=12; month++){
		total = 212 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 9; month <=12; month++){
		total = 243 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 10; month <=12; month++){
		total = 273 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 11; month <=12; month++){
		total = 303 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
	
	for(month = 12; month <=12; month++){
		total = 333 + date;
		System.out.println("Numero de dias hasta el primero de Enero: " + total);
	}
}

public void sameDateGenerator{
	
	int date = 0;
	int month = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce el dia: ");
	date = input.nextInt();
	System.out.println("Introduce el mes: ");
	month = input.nextInt();
	
	
}


public void {
	
}


public void multiplicationTable{
	int numero = 0;
	int count = 0;
	int total = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Inserta un numero: ");
	numero = input.nextInt();
	for(int i = 0; i < 12; i++){
		total = numero * i;
		System.out.println(numero + " multiplied by" + i + "Valor :" + total);
	}
}


public void temperatureTable{
	int fahrenheit = -30;
	int celcius = 0;
	
	for(fahrenheit < 30){
		celcius = fahrenheit * 5/9;
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
		fahrenheit = fahrenheit + 5;
	}
}

