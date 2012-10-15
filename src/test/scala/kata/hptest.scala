package kata

import hp._

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.math.round

@RunWith(classOf[JUnitRunner])
class HPSuite extends FunSuite {
  test("zero"){
    assert(compute(List())===0.0)
  }
  test("one"){
    assert(compute(List(1))===price)
    assert(compute(List(2))===2*price)
  }
  test("two"){
    assert(compute(List(1,1))===price*2*discount2)
    assert(compute(List(2,2))===price*2*discount2*2)
    assert(compute(List(1,2))===price*(2*discount2+1))
    assert(compute(List(2,1))===price*(2*discount2+1))
  }
  test("three"){
    assert(compute(List(1,1,1))===price*3*discount3)
  }
  test("four"){
    assert(compute(List(1,1,1,1))===price*4*discount4)
  }
  test("five"){
    assert(compute(List(1,1,1,1,1))===price*5*discount5)
  }
  test("hard"){
    assert(compute(List(1,2,1,2,2))===price*4*discount4*2)
    assert(compute(List(1,2,2,2,1))===price*4*discount4*2)
    assert(compute(List(2,2,1,2,1))===price*4*discount4*2)
    assert(compute(List(2,2,1,1,2))===price*4*discount4*2)
  }
  test("very hard"){
    assert (round(compute(List(20,20,10,10,20))*1000)===round(price*4*discount4*2*10)*1000)
  }
}
