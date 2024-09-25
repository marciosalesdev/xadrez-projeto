package boardgame;

public class Position {

	private int row;
	private int column;
	
	
	
	public int getRows() {
		return row;
	}



	public void setRows(int row) {
		this.row = row;
	}



	public int getColumn() {
		return column;
	}



	public void setColumn(int column) {
		this.column = column;
	}



	public Position(int row, int column) {
		this.row = row;
		this.column = column;
		
		
	}



	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
