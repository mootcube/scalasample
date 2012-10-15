package kata

import Roman._

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RomanSuite extends FunSuite {
  test("toRoman"){
    assert(toRoman(2000)==="MM")
    assert(toRoman(1999)==="MCMXCIX")
    assert(toRoman(47)==="XLVII")
  }
  
  test("toLatin"){
    assert(toLatin("MM")===2000)
    assert(toLatin("MCMXCIX")===1999)
    assert(toLatin("XLVII")===47)
  }
}
