package br.com.rsinet.hub_tdd.provaTDD.Utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

 

public class Generator {
    public static String dataHorParaArquvio() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
        
    }

 

}