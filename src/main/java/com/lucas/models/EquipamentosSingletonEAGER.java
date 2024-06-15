package com.lucas.models;

import java.util.HashMap;
import java.util.Map;

public class EquipamentosSingletonEAGER {

    private static final EquipamentosSingletonEAGER INSTANCE = new EquipamentosSingletonEAGER();

    private Map<String, Boolean> equipamentos = new HashMap<String, Boolean>();

    public EquipamentosSingletonEAGER() {
        equipamentos.put("Carro de Mão", Boolean.TRUE);
        equipamentos.put("Pá", Boolean.TRUE);
        equipamentos.put("Cerra", Boolean.TRUE);
        equipamentos.put("Martelo", Boolean.TRUE);
        equipamentos.put("Lixa", Boolean.TRUE);
    }
    public static EquipamentosSingletonEAGER getInstance() {
        return INSTANCE;
    }
    public Map<String, Boolean> getEquipamentos() {
        return equipamentos;
    }
    public void pegarEquipamento(String equipamento) {
        equipamentos.replace(equipamento, Boolean.FALSE);
    }
}
