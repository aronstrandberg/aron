(ns as.components
  (:require
    [reagent.core :as r]
    [cljss.reagent :refer-macros [defstyled]]))

(defn portrait []
  [:img {:src "/images/me.jpg"}])

(defn header []
  [:h1 "Aron Strandberg"])

(defn about []
  [:p "I'm a software developer from Stockholm, Sweden. I'm currently pursuing a Master's degree in computer science at the Royal Institute of Technology. Besides programming, I'm interested in fashion, photography, and bartending."])

(defn heart []
  [:span {:dangerouslySetInnerHTML {:__html "&hearts;"}}])

(defn footer []
  [:p "Made with ", [heart], " in Stockholm"])

(defn home-page []
  [:div
    [portrait]
    [header]
    [about]
    [footer]])
