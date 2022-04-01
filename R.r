input <- file('stdin', 'r')

a <- as.integer(readLines(input, n=1))
b <- as.integer(readLines(input, n=1))
c <- as.numeric(readLines(input, n=1))

write(sprintf("NUMBER = %d\nSALARY = U$ %.2f",a,b*c),'')
