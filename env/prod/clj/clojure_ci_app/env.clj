(ns clojure-ci-app.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojure-ci-app started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-ci-app has shut down successfully]=-"))
   :middleware identity})
