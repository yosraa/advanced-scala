object LeetCode {

  /*
  En évitant des recherches répétées avec indexOf et en utilisant des structures de données appropriées, nous réduisons la complexité temporelle du code.
  L'utilisation de Map permet de gérer les associations de caractères de manière efficace, ce qui améliore considérablement les performances.
   */
 def isIsomorphic(s:String, t:String) : Boolean= {
   if (s.length != t.length ) return false
   val mapS = scala.collection.mutable.Map[Char, Int]()
   val mapT = scala.collection.mutable.Map[Char, Int]()
   for (i <- s.indices){
    val charS = s(i)
    val charT = t(i)
    // Enregistrement des positions
    mapS.getOrElseUpdate(charS, i) != mapT.getOrElseUpdate(charT, i) match {
     case true => return false
     case false =>
    }
   }
  true
 }
def main(args:Array[String]): Unit= {
 isIsomorphic("egg", "add")
}

}
