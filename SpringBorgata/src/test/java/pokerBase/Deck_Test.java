package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerBase.Deck;
import pokerBase.Hand;


public class Deck_Test {
	/**
	 * for deck test:
	 * make a bunch of decks with varying numbers of jokers, test number of cards in deck
	 * test draw functions, etc.
	 */
	
	Deck deck1 = new Deck(); //52 cards, no jokers
	Deck deck2 = new Deck(1); //53 cards, 1 joker
	Deck deck3 = new Deck(10); //62 cards, 10 jokers

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		int iDeckSize = 52;
		Deck d = new Deck();
		assertTrue(d.getTotalCards() == iDeckSize);		
	}
	
	@Test
	public void DrawOne() {
		int iDeckSize = 52;
		int iDeckSizeDrawOne = 51;
		
		Deck d = new Deck();
		assertTrue(d.getTotalCards() == iDeckSize);
		d.drawFromDeck();
		
		assertTrue(d.getTotalCards() == iDeckSizeDrawOne);
		
	}
	
	@Test
	public void Decksize(){
		assertTrue(deck1.getTotalCards() == 52);
		assertTrue(deck2.getTotalCards() == 53);
		assertTrue(deck3.getTotalCards() == 62);
		Hand hand1 = new Hand(deck2);
		Card card1 = deck1.drawFromDeck();
		assertTrue(deck2.getTotalCards() == 48);
		assertTrue(deck1.getTotalCards() == 51);
	}
	

}
