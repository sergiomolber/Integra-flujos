package com.integra.ach.utils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Robot {

    public void hacerTap1() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerTap2() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerTap3() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerTap4() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerEnter() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void hacerControlM() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void procesarCola() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void reload() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
    }

    public void dobleClick() throws IOException, AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void hacerEscape() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public void alt_tab() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void alt_F4() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void control_F4() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public static void control_Menos() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }

    public static void control_Mas() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void control_J() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    // METODOD PARA GUARDAR LA FECHA DEL SISTEMA

    public static String fechaHora() {

        // TOMAMOS LA FECHA DEL SISTEMA

        LocalDateTime fechaSistema = LocalDateTime.now();

        // DEFINIR FORMATO FECHA

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // DAR FORMATO A LA FECHA DEL SISTEMA

        String formatFecha = fecha.format(fechaSistema);

        return formatFecha;
    }


    public static String horaMenos5Minutos() {
        // TOMAMOS LA HORA DEL SISTEMA
        LocalDateTime fechaSistema = LocalDateTime.now();

        // RESTAR 5 MINUTOS
        LocalDateTime horaMenos5Minutos = fechaSistema.minusMinutes(5);

        // DEFINIR FORMATO SOLO HORA
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        // DAR FORMATO A LA HORA
        String formatHora = formatoHora.format(horaMenos5Minutos);

        return formatHora;
    }

    public static String horaMas5Minutos() {
        // TOMAMOS LA HORA DEL SISTEMA
        LocalDateTime fechaSistema = LocalDateTime.now();

        // SUMAR 5 MINUTOS
        LocalDateTime horaMas5Minutos = fechaSistema.plusMinutes(10);

        // DEFINIR FORMATO SOLO HORA
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        // DAR FORMATO A LA HORA
        String formatHora = formatoHora.format(horaMas5Minutos);

        return formatHora;
    }

    public static void main(String[] args) {
        System.out.println(horaMas5Minutos());
        System.out.println(horaMenos5Minutos());
    }

    public static String generarNombreAleatorio(int tamanno) {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder nombreAleatorio = new StringBuilder();
        for (int i = 0; i < tamanno; i++) {
            int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
            char caracterAleatorio = caracteresPermitidos.charAt(indiceAleatorio);
            nombreAleatorio.append(caracterAleatorio);
        }
        return nombreAleatorio.toString();
    }
}
