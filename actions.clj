
(ns actions)

(defn look-around []
  (keys (ns-publics @user/where-am-i))
)


(defn run-to [where]
  (reset! user/where-am-i where)
  ))
