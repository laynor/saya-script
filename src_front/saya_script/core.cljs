(ns saya-script.core
  (:require
   [rum.core :as rum]))

(rum/defc hello-world
  []
  [:div "Hello, world."])

(defn init!
  []
  (rum/mount (hello-world) js/document.body))
