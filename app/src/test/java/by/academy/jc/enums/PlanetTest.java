package by.academy.jc.enums;

import static by.academy.jc.enums.Planet.EARTH;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PlanetTest {

  @ParameterizedTest
  @ValueSource(doubles = {50, 70, 100})
  public void displayWeightOnDifferentPlanets(double earthWeight) {

    System.out.printf("\nRunning a test for %f%n\n", earthWeight);

    double mass = earthWeight / EARTH.surfaceGravity();

    for (Planet p : Planet.values()) {
      System.out.printf(
          "Your weight on %s is %f%n",
          p,
          p.surfaceWeight(mass)
      );
    }
  }
}
