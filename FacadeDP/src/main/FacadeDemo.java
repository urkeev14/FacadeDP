/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Amplifier;
import domain.CdPlayer;
import domain.DvdPlayer;
import domain.PopcornPopper;
import domain.Projector;
import domain.Screen;
import domain.TheaterLights;
import domain.Tuner;
import facade.HomeTheaterFacade;

/**
 *
 * @author urosv
 */
public class FacadeDemo {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = createHomeTheater();
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }

    private static HomeTheaterFacade createHomeTheater() {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
                projector, lights, screen, popper);
        return homeTheater;
    }

}
