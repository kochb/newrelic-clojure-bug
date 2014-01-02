(ns newrelic.core
  (:require [ring.adapter.jetty :as ring]))

(def app (fn [request]
  (throw (Exception. "New relic should see me!"))))

(ring/run-jetty app {:port 8000})

