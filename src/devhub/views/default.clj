(ns devhub.views.default
    (:require [hiccup.page :refer [html5]]))

(defn get-index [request authorize-url pages]
        (if-let [name (-> request :session :user :displayName)]
            (str "Hello " name "! <a href='/logout'>Log out</a>")
            (str "<a href='" authorize-url "'>Login with SPiD</a>")))
    

(defn get-source [pages]
    (clojure.string/join (map vector (vals (pages)))))

