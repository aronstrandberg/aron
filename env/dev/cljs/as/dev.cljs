(ns ^:figwheel-no-load as.dev
  (:require
    [as.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
