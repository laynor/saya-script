(ns saya-script.main.init
  (:require
    [cljs.nodejs :as nodejs]
    [saya-script.main.core :as core]))

(nodejs/enable-util-print!)

(def start-electron!
  (fn []
    (reset! core/window nil)
    (core/init!)))

(set! *main-cli-fn* start-electron!)
