(ns geth-indexer
  (:require [clj-time.core :as t]
            [clj-time.coerce :as c]))

(defn -main []
  (println "Hello world, the time is" (c/to-string (t/now))))
