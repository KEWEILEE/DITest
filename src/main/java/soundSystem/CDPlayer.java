package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

//    @Autowired
//    public CDPlayer(CompactDisc input) {
//        this.cd = input;
//    }

    public void play() {
        cd.play();
    }

    public CompactDisc getCd() {
        return cd;
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
