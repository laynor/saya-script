(ns saya-script.core
  (:require
   [cljsjs.draft-js]
   [rum.core :as rum]))

(rum/defc hello-world
  []
  [:div "Hello, world."])

(rum/defc draft < rum/reactive
  [state]
  [:div.editor
  (js/React.createElement js/Draft.Editor
                          #js {:editorState (rum/react state)
                               :onChange (fn [new-state] (reset! state new-state))})])

(def draft-state (atom (js/Draft.EditorState.createEmpty)))

(defn init!
  []
  (rum/mount (draft draft-state) js/document.body))
