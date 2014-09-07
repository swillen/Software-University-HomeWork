import java.util.ArrayList;

public class FullHouse {
	//In most Poker games, the "full house" hand is defined as three cards of the same face 
	//+ two cards of the same face, other than the first, regardless of the card's suits.
	//The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" and "A". 
	//The card suits are "♣", "♦", "♥" and "♠". Write a program to generate and print 
	//all full houses and print their number. 

	public static void main(String[] args) {
		char[] suits = {'\u2666','\u2663', '\u2665','\u2660' };
		String[] cards = {"2", "3","4", "5", "6", "7", "8" ,"9", "10"," J", "Q", "K","A"};
		//Go through the cards array with two for loops to pick up a card for the three of a kind and a 
		//card for the two of a kind.If the cards are different we go through the suits array with five 
		//for loops. Each next loop from the first three starts from the next suit .The fourth and fifth
		//loop start from the first and second suit.
		int counter = 0;
		for (int threeOfAKind = 0; threeOfAKind < 13; threeOfAKind++) {
			for (int twoOfAKind = 0; twoOfAKind < 13; twoOfAKind++) {
				if (threeOfAKind != twoOfAKind) {
					for (int firsSuit = 0; firsSuit < 4; firsSuit++) {
						for (int secondSuit = firsSuit + 1; secondSuit < 4; secondSuit++) {
							for (int thirdSuit = secondSuit + 1; thirdSuit < 4; thirdSuit++) {
								for (int fourthSuit = 0; fourthSuit < 4; fourthSuit++) {
									for (int fifthSiuth = fourthSuit + 1; fifthSiuth < 4; fifthSiuth++) {
										System.out.printf("%1$s%3$s %1$s%4$s %1$s%5$s %2$s%6$s %2$s%7$s \n",
												cards[threeOfAKind],cards[twoOfAKind],
												suits[firsSuit], suits[secondSuit], suits[thirdSuit],
												suits[fourthSuit],suits[fifthSiuth]);
										counter ++;
									}
								}
							}
						}
					}
					
				}
			}
		
		}
		System.out.println(counter);
    }
}



