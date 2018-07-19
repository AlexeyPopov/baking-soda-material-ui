(ns baking-soda-material-ui.material-ui-icons
  (:require-macros
   [baking-soda-material-ui.material-ui-svg-icons :refer [export-material-ui-svg-icon-components]])
  (:require
   cljsjs.material-ui
   cljsjs.material-ui-svg-icons
   [reagent.core]))

(export-material-ui-svg-icon-components)

