package org.jm.chess;

import org.jm.boardgame.Board;
import org.jm.boardgame.Piece;
import org.jm.boardgame.Position;

public abstract class ChessPiece extends Piece {
    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
