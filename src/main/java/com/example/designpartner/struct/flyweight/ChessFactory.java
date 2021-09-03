package com.example.designpartner.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {

    private static Map<String , Chess> map = new HashMap<String,  Chess>();

    public static Chess getChess(String color) {
        if (map.containsKey(color)) {
            return map.get(color);
        } else {
            CorcreteChess chess = new CorcreteChess(color);
            map.put(color, chess);
            return chess;
        }
    }
}
