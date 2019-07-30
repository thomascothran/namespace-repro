(ns user
  (:require [clojure.tools.namespace.repl :refer (refresh)]
            [some-random.place.core :refer [some-test-fn]]))

(defn another-test-fn []
  [(some-test-fn) ::another-value])
