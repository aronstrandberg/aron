(ns as.home
  (:require [as.components :refer [container intro heading section text link footer]]))

(defn header []
      [intro
       [heading "Aron Strandberg"]])

(def about-text
  "I'm a software developer from Stockholm, Sweden.
  I'm currently pursuing a Master's degree in computer science at the Royal Institute of Technology.
  Besides programming, I'm interested in fashion, photography, and bartending.")

(defn about []
      [section
       [heading "About me"]
       [text about-text]])

(def work-text)


(defn work []
      [section
       [heading "Work"]
       [text   "Currently, I'm working with digital health care at " [link {:href "http://kry.se"} "Kry"] ".
  Previously, I've worked with financial APIs at " [link {:href "http://www.trioptima.com"} "TriOptima"] ",
  and university recruitment solutions at " [link {:href "http://sqore.com"} "Sqore"] ".
  Besides software development, I've also worked as a bartender, art director, and team leader at DKM,
  and as a photographer at " [link {:href "http://osqledaren.se"} "Osqledaren"] "."]])

(def studs-text
  (str "I served as Art Director for the student project " [link {:href "http://studieresan.se"} "Studs"] " in 2018.
  As part of the project's design team, I helped develop the graphical profile, designed print work,
  and designed and developed a React frontend for " [link {:href "http://studieresan.se"} "studieresan.se"] "."))

(defn studs []
      [section
       [heading "Projects — Studs"]
       [text studs-text]])

(def izumi-text
  (str [link {:href "http://izumi.netlify.com"} "Izumi"] " is a Tabata timer.
  Unable to find a decent Tabata timer for HIIT training, I set out to create my own.
  Izumi is built using React and Redux."))

(defn izumi []
      [section
       [heading "Projects — Izumi"]
       [text izumi-text]])

(defn home-page []
      [container
       [header]
       [about]
       [work]
       [studs]
       [izumi]
       [footer]])
