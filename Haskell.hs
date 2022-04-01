import Text.Printf(printf)

main :: IO ()
main = do
    a <- readLn
    b <- readLn
    c <- readLn
    printf "NUMBER = %d\n" (a :: Int)
    printf "SALARY = U$ %.2f\n" (b * c :: Double)
