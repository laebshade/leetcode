import scala.annotation.tailrec
​
object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        @tailrec
        def inner(result: Array[Int], left: Array[Int]): Array[Int] = {
            if (left.isEmpty) {
                result
            }
            else {
                inner(result ++ Array(result.lastOption.getOrElse(0) + left.headOption.getOrElse(0)),
                      left.slice(1, left.length))
            }
        }
        inner(Array.empty[Int], nums)
    }
}
