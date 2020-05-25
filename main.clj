(clojure.pprint/pprint
  (map vector
    (range 25)
    (cycle [:fizz :_ :_])
    (cycle [:buzz :_ :_ :_ :_])))