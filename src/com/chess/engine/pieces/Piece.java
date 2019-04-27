package com.chess.engine.pieces;

import com.chess.engine.PieceColor;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.Collection;

public abstract class Piece {

    protected final int piecePosition;
    protected final PieceColor pieceColor;

    Piece(final int piecePosition, final PieceColor pieceColor) {
        this.piecePosition = piecePosition;
        this.pieceColor = pieceColor;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }
}
