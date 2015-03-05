package Boletin21;
/**** @author dpazolopez ****/
public class Boletin21 {

    /**@param args the command line arguments
    Hacer un programa que gestione una cola, 
    * para mandar un trabajo a la fotocopiadora y numero de copias.
    */
    public static void main(String[] args) {
        Fotocopiadora b = new Fotocopiadora();
        int op;
        do {
            op = b.menu();
            switch (op) {
                case 1:
                    b.mandar();
                    break;
                case 2:
                    b.numDocumentos();
                    break;
                case 3:
                    b.amosar();
                    break;
                case 4:
                    if (op == 4 && op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 4 && op != 0);
    }
}
