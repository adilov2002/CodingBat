package headfirstjava.musicplayer;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) throws InterruptedException {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        for (int i = 0; i < 3; i++) {
            Thread.sleep(400);
            mini.play();
        }
    }

    public void play() {
        try {
            // get sequencer which default closed
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 70, 90);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 77, 90);
            MidiEvent noteOff = new MidiEvent(b, 10);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
