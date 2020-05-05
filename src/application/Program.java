package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date birth = sdf1.parse(sc.next());
		

	}

}
