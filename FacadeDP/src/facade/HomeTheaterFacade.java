/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import domain.Amplifier;
import domain.CdPlayer;
import domain.DvdPlayer;
import domain.PopcornPopper;
import domain.Projector;
import domain.Screen;
import domain.TheaterLights;
import domain.Tuner;

/**
 *
 * @author urosv
 */
public class HomeTheaterFacade {

    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
            Tuner tuner,
            DvdPlayer dvd,
            CdPlayer cd, 
            Projector projector, 
            TheaterLights theaterLights, 
            Screen screen, 
            PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }
    
    public void watchMovie(String movie){
            System.out.println("Get ready to watch a movie");
            popcornPopper.on();
            popcornPopper.pop();
            
            theaterLights.dim(10);
            screen.down();
            
            projector.on();
            projector.wideScreenMode();
            
            amplifier.on();
            amplifier.setDvd(dvd);
            amplifier.setSurroundSound();
            amplifier.setVolume(5);
            
            dvd.on();
            dvd.play(movie);
    }
    
    public void endMovie(){
        System.out.println("Shutting movie theather down...");
        
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
