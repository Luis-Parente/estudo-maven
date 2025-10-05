package br.com.alura.service;

import br.com.alura.model.Produto;
import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class TraduzService {

    public void traduzirProduto(Produto produto) {
        produto.setName(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName()));
        produto.setDescription(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription()));
        produto.setCategory(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getCategory()));
    }
}
