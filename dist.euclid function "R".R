dist.euclid <- function(x,y){
  diff <- x - y 
  sum.sq <- sum(diff^2)
  dist <- sqrt(sum.sq)
  return(dist)
}
