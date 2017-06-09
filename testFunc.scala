def sumImperative(list: List[Int]) = {
  var sum = 0
  for(i <- list) {
    sum += i
  }
  sum
}

def sumFunctional(list: List[Int]) = {
  list.foldLeft(0) { (carry, i) =>
    carry + i
  }
}

def sumConditional(list: List[Int], conditional: Int => Boolean) = {
  var sum = 0
  list.foreach { i =>
    if(conditional(i)) sum += i
  }
  sum
}

println(sumImperative(List(1, 2, 3, 4, 5)))
println(sumFunctional(List(1, 2, 3, 4, 5)))
println(sumConditional(List(1, 2, 3, 4, 5), i => i % 2 == 0)) //should print sum of even 
println(sumConditional(List(1, 2, 3, 4, 5), i => i % 2 != 0)) //should print sum of uneven numbers
println(sumConditional(List(1, 2, 3, 4, 5), i => i > 4)) //should print sum of numbers > 4 
println(sumConditional(List(1, 2, 3, 4, 5), _ > 4)) //should print sum of numbers > 4 (alternative syntax)

