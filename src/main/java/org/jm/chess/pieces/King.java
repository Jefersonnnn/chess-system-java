package org.jm.chess.pieces;

import org.jm.boardgame.Board;
import org.jm.chess.ChessPiece;
import org.jm.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
