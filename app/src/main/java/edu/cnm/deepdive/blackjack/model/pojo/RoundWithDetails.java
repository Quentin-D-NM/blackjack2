package edu.cnm.deepdive.blackjack.model.pojo;

import androidx.room.Relation;
import edu.cnm.deepdive.blackjack.model.entity.Hand;
import edu.cnm.deepdive.blackjack.model.entity.Round;
import java.util.List;

public class RoundWithDetails extends Round {

  @Relation(entity = Hand.class, entityColumn = "round_id", parentColumn = "round_id")
  private List<HandWithCards> hand;

  public List<HandWithCards> getHand() {
    return hand;
  }

  public void setHand(List<HandWithCards> hand) {
    this.hand = hand;
  }
}