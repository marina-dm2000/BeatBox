import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("�� �������� ����������");
        } catch (MidiUnavailableException e) {
            System.out.println("�������");
        }
    }
}