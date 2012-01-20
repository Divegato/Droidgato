package com.android.gato.droidgato;

public class Map {

	public Area[][] Areas;

	public class Tile {
		public void DoDraw(){
			
		}
	}

	public class Screen {

		public Tile[][] Tiles;

		public void DoDraw() {
			for (int i = 0; i < Tiles.length; i++) {
				for (int j = 0; j < Tiles[i].length; j++) {
					Tiles[i][j].DoDraw();
				}
			}
		}
	}

	public class Area {

		public Screen[][] Screens;

	}
}
