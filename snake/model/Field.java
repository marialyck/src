package snake.model;

import snake.model.Field;

public class Field {

	private int row, column;

	public Field(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public boolean equals(Field field) {
		if(field.column == this.column){
			if(field.row == this.row){
				return true;
			}
		}
			return false;
		
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

}
