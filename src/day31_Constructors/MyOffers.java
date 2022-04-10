package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("London", "Wates", "Desktop Support", 60000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("Hong Kong", "IBM", "Infrastructure Support", 90000, false, true, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("Istanbul", "Amazon", "QA Engineer", 75000, true, false, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("Madrid", "Tesla", "Technician", 200000, false, false, false, false);

        Offer offer5 = new Offer();
        offer5.setInfo("Berlin", "Microsoft", "Head Of IT", 2000000, true, false, true, false);



        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("--------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList( myOffers ));
        fullTimeOffers.removeIf( p-> !p.isFullTime ); //remove if the offer is NOT fulltime.
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList( myOffers ));
        localOffers.removeIf(p-> !(p.location.equals("Berlin") || p.location.equals("London"))); //remove the offer if the offer is NOT from local area
        System.out.println(localOffers.size());

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList( myOffers ));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println(offersWithBenefits.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " + localOffer.salary);
        }

    }
}
