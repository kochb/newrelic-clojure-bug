(ns newrelic.core
  (:require [ring.adapter.jetty :as ring]))

(def app (fn [request]
  {:status 200 :body "New relic should see this!"}))

(ring/run-jetty app {:port 8000})

