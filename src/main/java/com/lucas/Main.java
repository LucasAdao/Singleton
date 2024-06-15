package com.lucas;

import com.lucas.models.Equipamentos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pegarEquipamento("Lixa");
        pegarEquipamento("Pá");

    }
    public static void pegarEquipamento(String equipamento) {
        Equipamentos equipamentos = new Equipamentos();
        equipamentos.pegarEquipamento(equipamento);
        System.out.println(equipamentos.getEquipamentos());
    }
}