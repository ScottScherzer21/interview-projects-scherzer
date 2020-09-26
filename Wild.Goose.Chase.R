wild.goose.chase<-function(m) {
  row=1
  col=1
  key=-1
  while(key==-1)
  {
    element=m[row,col]
    if(element==10*row+col)
    {key=element
    }
    col=element%%10
    row=(element-col)/10
  }
  return(m[row,col])
}
