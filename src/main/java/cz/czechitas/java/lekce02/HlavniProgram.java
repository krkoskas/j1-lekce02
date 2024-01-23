package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    nakreslitDomecky();
    zofka.turnLeft(180);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.penDown();
    nakreslitObdelnik();
    zofka.turnRight(225);
    zofka.move(55);
    zofka.turnRight(90);
    zofka.move(55);
  }

  public void nakreslitObdelnik() {
    for (int i = 0; i < 2; i++) {
      zofka.move(150);
      zofka.turnLeft(90);
      zofka.move(75);
      zofka.turnLeft(90);
    }
  }
  public void nakreslitDomecek() {
    for (int i = 0; i < 4; i++) {
      zofka.turnRight(90);
      zofka.move(100);
    }
    for (int i = 0; i < 2; i++) {
      zofka.turnRight(45);
      zofka.move(71);
      zofka.turnRight(45);
    }
  }

  public void nakreslitDomecky() {
    for (int i=0; i<3; i++) {
      nakreslitDomecek();
      if (i<2) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.penDown();
      } else {
        zofka.penUp();
      }
    }
  }

}

