package br.com.alura;

import br.com.alura.model.Produto;
import br.com.alura.service.TraduzService;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TraduzService tradutor = new TraduzService();

        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Produto.class).build().parse();

        for (Produto produto : produtos) {
            System.out.println(produto);
            tradutor.traduzirProduto(produto);
            System.out.println(produto);
        }

    }
}
