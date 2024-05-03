package com.example.view.view;

import javax.swing.JButton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.view.controller.Controlador;

@SpringBootApplication
public class ViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViewApplication.class, args);
    }

    private void thisWindowClosing() {
        // Implemente o que deseja fazer quando a janela é fechada
    }

    // Método para manipular o evento do botão "Novo Aluno"
    private void novoAlunoButtonActionPerformed() {
        // Implemente o que deseja fazer quando o botão "Novo Aluno" é clicado
    }

    private void listarAlunosButtonActionPerformed(){

    }

    private void resultadosButtonActionPerformed(){
        
    }

    public class TurmaFrame {

        private JButton listarAlunosButton;
        private JButton resultadosButton; // Corrigindo o nome da variável
        private JButton novoAlunoButton;
        private Controlador controlador;

        public JButton getListarAlunosButton() {
            return listarAlunosButton;
        }

        public void setListarAlunosButton(JButton listarAlunosButton) {
            this.listarAlunosButton = listarAlunosButton;
        }

        public JButton getResultadosButton() {
            return resultadosButton;
        }

        public void setResultadosButton(JButton resultadosButton) {
            this.resultadosButton = resultadosButton;
        }

        public JButton getNovoAlunoButton() {
            return novoAlunoButton;
        }

        public void setNovoAlunoButton(JButton novoAlunoButton) {
            this.novoAlunoButton = novoAlunoButton;
        }

        public Controlador getControlador() {
            return controlador;
        }

        public void setControlador(Controlador controlador) {
            this.controlador = controlador;
        }

        // Métodos da classe TurmaFrame aqui
    }
}
