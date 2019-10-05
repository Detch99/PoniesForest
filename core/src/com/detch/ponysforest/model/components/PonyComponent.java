package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.detch.ponysforest.model.hero.Pony;

import lombok.Data;

@Data
public class PonyComponent implements Component {

    private Pony actor;
}
