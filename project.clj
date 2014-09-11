(defproject org.clojars.zh217/zmq-async "0.1.0"
            :description "ZeroMQ 3 library for Clojure"
            :url "https://github.com/lynaghk/zmq-async"
            :license {:name "BSD" :url "http://www.opensource.org/licenses/BSD-3-Clause"}

            :min-lein-version "2.0.0"

            :global-vars {*warn-on-reflection* true}

            :dependencies [[org.clojure/clojure "1.6.0"]
                           [com.keminglabs/jzmq "a6c1706"]
                           [com.keminglabs/jzmq-osx64 "a6c1706"]
                           [com.keminglabs/jzmq-linux64 "a6c1706"]
                           [com.taoensso/timbre "3.3.1"]

                           [org.clojure/core.match "0.2.2"]
                           [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]]

            :profiles {:dev {:source-paths ["dev"]
                             :dependencies [[midje "1.6.3"]]}})