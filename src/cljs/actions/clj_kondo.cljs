(ns actions.clj-kondo
  (:require [actions.clj-kondo.install :refer [install-and-cache!]]
            [promesa.core :as p]
            ["@actions/core" :as core]))

(defn setup! []
  (p/promise
   (try
     (install-and-cache!)
     (catch ExceptionInfo e
       (core/setFailed (ex-message e))))))

(setup!)
