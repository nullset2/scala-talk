def sumImperative(list: List[Int]) = {
  var sum = 0
  for(i <- list) {
    sum += i
  }
  sum
}

//funct
def sumFunctional(list; List[int]) = {
  list.foldLeft(0) { (carryover, i) =>
    carry + i
  }
}

println(sumImperative(List(1, 2, 3, 4, 5)))
println(sumFunctional(List(1, 2, 3, 4, 5)))
