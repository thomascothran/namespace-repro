(ns user
  (:require [clojure.tools.namespace.repl :refer (refresh)]
            [myns.core]))

(defn use-some-value []
  myns.core/test-value)
