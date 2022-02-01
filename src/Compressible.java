import java.io.File;

public class Compressible {
    private File in_file;
    private File comp;
    private File decomp;

    public Compressible(File in_file){
        this.in_file = in_file;
    }

    public File getIn_File(){
        return in_file;
    }

    public File getComp(){
        return comp;
    }

    public File getDecomp(){
        return decomp;
    }

    public void setComp(File comp) {
        this.comp = comp;
    }

    public void setDecomp(File decomp) {
        this.decomp = decomp;
    }

    public static void main (String[] args){

    }
}
