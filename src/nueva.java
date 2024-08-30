import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class nueva {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\GRIMM\\IdeaProjects\\Valida Curp\\CURPS.txt"; // Cambia esto por la ruta real de tu archivo

        // Expresión regular para validar CURP
        String curpPattern = "^[A-Z]{4}\\d{6}[HM]{1}[A-Z]{5}[0-9A-Z]{2}$";

        try {
            List<String> curpLines = Files.readAllLines(Paths.get(filePath));
            for (int i = 0; i < curpLines.size(); i++) {
                String curp = curpLines.get(i);
                if (curp.matches(curpPattern)) {
                    System.out.println("CURP válida en línea " + (i + 1) + ": " + curp);
                } else {
                    System.out.println("CURP inválida en línea " + (i + 1) + ": " + curp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

