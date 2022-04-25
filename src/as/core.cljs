(ns as.core
  (:require
   [reagent.core :as r]
   [as.home :refer [home-page]]))

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
