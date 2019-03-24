package play;

import learn.dota.Hero;

public class Game {

	public static void main(String[] args) {
		Hero aa = new Hero("Earth Shaker");
		System.out.println(aa.toString());
		aa.Call();
	}

}
