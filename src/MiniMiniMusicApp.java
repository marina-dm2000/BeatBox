import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public void play() {
        try {
            //ѕолучаем синтезатор и открываем его, чтобы начать использовать
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            //ѕроигрываение ноты %44
            a.setMessage(144,1,44,100);
            //—ообщение сработает на первом такте
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            //ѕередаем последовательность синтезатору
            player.setSequence(seq);
            //«апускаем синтезатор
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}