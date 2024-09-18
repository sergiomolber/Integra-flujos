import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Ruta al directorio que contiene los archivos de texto
        String directorioTxt = "D:\\Integra\\Integra-flujos\\HubDePagos_Flujo4.1\\Archivo"; // Asegúrate de actualizar esta ruta

        // Obtener la fecha actual en formato YYYYMMDD
        String fechaActual = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

        // Procesar todos los archivos en el directorio
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directorioTxt), "*.1")) {
            for (Path path : stream) {
                procesarArchivo(path, fechaActual);
            }
            System.out.println("Fechas actualizadas correctamente en todos los archivos.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void procesarArchivo(Path path, String fechaActual) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            List<String> lineas = Files.readAllLines(path, charset);

            // Capturar valores en posiciones 25-32
            Set<String> fechasCapturadas = new HashSet<>();
            for (String linea : lineas) {
                if (linea.length() >= 32) { // Asegurarse de que la línea sea lo suficientemente larga
                    String fechaCapturada = linea.substring(23, 31);
                    fechasCapturadas.add(fechaCapturada);
                }
            }

            // Reemplazar las fechas capturadas con la fecha actual en todo el archivo
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                for (String fechaCapturada : fechasCapturadas) {
                    if (linea.contains(fechaCapturada)) {
                        linea = linea.replace(fechaCapturada, fechaActual);
                    }
                }
                lineas.set(i, linea);
            }

            // Escribir el contenido actualizado de vuelta en el archivo
            Files.write(path, lineas, charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
