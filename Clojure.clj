(let [num1 (do (Integer/parseInt (read-line)))
     num2 (do (Integer/parseInt (read-line)))
     num3 (do (Double/parseDouble (read-line)))] 
  (println "NUMBER ="num1)
  (print "SALARY = U$ ")
  (println (format "%.2f" (* num2 num3 ))))
