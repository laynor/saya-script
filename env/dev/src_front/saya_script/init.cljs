(ns saya-script.init
  (:require
    [saya-script.core :as core]))

(enable-console-print!)

(defn start-front!
  []
  (core/init!))

(start-front!)
