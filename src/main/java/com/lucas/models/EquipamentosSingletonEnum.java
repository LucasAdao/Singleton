package com.lucas.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum EquipamentosSingletonEnum {

    //serve para evitar reflections que é uma copia do construtor que evita o sigleton, criando e podendo modificar objetos que deviam ser executados apenas uma vez!!

    INSTANCE;

    private Map<String, Boolean> equipamentos = new HashMap<String, Boolean>();

    private EquipamentosSingletonEnum() {
        equipamentos.put("Carro de Mão", Boolean.TRUE);
        equipamentos.put("Pá", Boolean.TRUE);
        equipamentos.put("Cerra", Boolean.TRUE);
        equipamentos.put("Martelo", Boolean.TRUE);
        equipamentos.put("Lixa", Boolean.TRUE);
    }
    
    public static EquipamentosSingletonEnum getInstance() {
        return INSTANCE;
    }
    public Map<String, Boolean> getEquipamentos() {
        return equipamentos;
    }
    public void pegarEquipamento(String equipamento) {
        equipamentos.replace(equipamento, Boolean.FALSE);
    }
}
