/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.text.DateFormat;
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
}
