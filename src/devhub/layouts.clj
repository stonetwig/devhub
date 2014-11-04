(ns devhub.layouts
  (:require [clostache.parser :as cp]))

(defn layout-page [page & [authorize-url request]]
  (if request
    (if-let [name (-> request :session :user :displayName)]
      (cp/render-resource "templates/layout.mustache" {:page page :login (str "Hello " name "! <a href='/logout' class='btn btn-danger'>Log out</a>")})
      (cp/render-resource "templates/layout.mustache" {:page page :login (str "<a href='" authorize-url "' class='btn btn-success'>Login with SPiD</a>")}))
    (cp/render-resource "templates/layout.mustache" {:page page :login ""})))
