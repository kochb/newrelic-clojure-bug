(defproject newrelic "0.0.0"
  :description "New Relic error demo"
  :min-lein-version "2.0.0"
  :url "https://github.com/kochb/newrelic-clojure-bug"
  :java-agents [[com.newrelic.agent.java/newrelic-agent "3.1.1"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.2.1"]]
  :main newrelic.core)

