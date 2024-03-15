import java.io.IOException;
import java.util.Scanner;

public class MainCEP {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.print("Digite seu CEP: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEnd(cep);
            System.out.println(novoEndereco);
            Arquivo gerar = new Arquivo();
            gerar.gerarArquivoJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando.");
        }
    }
}
