package br.com.futurodev.heroi;

import java.util.List;

import br.com.futurodev.exception.OperacaoInvalidaException;
import br.com.futurodev.heroi.model.Heroi;
import br.com.futurodev.heroi.model.Operacao;
import br.com.futurodev.heroi.view.HeroiView;
import br.com.futurodev.repository.HeroiRepository;

public class HeroiApp {
    
    private HeroiView view = new HeroiView();
    private HeroiRepository repository = new HeroiRepository();

    public void executar() {        
        Operacao operacao = null;
        while (operacao != Operacao.ENCERRAR) {
            view.exibirMenu();
            operacao = obterOperacao();
            processar(operacao);
        }
        view.exibirMensagemInfo("Sistema encerrado!");

    }

    private Operacao obterOperacao() {
        String opcao = view.obterCodigoOperacao();
        try {
            Operacao operacao = Operacao.converter(opcao);
            return operacao;
        } catch (OperacaoInvalidaException e) {
            return null;
        }
    }

    private void processar(Operacao operacao) {
        if (operacao == null) {
            view.exibirMensagemErro("Código de Operação inválido!!!");
            view.aguardar();
        } else if (operacao == Operacao.ADICIONAR) {
            adicionar();
        } else if (operacao == Operacao.LISTAR) {
            listar();
        }
    }

    private void adicionar() {
        Heroi heroi = view.obterDados();
        boolean isExistente = repository.existePorNome(heroi.getNome());
        if (isExistente) {
            view.exibirMensagemErro("Herói já cadastrado!");
            return;
        }
        repository.adicionar(heroi);
        view.exibirMensagemSucesso("Herói adicionado com sucesso!");
        view.aguardar();
    }

    private void listar() {
        List<Heroi> lista = repository.consultar();
        if (lista.isEmpty()) {
            view.exibirMensagemErro("Sem heróis cadastrados para exibição!");
            return;
        }
        for (Heroi heroi : lista) {  
            view.exibirDados(heroi);
        }
    }

}
