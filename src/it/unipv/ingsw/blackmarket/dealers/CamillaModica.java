// Camilla Modica
// 439006
package it.unipv.ingsw.blackmarket.dealers;

import it.unipv.ingsw.blackmarket.Briefcase;
import it.unipv.ingsw.blackmarket.Dealer;
import it.unipv.ingsw.blackmarket.Exchange;

public class CamillaModica extends Dealer {
    private Briefcase bag = Briefcase.FULL;
    private boolean isReliable = true;

    @Override
    public Briefcase exchangeBriefcase(int roundNo, int totRounds) {
        if (roundNo == 1){
            bag = Briefcase.FULL;
            isReliable = true;
        }
        if (roundNo > totRounds / 2){
            return Briefcase.EMPTY;
        } else {
            return bag;
        }
    }

    public void exchangeResult(Exchange exchange, int roundNo, int totRounds) {
        if (exchange.secondBriefcase().equals(Briefcase.FULL)){
            bag = Briefcase.FULL;
        } else{
            bag = Briefcase.EMPTY;
            isReliable = false;
        }
    }
}