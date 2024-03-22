package br.com.futurodev.heroi.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.futurodev.heroi.model.Heroi;

public class HeroiRepository {
    
    public List<Heroi> herois = new ArrayList<>();  // Simulação do BD

    public List<Heroi> consultar() {
        return herois;
    }

    public boolean existePorNome(String nome) {
        // return herois.stream().anyMatch(h -> h.getNome().equalsIgnoreCase(nome));
        for (var heroi : herois) {
            if (heroi.getNome().equalsIgnoreCase(nome))
                return true;
        }
        return false;
    }

    public void adicionar(Heroi heroi) {
        herois.add(heroi);
    }

}
