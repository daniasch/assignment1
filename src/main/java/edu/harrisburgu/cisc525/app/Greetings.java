package edu.harrisburgu.cisc525.app;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Greetings class
 * 
 */
public class Greetings {
    
    public String time(){
       Calendar cal = Calendar.getInstance();
       SimpleDateFormat dateTime = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");
       String strDateTime = dateTime.format(cal.getTime());
       return strDateTime;
        
    }
    
    public String hello(String name) throws UnknownHostException {
       return String.format("Hello, %s from %s/%s", name, 
                            InetAddress.getLocalHost().getHostName(),
                            ManagementFactory.getRuntimeMXBean().getName());
                            
   }
}
