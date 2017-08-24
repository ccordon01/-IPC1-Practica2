
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loscordonhdez
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer st1 = new StringTokenizer("#sdf$sdf", "#$");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        String numeros = "Carpeta1.txt";
        String n = ".+txt";
        String[] numerosComoArray = numeros.split(n);
        for (int i = 0; i < numerosComoArray.length; i++) {
            System.out.println(numerosComoArray[i]);
        }
        System.out.println(numerosComoArray.length);
        System.out.println(numeros.substring(0, numeros.length() - 1));
        /*javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
        jF1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jF1.setFileFilter(new FileNameExtensionFilter("*.txt", ".txt"));
        jF1.setCurrentDirectory(new File("C:\\Users\\Loscordonhdez\\Documents\\"));
        String ruta = "";
        try {
            if (jF1.showSaveDialog(null) == jF1.APPROVE_OPTION) {
                ruta = jF1.getSelectedFile().getAbsolutePath();
                System.out.println(ruta.toString());
//Aqui ya tiens la ruta,,,ahora puedes crear un fichero n esa ruta y escribir lo k kieras... 
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        int n23=0;
        StringTokenizer st12 = new StringTokenizer("C:\\Users\\Loscordonhdez\\Documents\\Proyecto1", "\\");
        while (st12.hasMoreTokens()) {
            n23++;
            System.out.println(st12.nextToken());
        }
        System.out.println(n23);
        String numerow="C:\\Users\\Loscordonhdez\\Documents\\Proyecto1\\Carpeta1\\Carpeta2\\Archivo3.txt";
        String nml="\\\\";
        String[] numerosa = numerow.split(nml);
        String nm="";
        for (int i = n23; i < numerosa.length-1; i++) {
            nm=nm+"\\"+numerosa[i];
        }
        System.out.println(nm);
        System.out.println(numerow.replaceAll("users", "Carlos"));
    }
}
