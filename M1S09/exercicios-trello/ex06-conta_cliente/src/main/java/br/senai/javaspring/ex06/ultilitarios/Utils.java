package br.senai.javaspring.ex06.ultilitarios;


import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Utils {
    static NumberFormat format = new DecimalFormat("R$ #,##0.00");
//    Receber o valor e mostrar em String
    public static String doubleToString(Double d){
        return format.format(d);
    }

    public static String linha(){
        return "\n==================================================\n";
    }
    public static String linhaN(String n){
        String l = "\n========== Clente" + n + "=============\n";
        return l;
    }
}
