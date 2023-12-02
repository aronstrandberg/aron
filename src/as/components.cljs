(ns as.components
  (:require
   [reagent.core :as r]
   [cljss.reagent :refer-macros [defstyled]]))

(def text-color "#f8f9f8")
(def background "#f92b28")

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

(defn header []
  [intro
   [heading "Aron Strandberg"]])

(defn about []
  [section
   [heading "About me"]
   [text "I'm a software developer from Stockholm, Sweden. I'm currently pursuing a Master's degree in computer science at the Royal Institute of Technology. Besides programming, I'm interested in fashion, photography, and bartending."]])

(defn link [href title] [:a {:href href} title])

(defn work []
  [section
   [heading "Work"]
   [text
     "Currently, I help make the insurance industry open and transparent, at " [link "insurely.com" "Insurely"] ".
     Previously, I've helped make cognitive behavioural therapy a digital thing at " [link "kry.se" "Kry"] ",
     with financial APIs at " [link "trioptima.com" "TriOptima"] ",
     and with university recruitment solutions at " [link "sqore.com" "Sqore"] ".
     Besides software development, I've also worked as a bartender, art director, and team leader at DKM,
     and as a photographer at " [link "http://osqledaren.se" "Osqledaren"] "."]])

(defn studs []
  [section
   [heading "Projects — Studs"]
   [text "I served as Art Director for the student project " [:a {:href "http://studieresan.se"} "Studs"] " in 2018. As part of the project's design team, I helped develop the graphical profile, designed print work, and designed and developed a React frontend for " [:a {:href "http://studieresan.se"} "studieresan.se"] "."]])

(defn izumi []
  [section
   [heading "Projects — Izumi"]
   [text [:a {:href "http://izumi.netlify.com"} "Izumi"] " is a Tabata timer. Unable to find a decent Tabata timer for HIIT training, I set out to create my own. Izumi is built using React and Redux."]])

(defn footer []
  [section
   [f {:dangerouslySetInnerHTML {:__html "&times;"}}]])

(defn home-page []
  [container
   [header]
   [about]
   [work]
   [studs]
   [izumi]
   [footer]])
