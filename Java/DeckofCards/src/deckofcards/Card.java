package deckofcards;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class Card implements Comparable<Card> {

	private final Rank rank;
	private final Suit suit;

	private final static Map<String, Card> CARD_CACHE = initCache();

	private static Map<String, Card> initCache() {

		final Map<String, Card> cache = new HashMap<>();
		for (final Suit suit : Suit.values()) {
			for (final Rank rank : Rank.values()) {
				cache.put(cardKey(rank, suit), new Card(rank, suit));
			}
		}
		return Collections.unmodifiableMap(cache);
	}

	public static Card getCard(final Rank rank, final Suit suit) {
		final Card card = CARD_CACHE.get(cardKey(rank, suit));
		if (card != null) {
			return card;
		}
		throw new RuntimeException("Invalid card ! " + rank + " " + suit);
	}

	private static String cardKey(final Rank rank, final Suit suit) {
		return rank + " of" + suit;
	}

	@Override
	public String toString() {
		return String.format("%s of %s", this.rank, this.suit);
	}

	@Override
	public int compareTo(final Card o) {
		final int rankComparison = Integer.compare(this.rank.getRankValue(), o.rank.getRankValue());
		if (rankComparison != 0) {
			return rankComparison;
		}

		return Integer.compare(this.suit.getSuitValue(), o.suit.getSuitValue());
	}

	private Card(final Rank rank, final Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	enum Suit {
		DIAMONDS(1), CLUBS(2), HEARTS(3), SPADES(4);

		private final int suitValue;

		Suit(final int SuitValue) {
			this.suitValue = SuitValue;
		}

		public int getSuitValue() {
			return this.suitValue;
		}
	}

	enum Rank {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGTH(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13),
		ACE(14);

		private final int rankValue;

		Rank(final int rankValue) {
			this.rankValue = rankValue;
		}

		public int getRankValue() {
			return this.rankValue;
		}

	}

}
