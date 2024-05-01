/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class XDate {
     static SimpleDateFormat format = new SimpleDateFormat();

    public static Date toDate(String date, String pattern) {
        try {
            format.applyPattern(pattern);
            return format.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    public static String toString(Date date, String pattern) {
        format.applyPattern(pattern);
        return format.format(date);
    }
    public void CheckDate(String date){
        format.applyPattern("dd-MM-yyyy");
        try {
            Date ngay = format.parse(date);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Vui Lòng Nhập Đúng Ngày Sih");
        }
    }
}
