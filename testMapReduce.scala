var x = (1 to 100).toList.reduce(_+_)

var y = (1 to 100).toList.map { i => i * i }.reduce(_+_)
var yy = (1 to 100).toList.map { i => i * i }

var z = (1 to 100).toList.map{ i => if (i % 2 == 0) i * i else 0}.reduce(_+_) 
var zz = (1 to 100).toList.collect{ case i if i % 2 == 0 => i * i }.reduce(_+_)

var sumSquaresOfPairs = (x:List[Int]) => {  x.collect { case i if i % 2 == 0 => i * i }.reduce(_+_) } //anonymous function
println(sumSquaresOfPairs((1 to 100).toList))
