package com.fpinscala.exercises.Exercise2Test

import org.scalatest.{FlatSpec, Matchers}

import com.fpinscala.exercises.Exercise2._
import com.fpinscala.exercises.Exercise2.intOrdering

class Exercise2Test extends FlatSpec with Matchers {

  "fib 0" should "be 0" in {
    fib(0) should be(0)
  }
  "fib 1" should "be 1" in {
    fib(1) should be(1)
  }
  "fib 2" should "be 1" in {
    fib(2) should be(1)
  }
  "fib 3" should "be 2" in {
    fib(3) should be(2)
  }
  "fib 5" should "be 3" in {
    fib(5) should be(5)
  }
 "fib 10" should "be 34" in {
    fib(9) should be(34)
  }

  "sorted, 1,3,2" should "be false" in {
    isSorted(Array(1,3,2)) should be(false)
  }
  "sorted, 1,2,3" should "be true" in {
    isSorted(Array(1,2,3)) should be(true)
  }

  "sorted, 1,1,3" should "be true" in {
    isSorted(Array(1,1,3)) should be(true)
  }
  "sorted, 1" should "be true" in {
    isSorted(Array(1)) should be(true)
  }
  "sorted," should "be true" in {
    isSorted(Array()) should be(true)
  }



}
