package optional;

/* 
 * Print the lyrics to the song "99 Bottles of Beer on the wall"
 * 
 * http://99-bottles-of-beer.net/lyrics.html
 */

public class BeerOnTheWall {
	public static void main(String[] args) {
		
		for (int i = 99; i > 2; i--) {
			
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\r\n" + 
					"Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.\r\n" );
		}
		
		System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\r\n" + 
				"Take one down and pass it around, 1 bottle of beer on the wall.\r\n" + 
				"\r\n" +
				"1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
				"Take one down and pass it around, no more bottles of beer on the wall.\r\n" + 
				"\r\n" + 
				"No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.");
		
	}
}
