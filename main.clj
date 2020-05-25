(dotimes [_ 10]
  (let [greeting "hello" name "kevin"]
  (println (clojure.string/join " " [greeting name]))
  ))