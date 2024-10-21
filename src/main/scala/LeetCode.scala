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
   /*
   val stringCoded1 = s.map(c => s.indexOf(c)).toList
   val stringCoded2 = t.map(c => t.indexOf(c)).toList
   return stringCoded1 == stringCoded2

    */
   /*
   val lst1 = new Array[Int](s.length)
   val lst2 = new Array[Int](t.length)
   for (i <- s.indices){
     lst1(i) = s.indexOf(s(i))
     lst2(i) = t.indexOf(t(i))
   }
   lst1 == lst2

    */

 }
  def firstUniqChar(s:String): Int ={

    val frequency = scala.collection.mutable.Map[Char, Int]()
    // compter la frequence de chaque caractère
    for(char <- s){
      frequency(char) = frequency.getOrElse(char,0) + 1
    }
    // trouver l'index du premier caractère unique
   /*
    for (i <- s.indices){
      if (frequency(s(i)) == 1){
        return i
      }
    }
    // Si aucun caractère unique n'est trouvé, retourner -1
    -1

    */
    s.indices.find(i => frequency(s(i)) == 1).getOrElse(-1)
  }

def main(args:Array[String]): Unit= {
  isIsomorphic("egg", "add")
  val input = "leetcode"
  println(firstUniqChar(input))
}

}
