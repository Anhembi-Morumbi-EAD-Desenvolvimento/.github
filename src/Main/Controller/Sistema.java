package Main.Controller;

import Main.Model.Evento;
import Main.Model.Usuario;
import Main.View.InterfaceUsuario;

import java.util.List;

public class Sistema {
    private List<Evento> eventos;
    private Usuario usuario;
    private InterfaceUsuario interfaceUsuario;

    public Sistema() {
        this.interfaceUsuario = new InterfaceUsuario();
        // Carregar eventos do arquivo
    }

    public void executar() {
        // Implementação do loop principal
    }

    public void cadastrarUsuario() {
        // Implementação do cadastro de usuário
    }

    public void cadastrarEvento() {
        // Implementação do cadastro de evento
    }

    public void consultarEventos() {
        // Implementação do cadastro de evento
    }

    private void listarEventos() {
        // Implementação da listagem de eventos
    }

    public void participarEvento() {
        // Implementação da participação em evento
    }

    public void consultarEventosParticipados() {
        // Implementação da participação em evento
    }

    public void cancelarParticipacao() {
        // Implementação do cancelamento de participação
    }

    public void consultarEventosProximos() {
        // Implementação do cancelamento de participação
    }

    public void consultarEventosPassados() {
        // Implementação do cancelamento de participação
    }

    private void ordenarEventosPorHorario() {
        // Implementação da ordenação de eventos por horário
    }

    private void verificarEventoAtual() {
        // Implementação da verificação de evento atual
    }
}
