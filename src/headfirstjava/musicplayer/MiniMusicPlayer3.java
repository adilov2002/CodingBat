package headfirstjava.musicplayer;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {

    static JFrame f = new JFrame("My first music clip");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setUpGui() {
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void go() {
        setUpGui();

        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 150; i += 4) {
                r = (int) ((Math.random() * 127) + 1);
                track.add(makeEvent(144, 1, r, 90, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 90, i + 10));
            }

            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(240);

        } catch (Exception ex) { ex.printStackTrace(); }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ignored) { }
        return event;
    }


    static class MyDrawPanel extends JPanel implements ControllerEventListener {

        boolean msg = false;

        @Override
        public void controlChange(ShortMessage shortMessage) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics graphics) {
            if (msg) {
                Graphics2D g2 = (Graphics2D) graphics;

                int r = (int) (Math.random() * 250);
                int g = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g2.setColor(new Color(r, g, b));

                int ht = (int) ((Math.random() * 200) + 10);
                int width = (int) ((Math.random() * 200) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g2.fillRect(x, y, ht, width);
                msg = false;

            }
        }
    }
}
