/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author DELL
 */
public class XNumber {
    public static String EpSo(Float so){
        Locale locale = new Locale("en", "EN");
        String pattern = "###,###,###";
        DecimalFormat dcf = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        dcf.applyPattern(pattern);
        String So1 = dcf.format(so);
        return So1;
    }
}
