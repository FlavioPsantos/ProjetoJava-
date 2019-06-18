/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Flávio
 */
public class FormatFactory {
    public static String FormatDate(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        return sdf.format(data);
    }
    public static String  FormatDecimal(Double Valor) {
        DecimalFormat df = new DecimalFormat("#0,00");
        return df.format(Valor);
    }
}
