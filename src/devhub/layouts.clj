(ns devhub.layouts
  (:require [hiccup.page :refer [html5]]))

(defn layout-page [page]
  (html5
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport"
            :content "width=device-width, initial-scale=1.0"}]
    [:title "Developer Hub"]
    [:link {:rel "stylesheet" :href "/styles/styles.css"}]]
   [:body
    [:div.logo "developers.schibsted.com"]
    [:div.menu]
    [:div.body page]]))
