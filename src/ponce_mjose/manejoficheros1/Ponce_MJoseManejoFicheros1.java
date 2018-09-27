
package ponce_mjose.manejoficheros1;

import java.io.File;
import java.io.IOException;


public class Ponce_MJoseManejoFicheros1 {

    public static void main(String[] args) throws IOException {
        //**ACTIVIDAD 1**
        String dir = ".";// directorio actual
        File f = new File(dir);
        String[] archivos = f.list();
        System.out.printf("**ACTIVIDAD 1** \n Ficheros en el directorio actual: %d %n", archivos.length);
        File[] listado = f.listFiles();
        for (int i = 0; i < listado.length; i++) {
            System.out.println(listado[i]);
        }

        //**ACTIVIDAD 2**
        File f2= new File(dir, "NUEVODIR");
        f2.mkdir();//crea el fichero NUEVODIR si no existe
        
        File f3=new File("NUEVODIR", "fichero1.txt");
        f3.createNewFile();//crea el fichero1.txt si no existe
        
        File f4=new File("NUEVODIR", "fichero2.txt");
        f4.createNewFile();//crea el fichero2.txt si no existe
        
        File f5=new File("NUEVODIR","fichero2Renombrado.txt");
        f4.renameTo(f5);
        //renombra el fichero2.txt por fichero2Renombrado.txt
        //El listado sería el siguiente:
        String dir2=".";
        File nuevoFile= new File(dir2);
        File[] listado2=nuevoFile.listFiles();
        String[] archivos2=nuevoFile.list();
        System.out.printf("**ACTIVIDAD 2** \n Ficheros con el nuevo directorio: %d %n", archivos2.length);
        for (int i = 0; i < listado2.length; i++) {
            System.out.println(listado2[i]);
        }
        
        
        //**ACTIVIDAD 3**
        //Eliminar el directorio NUEVODIR
        f2.delete();
        System.out.println("**ACTIVIDAD 3** \n"+"¿Se ha eliminado el directorio NUEVODIR?: "+f2.delete());        
        //No se puede eliminar el directorio. Supongo que porque antes habrá que elimiar los ficheros.
        //Para solucionarlo eliminaremos primero los ficheros y luego el directorio:
        
        f5.delete();
        f4.delete();
        f3.delete();
        f2.delete();
        
        //El listado quedaría como al principio
        String dir3=".";
        File nuevoFile2= new File(dir3);
        File[] listado3=nuevoFile2.listFiles();
        String[] archivos3=nuevoFile2.list();
        System.out.printf("Ficheros en el directorio actual: %d %n", archivos3.length);
        for (int i = 0; i < listado3.length; i++) {
            System.out.println(listado3[i]);
        }
        
   
      
        
    }

}
