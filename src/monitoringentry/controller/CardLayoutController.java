/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.controller;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author M Arif Rosyanto
 */
public class CardLayoutController {

    private CardLayout cardLayout;
    private JPanel parentCard;

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getParentCard() {
        return parentCard;
    }

    public void setParentCard(JPanel parentCard) {
        this.parentCard = parentCard;
    }

    public void next() {
        cardLayout.next(parentCard);
    }

    public void previous() {
        cardLayout.previous(parentCard);
    }

    public void show(String cardName) {
        cardLayout.show(parentCard, cardName);
    }
}
