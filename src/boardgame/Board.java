package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		if(rows< 1 || columns<1) {
		throw new BoardException("Erro criando tabuleiro é necessario que tenha pelo menos uma linha e uma coluna. ");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}


	public Piece piece(int row, int column) {
		if(!positioExists(row, column)) {
			throw new BoardException("Posiçao nao existe no tabuleiro ");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positioExists(position)) {
			throw new BoardException("Posiçao nao existe no tabuleiro ");
		}
		return pieces[position.getRow()][position.getColumn()];
		
	}	
	
	public void placePiece(Piece piece, Position position) {
		if(theresIsAPiece(position)) {
			throw new BoardException("Ja existe uma peça nessa posiçao " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position =  position;
	}
	private boolean positioExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column<columns;
		
	}
	private boolean positioExists(Position position) {
		return positioExists(position.getRow(), position.getColumn());
	}
	public boolean theresIsAPiece(Position position) {
		if(!positioExists(position)) {
			throw new BoardException("Posiçao nao disponivel no board ");
		}
		return piece(position) !=null;
	}
	}
 
