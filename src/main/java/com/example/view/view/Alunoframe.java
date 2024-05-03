package com.example.view.view;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.example.view.controller.Controlador;
import com.example.view.model.Aluno;

public class Alunoframe {

    private JTextField nomeTextField;
    private JButton okButton;
    private JButton cancelButton;
    private JTextField notaTextField;
    private Controlador controlador;
    private Aluno aluno;
    private boolean editando;

    public JTextField getNomeTextField() {
        return nomeTextField;
    }

    public void setNomeTextField(JTextField nomeTextField) {
        this.nomeTextField = nomeTextField;
    }

    public JButton getOkButton() {
        return okButton;
    }

    public void setOkButton(JButton okButton) {
        this.okButton = okButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JTextField getNotaTextField() {
        return notaTextField;
    }

    public void setNotaTextField(JTextField notaTextField) {
        this.notaTextField = notaTextField;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }
}
