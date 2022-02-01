import java.io.File;

public interface Compression {
    public void compress(File comp_file);

    public void decompress(File decomp_file);
}
