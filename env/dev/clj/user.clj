(ns user
  (:require [mount.core :as mount]
            clojure-ci-app.core))

(defn start []
  (mount/start-without #'clojure-ci-app.core/http-server
                       #'clojure-ci-app.core/repl-server))

(defn stop []
  (mount/stop-except #'clojure-ci-app.core/http-server
                     #'clojure-ci-app.core/repl-server))

(defn restart []
  (stop)
  (start))


