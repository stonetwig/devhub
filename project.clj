(defproject devhub "0.1.0-SNAPSHOT"
    :description "FIXME: write description"
    :url "http://example.com/FIXME"
    :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
    :dependencies [[org.clojure/clojure "1.6.0"]
                [stasis "2.2.0"]
                [ring "1.2.1"]
                [hiccup "1.0.5"]
                [me.raynes/cegdown "0.1.1"]
                [compojure "1.1.3"]
                [clj-http "0.7.9"]
                [cheshire "5.3.1"]
                [spid-client-clojure "1.0.0"]]
     :ring {:handler devhub.web/app}
     :profiles {:dev {:plugins [[lein-ring "0.8.10"]]
                      :resource-paths ["config"]}})
