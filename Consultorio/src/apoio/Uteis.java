/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Leandro
 */
public class Uteis {

    public String FormatarDatayyyyMMdd(Calendar calendario) {
        calendario.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        //      System.out.println(calendario.getTime());
        // Output "Wed Sep 26 14:23:28 EST 2012"

        String formatted = format1.format(calendario.getTime());
        // System.out.println(formatted);
        return formatted;
    }

    public String FormatarDatayyyyMMdd(Date data) {

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        //      System.out.println(calendario.getTime());
        // Output "Wed Sep 26 14:23:28 EST 2012"

        String formatted = format1.format(data);
        //   System.out.println(formatted);
        return formatted;
    }

    public String FormatarDatayyyyMMddString(String data) {

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        //      System.out.println(calendario.getTime());
        // Output "Wed Sep 26 14:23:28 EST 2012"

        String formatted = format1.format(data);
        //   System.out.println(formatted);
        return formatted;
    }

    public Date FormatarDatayyyyMMdd(String data) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(data);
        return date;
    }

    public String FormatarHora(String data) {
        String dataHora[] = new String[2];
        dataHora = data.split(" ");
        String hora[] = new String[3];
        hora = dataHora[1].split(":");
        return hora[0] + ":" + hora[1];
    }
    
        public String FormatarData(String data) {
        String dataHora[] = new String[2];
        dataHora = data.split(" ");
        return dataHora[0];
    }

    public String FormatarDataddMMyyyy(String data) {
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        //      System.out.println(calendario.getTime());
        // Output "Wed Sep 26 14:23:28 EST 2012"

        String formatted = format1.format(data);
        //   System.out.println(formatted);
        return formatted;
    }

    public String FormatarDataddMMyyyy(Date data) {
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        //      System.out.println(calendario.getTime());
        // Output "Wed Sep 26 14:23:28 EST 2012"
        String formatted = format1.format(data);
        //   System.out.println(formatted);
        return formatted;
    }

}
