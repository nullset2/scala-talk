val start = System.nanoTime()
for (i <- 1 to 500000){
  println(s"Sup Alfredo $i");
}
val end = System.nanoTime()
println((end - start)/1000000000.0);

