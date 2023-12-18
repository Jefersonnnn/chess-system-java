package org.jm.chess.pieces;

import org.jm.boardgame.Board;
import org.jm.chess.ChessPiece;
import org.jm.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
