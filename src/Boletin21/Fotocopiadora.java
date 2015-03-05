package Boletin21;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class Fotocopiadora {

    public ArrayList<Documentos> copia = new ArrayList<Documentos>();
    Documentos obxaux = new Documentos();

    public Fotocopiadora() {
    }

    public int menu() {
        int op = JOptionPane.showOptionDialog(
                null, "Selecciona una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Mandar Documento",
                    "Número de trabajos",
                    "Imprimir trabajos",
                    "Exit"},
                "Exit");
        return op + 1;
    }

    public void mandar() {
        String c = JOptionPane.showInputDialog(null, "Documentos: ");
        int aux = Integer.parseInt(JOptionPane.showInputDialog("Numero de copias?:"));
        copia.add(new Documentos(aux, c));

    }

    public int numDocumentos() {
        int tam = copia.size();
        JOptionPane.showMessageDialog(null,tam);
        return tam;
    }

    // NAS COLAS O 1º EN ENTRAR É O PRIMEIRO EN SAIR . E PARA TRABALLAR CO ELEMENTO TEÑO QUE SACALO( borralo ) da cola
    public void amosar() {
        if(copia.isEmpty())
            JOptionPane.showMessageDialog(null,"No quedan documentos por imprimir");
        else{
        obxaux = copia.remove(0);
        for (int i = 0; i < obxaux.nc; i++) {
            System.out.println(obxaux.doc);
        }
    }
    }

    /*  public void mostrar(Documentos docu) {
     for(int i=0; i<docu.nc; i++)
     System.out.println(docu.doc);
     } SE NON FOSE UNHA COLA */

    /*  public void porImprimir() {
     int aux = 0;
     for (Documentos ex : copia) {
     if (ex.getDocumento() == false) {
     aux += 1;
     }
     }
     System.out.println("Quedan " + aux + " correos por leer");
     }

     public void delete() {
     int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
     copia.remove(p);
     }*/
}
