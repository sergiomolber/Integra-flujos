package com.integra.ach.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LectorExcelTest {

    public static void main(String[] args) {
        LectorExcel lector = new LectorExcel();
        String excelFilePath = "src/test/resources/Data/Data_CuentasAdministradoras.xlsx";  // Usa una ruta relativa
        String sheetName = "CrearCuentasAdministradoras";           // Cambia esto al nombre de tu hoja

        try {
            List<Map<String, String>> data = lector.getData(excelFilePath, sheetName);
            for (Map<String, String> row : data) {
                for (Map.Entry<String, String> entry : row.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}

