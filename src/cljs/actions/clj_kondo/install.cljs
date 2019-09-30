(ns actions.clj-kondo.install
  (:require ["@actions/exec" :as exec]))

(defn install-and-cache! []
  (exec/exec ["bash <(curl -s https://raw.githubusercontent.com/borkdude/clj-kondo/master/script/install-clj-kondo)"]))
