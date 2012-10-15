package kata

import scala.math._

object hp{
  val price=8.0
  val discount2=0.95
  val discount3=0.90
  val discount4=0.8
  val discount5=0.75
  def compute(books:List[Int]):Double={
    def process(books:List[Int],acc:Double,n:Int,discount:Double):Double=
      compute0(filterSort(books),acc+price*n*discount)
    
    def filterSort(books:List[Int]):List[Int]=
      books.filter(i=>i>0).sortWith((x,y)=>x<y)
    
    def compute0(books:List[Int],acc:Double):Double={
      require(books.size<6)
      books.size match{
	case 1 => acc+price*books.head
	case 2 => process(books.map(i=>i-1),acc,2,discount2)
	case 3 => process(books.map(i=>i-1),acc,3,discount3)
	case 4 => process(books.map(i=>i-1),acc,4,discount4)
	case 5 => min(process(books.map(i=>i-1),acc,5,discount5),process(books.head::books.tail.map(i=>i-1),acc,4,discount4))
	case _ => acc
      }
    }
    compute0(filterSort(books),0)
  }

}
