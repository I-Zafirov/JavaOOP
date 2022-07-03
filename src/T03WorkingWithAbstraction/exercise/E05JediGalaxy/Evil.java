package T03WorkingWithAbstraction.exercise.E05JediGalaxy;

public class Evil {
    public void moveEvil(int currentRowEvil, int currentColEvil, StarsField field) {
        while (currentRowEvil >= 0 && currentColEvil >= 0) {
            if (field.isItBounds(currentRowEvil, currentColEvil)) {
                field.setValue(currentRowEvil, currentColEvil, 0);
            }
            currentRowEvil--;
            currentColEvil--;
        }
    }
}
