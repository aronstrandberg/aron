(ns as.components
  (:require
   [reagent.core :as r]
   [cljss.reagent :refer-macros [defstyled]]))

;; (def text-color "#f8f9f8")
(def background "#fdf8f4")

;; (def background "#f92b28")

(def text-color "#fd4656")

(def link-color text-color)

(defstyled container :div
  {:width "100%"
   :min-height "100vh"
   :display "flex"
   :flex-direction "column"
   :justify-content "center"
   :align-items "center"
   :background-color background})

(defstyled section :div
  {:flex "1"
   :width "90%"
   :max-width "40rem"
   :display "flex"
   :flex-direction "column"
   :align-items "flex-start"
   :justify-content "center"
   :text-align "left"})

(defstyled heading :h4
  {:text-transform "uppercase"
   :font-weight 400
   :letter-spacing "0.05em"
   :text-align "left"
   :color text-color})

(defstyled text :p
  {:font-size "1rem"
   :line-height 1.6
   :color text-color
   :text-align "left"
   :margin 0})

(defstyled link :a
 {:color link-color
  :border-bottom (str "1px solid" link-color)
  :&:hover {:border-color link-color}})

(defstyled intro :div
  {:height "20vh"
   :display "flex"
   :flex-direction "column"
   :justify-content "center"
   :align-items "center"})

(defstyled f :div
  {:margin "3rem 0"
   :width "100%"
   :display "flex"
   :justify-content "center"
   :text-align "center"})

(defn footer []
      [section
       [f {:dangerouslySetInnerHTML {:__html "&times;"}}]])

