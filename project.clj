(defproject alexeypopov/baking-soda-material-ui "0.0.4-SNAPSHOT"
  :description "baking-soda-material-ui is an interface between clojurescript's reagent
                and material-ui"
  :url "https://github.com/alexeypopov/baking-soda-material-ui"
  :license {:name "MIT"}
  :scm {:name "git"
        :url  "https://github.com/alexeypopov/baking-soda-material-ui"}

  :min-lein-version "2.5.3"

  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [org.clojure/clojurescript "1.10.339"]
   [cljsjs/react "16.4.1-0"]
   [cljsjs/react-dom "16.4.1-0"]
   [reagent "0.8.1" :exclusions [cljsjs/react
                                 cljsjs/react-dom]]
   [cljsjs/material-ui "1.2.1-1" :exclusions [cljsjs/react
                                                      cljsjs/react-dom]]])
