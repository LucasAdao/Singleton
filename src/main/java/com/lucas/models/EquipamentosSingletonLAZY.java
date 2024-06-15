package com.lucas.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EquipamentosSingletonLAZY {

    private static  EquipamentosSingletonLAZY INSTANCE = new EquipamentosSingletonLAZY();

    private Map<String, Boolean> equipamentos = new HashMap<String, Boolean>();

    public EquipamentosSingletonLAZY() {
        equipamentos.put("Carro de Mão", Boolean.TRUE);
        equipamentos.put("Pá", Boolean.TRUE);
        equipamentos.put("Cerra", Boolean.TRUE);
        equipamentos.put("Martelo", Boolean.TRUE);
        equipamentos.put("Lixa", Boolean.TRUE);
    }

    public static EquipamentosSingletonLAZY getInstance() {
        if (Objects.isNull(INSTANCE)){
            INSTANCE = new EquipamentosSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }
    public Map<String, Boolean> getEquipamentos() {
        return equipamentos;
    }
    public void pegarEquipamento(String equipamento) {
        equipamentos.replace(equipamento, Boolean.FALSE);
    }
}
