package dbConexion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		    String d1 = "9-30-2023";
	        String d2 = "9-05-2023";
	        String pattern = "MM-dd-yyyy";
	        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	 
	        try {
	            java.util.Date date1 =  sdf.parse(d1);
	            java.util.Date date2 =  sdf.parse(d2);
	 
	            // obtener la diferencia entre dos fechas en minutos
	            long elapsedms = date1.getTime() - date2.getTime();
	            long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);
	            
	            int dias = (int) (diff / 1440);
	            
	            System.out.println("Minutos: " + diff + " Dias: " + dias);
	        }
	        catch (ParseException e) {
	            e.printStackTrace();
	        }

	}

}
