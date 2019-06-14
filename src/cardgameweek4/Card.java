package cardgameweek4;
/**
 * Starter code for the Card class.
 * Task 5 enumeration and delagation allows code reuse
 * Task 4  The OP principle lets use reuse the UML and update the source code
 * to be used in WEEK 4
 * @ author dancye , 2019
 */
public class Card {
    
        public enum Color {RED, YELLOW,GREEN,BLUE};
        public enum Rank{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, 
        SKIP, REVERSE,DRAW_TWO, DRAW_FOUR, WILDCARD };
        private final Color color;
        private final Rank rank;
        
        public Card(Color c, Rank r)
        {
           color =c;
           rank= r;
        }
	public  Color getColor() {
		return this.color;
	}

	
	public Rank getRank() {
		return this.rank;
        }
}