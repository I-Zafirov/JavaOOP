package T03WorkingWithAbstraction.exercise.E05JediGalaxy;

public class Jedi {
    public long moveJedi(int currentRowJedi, int currentColJedi, StarsField field) {
        long starsCollected = 0;
        while (currentRowJedi >= 0 && currentColJedi < field.getColLength()) {
            if (field.isItBounds(currentRowJedi, currentColJedi)) {
                starsCollected += field.getValue(currentRowJedi, currentColJedi);
            }

            currentColJedi++;
            currentRowJedi--;
        }
        return starsCollected;
    }
}
