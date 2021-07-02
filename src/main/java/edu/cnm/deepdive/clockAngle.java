package edu.cnm.deepdive;

public class clockAngle {

  //Hour

  static double angleHour(int hour, int min) {

    if (hour < 0 || min < 0) {

      throw new IllegalArgumentException();

    }

    if (hour > 12) {

      hour = hour - 12;

    }

    return ((hour * 60 + min) * 0.5);

  }

//Minute

  static float angleMin(int min) {

    if (min < 0 || min > 60) {

      throw new IllegalArgumentException();

    }

    return (min * 6);

  }

}
}
