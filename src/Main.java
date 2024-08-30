import java.util.regex.*;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args){

        try{
            FileReader ArchivoDeLectura = new FileReader("CURPS.txt");
            BufferedReader LeerArchivo = new BufferedReader(ArchivoDeLectura);
            System.out.println("1");
            String curp;
            String patron = "^[A-Z]{4}\\d{6}[HM]{1}[A-Z]{5}[0-9A-Z]{2}$";
            int linea = 0;
            Pattern patron1 = Pattern.compile(patron);
            while((curp=LeerArchivo.readLine())!=null){
                 Matcher comparador = patron1.matcher(curp);
                 linea++;

                 if(comparador.matches()){
                     System.out.println("La Curp " + curp + " es Valida ");
                 }else{
                     System.out.println("La Curp " + curp + " ubicada en la linea "+ linea+" no es Valida ");
                 }


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}