{:user
  {:plugins [
    [cider/cider-nrepl "0.10.1"]
    [refactor-nrepl "2.0.0-SNAPSHOT"]
    [lein-cljfmt "0.3.0"]
    [lein-pprint "1.1.1"]
    [lein-assoc "0.1.0"]
    [jonase/eastwood "0.0.2"]
    [lein-expectations "0.0.7"]
    [lein-autoexpect "0.2.5"]
    [lein-ancient "0.5.5"]]
  :repl-options {:timeout 300000}
  :aliases {"slamhound" ["run" "-m" "slam.hound"]}
  :dependencies [[slamhound "RELEASE"]
                 ;[clj-stacktrace "0.2.5"]
                 ]
;  :injections [(let [orig (ns-resolve (doto 'clojure.stacktrace require)
;                                       'print-cause-trace)
;                      new (ns-resolve (doto 'clj-stacktrace.repl require)
;                                      'pst)]
;                 (alter-var-root orig (constantly @new)))]
   }
 }
