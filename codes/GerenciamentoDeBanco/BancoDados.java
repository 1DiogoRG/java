import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {
    private static final String ARQUIVO = "contas.dat";

    public static void salvar(List<Conta> contas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(contas);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Conta> carregar() {
        File file = new File(ARQUIVO);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (List<Conta>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
