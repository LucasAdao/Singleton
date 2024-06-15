package com.lucas;

import com.lucas.models.EquipamentosSingletonEAGER;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainComSingletonEAGER {
    public static void main(String[] args) {
        pegarEquipamentoSingleton("Lixa");
        pegarEquipamentoSingleton("Pá");

    }
    public static void pegarEquipamentoSingleton(String equipamento) {
        EquipamentosSingletonEAGER equipamentos = EquipamentosSingletonEAGER.getInstance();
        equipamentos.pegarEquipamento(equipamento);
        System.out.println(equipamentos.getEquipamentos());
    }
}