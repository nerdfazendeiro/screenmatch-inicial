package br.com.rafaelsilveiradev.screenmatch.principal;

import br.com.rafaelsilveiradev.screenmatch.modelos.Filme;
import br.com.rafaelsilveiradev.screenmatch.modelos.Serie;
import br.com.rafaelsilveiradev.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2000);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
//        lista.add(ouSystem.out.println(item.getNome());
//            if(item instanceof Filme filme){
//                System.out.println("Classificação " + filme.getClassificacao());
//            }
//        }

    }

}
