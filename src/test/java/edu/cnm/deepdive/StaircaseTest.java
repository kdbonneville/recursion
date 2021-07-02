package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaircaseTest {
//static int[] lengthValues - {0, 1, 2, 5}
static final String[] lengthValues = [1];
static final String[] lengthValues = [2];
static int[] lengthValues = {0, 1, 2, 5};
static int[] differenceValues = {6, 5, 5, -6};
static int [][] expectedValues= {}
  {},
  {*},
  {0, 5},
  {0, -6, -12, -18, -24}


  @Test
  void main() {


assertArrayEquals(expectedValues, Staircase.main(input));
}