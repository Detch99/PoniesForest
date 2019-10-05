package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.detch.ponysforest.model.world.Walls;

import lombok.Data;

@Data
public class WallsComponent implements Component {

    private Walls actor;
}
