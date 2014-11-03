(ns devhub.views.default
    (:require [hiccup.page :refer [html5]]))

(defn get-index [request authorize-url]
        (if-let [name (-> request :session :user :displayName)]
            (str "Hello " profile_name "! <a href='/logout'>Log out</a>")
            (str "<a href='/" authorize-url "'>Login with SPiD</a>")))

