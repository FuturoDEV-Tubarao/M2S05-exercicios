package br.com.futurodev.heroi.model;

import br.com.futurodev.exception.OperacaoInvalidaException;

public enum Operacao {
    
    ADICIONAR,  
    LISTAR,
    ENCERRAR;

    
    public static Operacao converter(String opcao) {
        try {
            if (opcao == null)
                throw new OperacaoInvalidaException();
            Integer codigo = Integer.valueOf(opcao); // convertendo a opcao de string para integer
            if (codigo > Operacao.values().length) // codigo da operacao maior que tamanho da enum
                throw new OperacaoInvalidaException();
            // Operacao[] operacoes = Operacao.values();
            // return operacoes[codigo - 1];
            if (codigo == 1)
                return Operacao.ADICIONAR;
            else if (codigo == 2)
                return Operacao.LISTAR;
            else
                return Operacao.ENCERRAR;
        } catch (NumberFormatException e) {
            throw new OperacaoInvalidaException();
        }
    }

}
