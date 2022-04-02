package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaTest {

	public static void main(String[] args) {		
		Date hoy = new Date();
		System.out.println("Fecha sin formato: " + hoy);
		SimpleDateFormat  sdt = new SimpleDateFormat("dd/MM/yyyy");		
		System.out.println("Fecha con formato: " + sdt.format(hoy));
		
		System.out.println("Validación de fechas");
		String fechaString = "25/25/2020";
		try {
			sdt.setLenient(false);
			Date fecha = sdt.parse(fechaString);			
			System.out.println(fechaString + ": La fecha es correcta");
			
		} catch (ParseException e) {
			System.out.println(fechaString + ": La fecha es incorrecta");
		}

		System.out.println("Obtener el año de la  fecha: " + sdt.format(hoy));
		Calendar fechaCalendar = Calendar.getInstance();
		fechaCalendar.setTime(hoy);
        int anio = fechaCalendar.get(Calendar.YEAR);
        System.out.println("Año: " + anio );
	}

}

