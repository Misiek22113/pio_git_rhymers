package edu.kis.vh.nursery;

/**
 *
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer, oraz zawiera dwie metody reportRejecte, countIn
 * oraz geter getTotalRejected. Klasa ta odpowiada ona za dodawanie wartości liczbowych do
 * tablicy counter (która jest prywatnym polem klasy DefaultCountingOutRhymer) tylko w przypadku gdy wartość liczby
 * jest mniejsza od wartości liczby znajdującej się na końcu tablicy counter. W przypadku gdy liczba którą chcemy dodać
 * nie jest mniejsza od liczby na końcu tablicy zwiększany jest licznik totalRejected
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int REJECTED_NUMBER = 0;
    private int totalRejected = REJECTED_NUMBER;

    /**
     * @return Metoda reportRejected zwraca wartość pola totalRejected
     * która jest liczbą typu int, zawiera ona ilość odrzuconych liczb,
     * podczas prób dodawania ich do tablicy counter. Czyli w przypadku
     * gdy liczba którą chcemy dodać jest większa od liczby znajdującej
     * się na końcu tablicy.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * @return Metoda countIn sprawdza czy liczba którą chcemy dodać
     * do tablicy count jest mniejsza od liczby znajdującej się aktualnie
     * na końcu tablicy count. Jeżeli tak to zostaje ona dodana na pozycję
     * pierwszą za aktualną ostatnią liczbą. W przypadku kiedy liczba jest
     * większa od liczby znajdującej się aktaulnie na końcu tablicy
     * zwiększana jest wartość pola totalRejected.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

}
