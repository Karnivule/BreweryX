package com.dre.brewery.configuration.sector.capsule;

import eu.okaeri.configs.OkaeriConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class ConfigCustomItem extends OkaeriConfig {

    private Boolean matchAny;
    private List<String> material;
    private String name;
    private List<String> lore;
    private List<Integer> customModelData;
}
