import java.security.SecureRandom;

import week6.Card;

public class 5 {
	
	public static class DeckOfCardsTest {
		public static void main(String[] args) { 
			
			DeckOfCards myDeckOFCards = new DeckOfCards();
			myDeckOFCards.shuffle();
			
			for(int i = 1; i<=52;i++) {
				System.out.printf("%-19s",myDeckOFCards.dealCard());
				
				if(i%4 == 0 ) {
					System.out.println();
				}
			}
			
		}
	}
	public class Card {
		private final String face;
		private final String suit;


		public Card(String cardFace, String cardSuit) {
			this.face = cardFace;
			this.suit = cardSuit;
		}
		
		public String toString() {
			return face + "of" + suit;
		}
	}
	public class Shuffle() {
		
		currentCard = 0;
		
		for(int first=0; first<deck,length;first++) {
			
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
		public Card dealCard() {
			
			if(currentCard<deck.length) {
				return deck[cunrrentCard++];
			}
			else {
				return null;
			}
		}
	}

	public class DeckOfCards {
		private static final SecureRandom randomNumbers = new SecureRandom();
		private static final int NUMBER_OF_CARDS = 52;
		
		private Card[] deck = new Card[NUMBER_OF_CARDS];
		private int currentCard = 0;
	
		public DeckOfCards() {
			String[] faces = {"ACE","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King",};
			String[] suits = {"Hearts","Diamonds","Clubs","Spades"};		
		
			for(int count = 0; count<deck.length; count++) {
				deck[count]= new Card(faces[count % 13], suits[count/13]);
			}
		}
	}



	public class DeckOfCards {
		private static final SecureRandom randomNumbers = new SecureRandom();
		private static final int NUMBER_OF_CARDS = 52;
	
		private Card[] deck = new Card[NUMBER_OF_CARDS];
		private int currentCard = 0;
	
		public DeckOfCards() {
			String[] faces = {"ACE","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King",};
			String[] suits = {"Hearts","Diamonds","Clubs","Spades"};		
		
			for(int count = 0; count<deck.length; count++) {
				deck[count]= new Card(faces[count % 13], suits[count/13]);
			}
		}
	}
	


