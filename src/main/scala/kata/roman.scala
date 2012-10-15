package kata

object Roman{
  val conv=(1000,"M")::(900,"CM")::(500,"D")::(400,"CD")::(100,"C")::(90,"XC")::(50,"L")::(40,"XL")::(10,"X")::(9,"IX")::(5,"V")::(4,"IV")::(1,"I")::List()
  def toRoman(i:Int):String={
    def toRoman0(i:Int,acc:String,level:List[(Int,String)]):String={
      require(i>=0)
      if(i==0)acc else toRoman0(i%level.head._1,acc+level.head._2*(i/level.head._1),level.tail)
    }
    toRoman0(i,"",conv)
  }
  def toLatin(s:String):Int={
    def toLatin0(s:String,acc:Int,level:List[(Int,String)]):Int={
      if(s.length==0)acc else if(s.startsWith(level.head._2)) toLatin0(s.substring(level.head._2.length),acc+level.head._1,level) else toLatin0(s,acc,level.tail)
    }
    toLatin0(s,0,conv)
  }
}

