package soundSystem;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

//@Component("myBean")
public class SgtPeppers implements CompactDisc, BeanNameAware
{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing" + title + "by" + artist);
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }
}
