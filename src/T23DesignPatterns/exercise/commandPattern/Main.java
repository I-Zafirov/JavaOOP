package T23DesignPatterns.exercise.commandPattern;

public class Main {
    public static void main(String[] args) {
        TVRemote tvRemote = new TVRemote(12, "Softuni");

        VolumeUpCommand volumeUp = new VolumeUpCommand(tvRemote);
        VolumeDownCommand volumeDown = new VolumeDownCommand(tvRemote);

        volumeUp.execute();
        volumeUp.execute();
        volumeUp.execute();
        volumeDown.execute();
        volumeDown.execute();
    }
}
