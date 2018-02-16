package com.fpinscala.exercises

import scala.annotation.tailrec

object Exercise2 {

  def fib(n: Int): Int = {

    @tailrec
    def doFib(n: Int, a: Int, b: Int): Int = {
      if (n == 0) a
      else doFib(n-1, a+b, a)
    }
    doFib(n, 0, 1)
  }

  def isSorted[A](as: Array[A])(implicit ordered: (A, A) => Boolean): Boolean = {
    as match {
      case Array() => true
      case Array(_) => true
      case _ => ordered(as.head, as.tail.head) && isSorted(as.tail)(ordered)
    }
  }

  implicit def intOrdering: (Int, Int) => Boolean = _ <= _

}
