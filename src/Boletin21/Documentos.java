package Boletin21;

/**** @author dpazolopez ****/
public class Documentos {

    int nc;     
    String doc;

    public Documentos() {
    }
    
    public Documentos(int nc, String doc) {
        this.nc = nc;
        this.doc = doc;
    }

    public void setNumeroCopias() {
        this.nc = nc;
    }

    public void setDocumento() {
        this.doc = doc;
    }

    public int getNumeroCopias() {
        return nc;
    }

    public String getDocumento() {
        return doc;
    }

    @Override
    public String toString() {
        return "Documentos{" + "numero de copias=" + nc + ", documento=" + doc + '}';
    }

}
