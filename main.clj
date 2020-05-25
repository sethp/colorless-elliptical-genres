

(def where-am-i (atom 'bridge))

(defn look-around []
  (keys (ns-publics @where-am-i))
)

(defn run-to [where]
  (reset! where-am-i where)
  )

(defn what-do [] 
  "you've got to combubulate the fizzwidget in engineering!"
  )


(ns bridge
  (:use actions where-am-i look-around run-to))

(defn ship-state []
  "not on fire, yet"
  )

(ns engineering
  (:use actions where-am-i look-around run-to))
(defn combubulate [what]
  (if (= what "fizzwidget") 
    "next: flucate the static"
  ))


(in-ns 'bridge)


;; 1. Corpus-backed generator that produces scenarios "fluctuate a static", "sign a lepitosebium", "buffalo a chrome_yellow", "visit a dancing school"
;; 2. Random game themes like "a dolphin composes music to win over their allies from independence day" 

;; (keys (ns-publics) 'user) - gives us all callable methods from our userspace